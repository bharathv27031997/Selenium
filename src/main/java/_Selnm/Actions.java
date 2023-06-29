package _Selnm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.Scanner;

public class Actions extends BaseFunction{
    private static final String BASE_PATH = "https://www.firstcry.com";
     WebDriver driver;

    @Test
    public void alertOkTab() throws InterruptedException {

        driver = BaseFunction.setProperty();
        BaseFunction.load(BASE_PATH);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        org.openqa.selenium.interactions.Actions act=new org.openqa.selenium.interactions.Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),' BOY FASHION')]"))).click().build().perform();
    }
    @Test
    public void academy() throws InterruptedException {

        driver = BaseFunction.setProperty();
        Scanner sc=new Scanner(System.in);
        BaseFunction.load("https://unacademy.com/");
        org.openqa.selenium.interactions.Actions act=new org.openqa.selenium.interactions.Actions(driver);
        driver.findElement(By.xpath(
                "//button[@class='e13239452 aquilla-button button css-w0paca-NewLoginCTA']")).click();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath(
                "//div[@variant='determinate']/input[@class='MuiInputBase-input MuiOutlinedInput-input']"));
        email.sendKeys("prbhakarbharath63@gmail.com");
        try {
            driver.findElement(By.xpath("//div[contains(text(),'Request OTP')]")).click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[contains(text(),'Request OTP')]")));
         }
        Thread.sleep(50000);
        System.out.println("Enter The OTP");
        String otp=sc.next();
        WebElement otpEle = driver.findElement(By.xpath(
                "//input[@placeholder='One time password']"));
        otpEle.sendKeys(otp);
        otpEle.submit();

    }
}
