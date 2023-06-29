package _Selnm;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class wait {

    private WebDriver driver;

    @After
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void implicityWait() throws InterruptedException {

        //        Assignment-3
        //        Url:       https://www.bing.com/
        //        1.	Load the url and maximize it.
        //        2.	Find all the links present on the webpage
        //        3.	Traverse Over all the links and print its Texts
        driver = BaseFunction.setProperty();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        BaseFunction.load("https://www.bing.com/");
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        for (WebElement tg : tags) {
            System.out.println(tg.getAttribute("href"));
            System.out.println(tg.getText());
        }
    }

    @Test
    public void explicityWait() throws InterruptedException {

        driver = BaseFunction.setProperty();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        BaseFunction.load("https://www.bing.com/");
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        for (WebElement tg : tags) {
            wait.until(ExpectedConditions.visibilityOf(tg));
            System.out.println(tg.getAttribute("href"));
            System.out.println(tg.getText());
        }
    }

    @Test
    public void fluentWait() throws InterruptedException {

        driver = BaseFunction.setProperty();
        Wait<Duration> wait = new FluentWait<>(Duration.ofSeconds(10));
        BaseFunction.load("https://www.bing.com/");
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        for (WebElement tg : tags) {
            ((FluentWait<?>) wait).withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofSeconds(10))
                    .ignoring(NoSuchElementException.class);
            System.out.println(tg.getAttribute("href"));
            System.out.println(tg.getText());
        }
    }

    @Test
    public void test() {
        int[] arr = {10, 20, 35,35};
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum = evenNum + arr[i];
            }
        }
            System.out.println("The Sum of even Number is :" + evenNum);
         Arrays.asList(10, 20, 35,35).stream()
                .filter(s->s%2==0).mapToInt(Integer::intValue);
     }




    }
