package _Selnm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class switchFrame {

    private static final String BASE_PATH = "https://demo.guru99.com/selenium/deprecated.html";
    private static final String DRIVER_PATH = "C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\chromedriver_win32\\chromedriver.exe";
    private ChromeDriver driver;

    public ChromeDriver setProperty() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        return  driver = new ChromeDriver();
    }
    public void load() {
        driver.get(BASE_PATH);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
    }

    @Test
    public void switchTabs(){

        setProperty();
        load();

        try{
            switchFrame("classFrame", "Package");
            switchFrame("Index","Tree");
        }catch (Exception e){
            System.out.println(e);
        }finally {
//            driver.quit();
        }
    }

    public void switchFrame(String nameOrId, String frameName)
    {
        driver.switchTo().frame(nameOrId);
        WebElement ele  = driver.findElement(By.linkText(frameName));
        ele.click();
        System.out.println(ele.getText());

    }
}
