package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
public class TestBase {


    public static WebDriver driver = null;

    @BeforeSuite
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @AfterSuite
    public void afterMethod(){
        driver.quit();
    }

}
