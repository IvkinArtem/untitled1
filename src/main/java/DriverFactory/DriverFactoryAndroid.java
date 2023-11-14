package DriverFactory;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.*;


public class DriverFactoryAndroid {
    private AndroidDriver driverAndroid;

    @Before
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554");
        desiredCapabilities.setCapability(APP_PACKAGE, "com.android.settings");
        desiredCapabilities.setCapability(APP_ACTIVITY, "com.android.settings.Settings");
//        desiredCapabilities.setCapability(APP, "/Users/artemivkin/Downloads/Skillbox/app-debug.apk");


        URL remoteUrl = new URL("http://localhost:4723/");



        driverAndroid = new AndroidDriver(remoteUrl, desiredCapabilities);
        return driverAndroid;
    }
}
