package edurekapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import javax.swing.*;

public class PracticingActionAndRobotClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumframework.com/practiceform/");
        Actions action = new Actions(driver);
        WebElement SourceElement = driver.findElement(By.xpath("//button[@id='draga']"));
        WebElement TargetElement = driver.findElement(By.xpath("//button[@id='dragb']"));
        action.dragAndDrop(SourceElement,TargetElement).build().perform();
        Thread.sleep(2000);
        System.out.println("Test Passed");
        driver.quit();
    }
}
