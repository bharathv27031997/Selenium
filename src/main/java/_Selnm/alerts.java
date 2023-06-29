package _Selnm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class alerts {
    private static final String BASE_PATH = "https://demo.automationtesting.in/Alerts.html";
 WebDriver driver;
    @Test
    public void alertOkTab() throws InterruptedException {

        driver = BaseFunction.setProperty();
        BaseFunction.load(BASE_PATH);
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        Thread.sleep(5000);
       WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(button));
        button.click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
      }
    @Test
    public void alertOkTabAndCancel() throws InterruptedException {

        driver = BaseFunction.setProperty();
        BaseFunction.load(BASE_PATH);
        driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
        driver.findElement(By.xpath(
                "//button[contains(text(), 'click the button to display an  alert box')]")).click();
        driver.switchTo().alert().accept();
      }
    @Test
    public void alertWithTextBox() throws InterruptedException {

        driver = BaseFunction.setProperty();
        BaseFunction.load(BASE_PATH);
        driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
        driver.findElement(By.xpath(
                "//button[contains(text(), 'click the button to demonstrate the prompt box')]")).click();
        driver.switchTo().alert().sendKeys("Automation Testing user");
        driver.switchTo().alert().accept();
       }

}
