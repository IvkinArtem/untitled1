package Android;

import Abstract.AbstractTestAndroid;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class RegTest extends AbstractTestAndroid {
    @AndroidFindBy(accessibility = "Predicted app: Qa.Shop")
    WebElement openApp;
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Register\"]")
    WebElement el1;
    @AndroidFindBy(id = "com.anydog.t2m.test:id/btnSubmit")
    WebElement close;

    @Test
    public void sampleTest() {
        //WebElement openApp = driver.findElementByAccessibilityId("Predicted app: Qa.Shop");
        openApp.click();

        //WebElement el1 = driver.findElement(By.xpath("//android.widget.Button[@text=\"Register\"]"));
        el1.click();

        //WebElement close = driver.findElement(By.id("com.anydog.t2m.test:id/btnSubmit"));
        close.isDisplayed();
        close.click();
    }

}