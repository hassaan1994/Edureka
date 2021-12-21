package seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Node2 {


    @Test
    public void testNode2() throws MalformedURLException {
        String baseUrl = "https://www.facebook.com/";
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        String hubUrl = "http://192.168.239.1:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl),cap);
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
