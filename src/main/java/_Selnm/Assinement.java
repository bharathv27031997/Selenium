package _Selnm;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Assinement {
    private WebDriver driver;
    @After
    public void afterTest(){
//        driver.quit();
    }

    @Test
    public void assinemet1() throws InterruptedException {

        //        Assignment-1
        //        TASK STEPS:
        //        url:          https://www.bing.com/
        //        1.	Load the URL, and maximize it
        //        2.	Click on images link, and check the number of images on that page
        //        3.	Close the page.
        driver = BaseFunction.setProperty();
        BaseFunction.load("https://www.bing.com/");
        Thread.sleep(5000);
        List<WebElement> imgLink = driver.findElements(By.xpath("//span[@class='crs_item ']"));
        for(WebElement tag :imgLink){
            System.out.println(tag.getText());
        }
        System.out.println(imgLink.size());

    }
    @Test
    public void assinement() throws InterruptedException {

        //    Assignment-2
        //
        //    Url:       https://www.bing.com/
        //    1.	Load the url and maximize it.
        //    2.	Search for the WebElement, text-field.
        //    3.	Enter Capgemini India in the search bar and submit it.
        //    4.	Find the address of office and print it on console.
        //    5.	Close the Browser
        driver = BaseFunction.setProperty();
        BaseFunction.load("https://www.bing.com/");
        Thread.sleep(1000);
        BaseFunction.findElementById("sb_form_q", "Capgemini India");
        WebElement address = driver.findElement(By.xpath("//div[contains(text(),'CAPGEMINI Knowledge Park IT')]"));
        System.out.println(address.getText());
    }
    @Test
    public void assinement3() throws InterruptedException {

        //        Assignment-3
        //        Url:       https://www.bing.com/
        //        1.	Load the url and maximize it.
        //        2.	Find all the links present on the webpage
        //        3.	Traverse Over all the links and print its Texts
        driver =BaseFunction. setProperty();
        BaseFunction.load("https://www.bing.com/");
        Thread.sleep(1000);
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        for(WebElement tg:tags){
            System.out.println(tg.getAttribute("href"));
            System.out.println(tg.getText());
        }
    }
    @Test
    public void assinement5() throws InterruptedException {

        //        Assignment 5  (Waits)
        //        Open the url http://www.google.com
        //        In the search text enter Apple
        //        Add Explicit wait, with a condition that first link become clickable
        //        Hint: ExpectedConditions.elementToBeClickable
        driver = BaseFunction.setProperty();
        BaseFunction.load("http://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        ele.sendKeys("Apple");
        ele.submit();
        List<WebElement> tag =  driver.findElements(By.tagName("a"));
        for(WebElement anchorTag:tag){
            wait.until(ExpectedConditions.elementToBeClickable(anchorTag));
            wait.ignoring(NoSuchElementException.class);
            System.out.println(anchorTag);
        }
    }
}
