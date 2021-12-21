package edurekapractice;

import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestAutomation {
    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup (String browser) throws Exception {
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        }
        else {throw new Exception ("Browser is not found");
        }}

        @Test
        public void testParameterWithXML() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hassaannizam1994@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sethqayoom7462159");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='u_0_h_V2']")).click();
        Thread.sleep(2000);
        driver.quit();
    }}


