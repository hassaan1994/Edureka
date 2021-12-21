package edurekacrossbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CrossBrowserTesting {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void browserSetup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\geckodriver-v0.29.1-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if (browser.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        else{throw new Exception("Browser is not correct");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void quadBrowserTestingWithXML() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.printf("The Title Is: "+ driver.getTitle());
        System.out.println("Test Passed");
        driver.quit();

    }

}
