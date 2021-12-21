package edurekapractice;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class TestGrid {
    static WebDriver driver;
    static String nodeUrl;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        nodeUrl = "http://192.168.239.1:4444/wd/hub";
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setBrowserName("chrome");
        //capabilities.setPlatform(Platform.WIN10);
        EdgeOptions options = new EdgeOptions();
        driver = new RemoteWebDriver(new URL(nodeUrl), options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        System.out.println("The title is " + driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
        System.out.println("Test Passed");

    }

}
