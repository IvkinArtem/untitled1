import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.*;


public class DriverFactory {
    private IOSDriver driver;

@Before
    public IOSDriver setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("automationName", "XCUITest");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
//        desiredCapabilities.setCapability(DEVICE_NAME, "emulator-5554"); // Android
//        desiredCapabilities.setCapability(APP_PACKAGE, "com.google.android.dialer");
//        desiredCapabilities.setCapability(APP_ACTIVITY, "com.google.android.dialer.extensions.GoogleDialtactsActivity");
//        desiredCapabilities.setCapability(APP, "/Users/artemivkin/Downloads/Skillbox/app-debug.apk");

        desiredCapabilities.setCapability(DEVICE_NAME, "iPhone 12 Pro Max");
        desiredCapabilities.setCapability(PLATFORM_VERSION, "14.5");
        desiredCapabilities.setCapability(UDID, "6EED8375-2D9A-4CA9-A5CA-46D0A4E20103");
        desiredCapabilities.setCapability(APP_PACKAGE, "com.apple.MobileAddressBook");

        URL remoteUrl = new URL("http://localhost:4723/");//wd/hub



        driver = new IOSDriver(remoteUrl, desiredCapabilities);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
