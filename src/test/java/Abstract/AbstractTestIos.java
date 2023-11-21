package Abstract;

import DriverFactory.DriverFactoryIos;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class AbstractTestIos {

    public  IOSDriver driver;
    private  DriverFactoryIos driverFactory = new DriverFactoryIos();

    @Before
    public void setDriver() throws MalformedURLException {
        driverFactory = new DriverFactoryIos();
        driver = driverFactory.setUp();

    }
    @After
    public void tearDown() {
        driver.quit();
    }

}
