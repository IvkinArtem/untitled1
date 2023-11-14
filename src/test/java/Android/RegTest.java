package Android;

import Abstract.AbstractTestAndroid;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegTest extends AbstractTestAndroid {

    @Test
    public void sampleTest() {
        WebElement openApp = (WebElement) driverAndroid.findElementByAccessibilityId("Predicted app: Qa.Shop");
        openApp.click();

        WebElement el1 = (WebElement) driverAndroid.findElement(By.xpath("//android.widget.Button[@text=\"Register\"]"));
        el1.click();

        WebElement close = (WebElement) driverAndroid.findElement(By.id("com.anydog.t2m.test:id/btnSubmit"));
        close.isDisplayed();
        close.click();
    }

}