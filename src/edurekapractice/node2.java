package edurekapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class node2 {
    WebDriver driver;
    String nodeUrl;
    @Test
    public void f() throws MalformedURLException, InterruptedException {
        nodeUrl="http://192.168.239.1:30402/wd/hub";
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setBrowserName("chrome");
        //capabilities.setPlatform(Platform.WIN10);
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(nodeUrl), options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        System.out.println("The title is " + driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
    }
}
