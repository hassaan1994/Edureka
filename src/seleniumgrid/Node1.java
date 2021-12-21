package seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Node1 {

    @Test
    public void testNode() throws MalformedURLException {
        String baseUrl = "https://www.amazon.com/";
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        String hubUrl = "http://192.168.239.1:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
