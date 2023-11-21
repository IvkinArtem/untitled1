package DriverFactory;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.IOSMobileCapabilityType.BUNDLE_ID;
import static io.appium.java_client.remote.MobileCapabilityType.*;

public class DriverFactoryIos {
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
        desiredCapabilities.setCapability(DEVICE_NAME, "iPhone 15 Pro");
        desiredCapabilities.setCapability(PLATFORM_VERSION, "17.0.1");
        desiredCapabilities.setCapability(UDID, "2A7A2970-635B-4968-AABA-D325961C7D9D");
        desiredCapabilities.setCapability(BUNDLE_ID, "ru.lifemart.ios");

        URL remoteUrl = new URL("http://localhost:4723/");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
