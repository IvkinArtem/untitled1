import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegTest extends AbstractTest{

    @Test
    public void sampleTest() {
        WebElement openApp = (WebElement) driver.findElementByAccessibilityId("Predicted app: Qa.Shop");
        openApp.click();

        WebElement el1 = (WebElement) driver.findElement(By.xpath("//android.widget.Button[@text=\"Register\"]"));
        el1.click();

        WebElement close = (WebElement) driver.findElement(By.id("com.anydog.t2m.test:id/btnSubmit"));
        close.isDisplayed();
        close.click();
    }

}