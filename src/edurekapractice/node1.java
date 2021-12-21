package edurekapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class node1 {

    WebDriver driver;
    String nodeUrl;
    @Test
    public void f() throws MalformedURLException, InterruptedException {
        nodeUrl="http://192.168.239.1:30402/wd/hub";
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setBrowserName("chrome");
        //capabilities.setPlatform(Platform.WIN10);
        FirefoxOptions options = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL(nodeUrl), options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        System.out.println("The title is " + driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
    }
}
