package seleniumgrid;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridPractice {
    public static void main(String[] args) throws MalformedURLException {


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("firefox");
        cap.setPlatform(Platform.WIN10);
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.239.1:4444/wd/hub"),options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }


}
