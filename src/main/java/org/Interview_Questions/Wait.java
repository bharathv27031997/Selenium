package org.Interview_Questions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Wait {

    @Test
    public void implicityWait() throws AWTException {


        //Explicity Wait
        WebDriver driver=new FirefoxDriver();
//        WebDriverWait wait=new WebDriverWait(driver, 10);
//        wait.until(expectedCondition.visiblityOfElementLocated(Webelement));

        //Implicity Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Java ScriptExecutor
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("Window.scrollBy(0, 100");

        //To FInd the All the Elements
       List<WebElement> lst= driver.findElements(By.tagName("a"));
       for(WebElement ele:lst){
           System.out.println("link ::"+ele.getAttribute("href"));
          }
        Robot rt =new Robot();
       rt.keyPress((KeyEvent.VK_CONTROL));
     }
}
