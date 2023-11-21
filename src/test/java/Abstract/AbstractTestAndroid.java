package Abstract;

import DriverFactory.DriverFactoryAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;

public class AbstractTestAndroid {

    public AndroidDriver driver;
    private DriverFactoryAndroid driverFactoryAndroid = new DriverFactoryAndroid();

    @BeforeEach
    public void setDriver() throws MalformedURLException {
        System.out.println("this");
        driver = driverFactoryAndroid.setUp();

    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
