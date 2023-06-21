package Selenium;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    private WebDriver driver;
    private static final String BASE_PATH  = "https://www.wikipedia.org/";
    private static final String DRIVER_PATH  = "C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\chromedriver_win32\\chromedriver.exe";

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();

    }

    @Test
    public void dragAndDrop() {

        try {
            driver.manage().timeouts();
            driver.manage().window().maximize();
            driver.navigate().to(BASE_PATH);
            String title = driver.getTitle();
            driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("NASDAQ");
            driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
            System.out.println(driver.getTitle());
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 1)");
            System.out.println(" title ::" + title);
            Assert.assertEquals("Wikipedia", title);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            driver.quit();
        }
    }

    @Test
    public void scrollAction(){

        try{
            driver.manage().window().maximize();
            driver.get(BASE_PATH);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 100)");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            driver.quit();
        }
    }

    @Test
    public void takeScreenShot() throws IOException {

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\Screenshot (2).png"));
    }

    @Test
    public void scrollUsingKeys() throws AWTException {
        System.setProperty("webdriver.driver.chromedriver", DRIVER_PATH);
        WebDriver driver =new ChromeDriver();
        driver.get(BASE_PATH);
        Actions act=new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN).perform();
        act.sendKeys(Keys.PAGE_DOWN).perform();
        driver.quit();
    }

    // How to send ALT/SHIFT/CONTROL keys simultaneously in Selenium WebDriver?
    @Test
    public void sendTextByPressKeys(){
        Actions act=new Actions(driver);
        act.keyDown(Keys.ALT).keyDown(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("Test");
    }

    @Test
    public void identityHiddenElement(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementsByClassName(locator).click()");
        js.executeScript("window.scrollBy(0,50)");
         js.executeScript("doc.getElementsByName(name).removeAttribute('disabled')");
     }



}
