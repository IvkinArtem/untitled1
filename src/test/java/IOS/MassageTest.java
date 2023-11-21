package IOS;

import Abstract.AbstractTestIos;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class MassageTest extends AbstractTestIos {
    @Test
    void test() throws InterruptedException{
        Thread.sleep(Long.parseLong("5000"));
        WebElement firstMassage = driver.findElementByAccessibilityId("+1 (888) 555-1212");
        firstMassage.isDisplayed();
    }
}
