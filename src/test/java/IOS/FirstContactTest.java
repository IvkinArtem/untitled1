package IOS;

import Abstract.AbstractTestIos;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FirstContactTest extends AbstractTestIos {
    @Test
    public void firstContact() {
        WebElement contacts = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Contacts']"));
        contacts.isDisplayed();

        WebElement firstContact = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeCell[@name=\"John Appleseed\"]"));
        firstContact.click();
        //WebElement massage = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"message\"])[2]"));
        WebElement mail = (WebElement) driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"mail\"])[1]"));
        mail.isEnabled();
    }
}
