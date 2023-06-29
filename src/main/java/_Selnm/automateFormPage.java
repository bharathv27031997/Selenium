package _Selnm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.datatype.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class automateFormPage  {

    private ChromeDriver driver;
    private WebElement search;
    private List<WebElement> anchorTags;
    private static final String BASE_PATH = "https://demo.automationtesting.in/Register.html";
    private static final String DRIVER_PATH = "C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\chromedriver_win32\\chromedriver.exe";
    private static final String ADDRESS = "Hosamane[Village], Medi Malla Sandra[Post], Kadugodi[VIA], Hosakote[Taluk], Banglore Rural District";

    public ChromeDriver setProperty() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        return  driver = new ChromeDriver();

    }
    public void load() {
        driver.get(BASE_PATH);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    @Test
    public void loginPage(){

        driver =  setProperty();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            load();
            findElement("//input[@placeholder='First Name']", "Bharath");
            findElement("//input[@placeholder='Last Name']", "V");
            findElement("//textarea[@rows='3']", ADDRESS);
            findElement("//input[@type='email']", "prabhakarbharath63@gmail.com");
            findElement("//input[@type='tel']", "7026157124");
            radioButtons(driver, "//input[@type='radio']", "Male");
            radioButtons(driver, "//input[@type='checkbox']", "Cricket");
            radioButtons(driver, "//input[@type='checkbox']", "Movies");
            radioButtons(driver, "//input[@type='checkbox']", "Hockey");
            js.executeScript("window.scrollBy(0, 500)");


            //selecting Language English
            driver.findElement(By.xpath("//div[@id='msdd']")).click();
            driver.findElement(By.xpath("//a[contains(text(), 'English')]")).click();
            driver.findElement(By.xpath("//a[contains(text(), 'German')]")).click();
            driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]")).click();


            //Selecting Skills
            selectFromDropdown("//select[@id='Skills']").selectByVisibleText("HTML");

            selectFromDropdown("//select[@id='yearbox']").selectByVisibleText("1997");
            selectFromDropdown("//select[@placeholder='Month']").selectByVisibleText("February");
            selectFromDropdown("//select[@placeholder='Day']").selectByVisibleText("27");

            //Setting Password
            findElement("//input[@id='firstpassword']", "1MJ15me@145");
            findElement("//input[@id='secondpassword']", "1MJ15me@145");


            uploadFile("imagesrc", "C:\\Users\\bv10\\OneDrive - Capgemini\\Desktop\\Capgemini Docs\\Photo_Blue_Background.png");
            driver.findElement(By.id("submitbtn")).submit();

        }catch (Exception e){
            System.out.println(e);
        }finally {
//            driver.quit();
        }




    }

    public void uploadFile(String xpath, String filePath){
        WebElement ele =driver.findElement(By.id(xpath));
        ele.sendKeys(filePath);
        ele.submit();

    }

    public void radioButtons(WebDriver driver, String xPath, String buttonType){
        List<WebElement> radio = driver.findElements(By.xpath(xPath));
        Iterator<WebElement> itr=radio.iterator();
        while(itr.hasNext()){
            WebElement ele = itr.next();
            if(ele.getAttribute("Value").equals(buttonType)){
                ele.click();
                break;
            }
        }
    }

    public void findElement(String xpath, String sendKeys){
        WebElement ele = driver.findElement(By.xpath(xpath));
        ele.sendKeys(sendKeys);
        ele.submit();
    }
    public Select selectFromDropdown(String xpath){

        driver.findElement(By.xpath(xpath)).click();
        return  new Select(driver.findElement(By.xpath(xpath)));
    }
}
