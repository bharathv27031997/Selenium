package _Selnm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class switchTabs {

    private static final String BASE_PATH = "https://www.firstcry.com";
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
            openTabs("//a[contains(text(), 'All Categories')]");
            openTabs("//a[contains(text(), 'BOY FASHION')]");
            openTabs("//a[contains(text(), 'GIRL FASHION')]");
            driver.switchTo().parentFrame();

            Set<String> handle =driver.getWindowHandles();
            for(String str:handle){
                driver.switchTo().window(str);
                System.out.println(driver.getTitle());
            }


        }catch (Exception e){
            System.out.println(e);
        }finally {
            driver.quit();
        }
    }

    public void openTabs(String xPath){

        driver.findElement(By.xpath(xPath)).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
    }

}
