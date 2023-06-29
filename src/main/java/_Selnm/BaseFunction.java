package _Selnm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunction {

    public static ChromeDriver driver;
    private WebElement search;
    private List<WebElement> anchorTags;
    private static final String BASE_PATH = "https://www.wikipedia.org/";
    private static final String DRIVER_PATH = "C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\chromedriver_win32\\chromedriver.exe";


    public static ChromeDriver setProperty() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
          driver=new ChromeDriver();
          return driver;
    }
    public static void load(String url) {
        driver.get(url);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     }

    public void search() {
        search =driver.findElement(By.name("q"));
        search.sendKeys("Capgemini India");
        search.submit();

    }
    public static void allAnchorTags() {
       List<WebElement> anchorTags =driver.findElements(By.tagName("a"));
         for(WebElement ele:anchorTags){
             System.out.println(ele.getText().trim());
         }
    }

    public static void findElementById(String xpath, String sendKeys){
        WebElement ele = driver.findElement(By.id(xpath));
        ele.sendKeys(sendKeys);
        ele.submit();
    }
    public void explictyWait(WebElement xpath){
        WebDriverWait wait=new WebDriverWait(this.driver, Duration.ofSeconds(10));
        wait.withTimeout(Duration.ofSeconds(10));
                wait.until(ExpectedConditions.elementToBeClickable(xpath));
    }
}


