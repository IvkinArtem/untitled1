package Abstract;

import DriverFactory.DriverFactoryIos;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;

import java.net.MalformedURLException;

public class AbstractTestIos {

    public IOSDriver driver;
    private DriverFactoryIos driverFactory = new DriverFactoryIos();

    @BeforeEach
    public void setDriver() throws MalformedURLException {
        driver = driverFactory.setUp();

    }
    @After
    public void tearDown() {
        //driver.quit();
    }

}
