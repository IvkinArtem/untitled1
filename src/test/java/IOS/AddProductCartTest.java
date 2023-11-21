package IOS;

import DriverFactory.DriverFactoryIos;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class AddProductCartTest {
    @iOSXCUITFindBy(accessibility = "Хочу сделать заказ")
    WebElement wantMakeOrder;
    @iOSXCUITFindBy(accessibility = "Да")
    WebElement addressConfirmation;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS 'Готовые блюда' AND type == 'XCUIElementTypeStaticText'")
    WebElement openCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]")
    WebElement searchProduct;
    @iOSXCUITFindBy(iOSNsPredicate = "name CONTAINS '₽' AND type == 'XCUIElementTypeStaticText'")
    WebElement addProduct;

    public IOSDriver driver;
    private DriverFactoryIos driverFactory;
    @Before
    public void setDriver() throws MalformedURLException {
        driverFactory = new DriverFactoryIos();
        driver = driverFactory.setUp();
    }
    @Test
    void addProductCart() {
        //WebElement wantMakeOrder = driver.findElementByAccessibilityId("Хочу сделать заказ");
        wantMakeOrder.click();

        wait8Sec(MobileBy.AccessibilityId("Да"));
        //WebElement addressConfirmation = driver.findElementByAccessibilityId("Да");
        addressConfirmation.click();

        //WebElement openCategory = driver.findElement(MobileBy.iOSNsPredicateString("name CONTAINS 'Готовые блюда' AND type == 'XCUIElementTypeStaticText'"));
        openCategory.click();
        //WebElement searchProduct = driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]"));
        searchProduct.click();
        //WebElement addProduct = driver.findElement(MobileBy.iOSNsPredicateString("name CONTAINS '₽' AND type == 'XCUIElementTypeStaticText'"));
        addProduct.click();

    }

    private void wait8Sec(By by) {
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
