import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;

public class AbstractTest {

    public IOSDriver driver;
    private DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setDriver() throws MalformedURLException {
        driver = driverFactory.setUp();

    }
    @After
    public void tearDown() {
        //driver.quit();
    }
}
