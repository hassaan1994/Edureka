package edurekaactionsandselectpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsAndSelect {



    @Test
    public void AAndSPractice() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.partialLinkText("Create new accou")));
        action.click().build().perform();
        action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
        action.click().sendKeys("Hassaan").build().perform();
        Thread.sleep(2000);
        System.out.println("First Phase");
        action.moveToElement(driver.findElement(By.name("lastname")));
        action.click().sendKeys("Nizam").build().perform();
        System.out.println("Second Phase");
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")));
        action.click().sendKeys("9294028660").build().perform();
        System.out.println("Third Phase");
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.cssSelector("#password_step_input"))).click().sendKeys("Newyorkusa123").build().perform();
        System.out.println("Fourth Phase");
        Thread.sleep(2000);
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByVisibleText("Nov");
        System.out.println("Fifth Phase");
        Thread.sleep(2000);
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(5);
        System.out.println("Sixth Phase");
        Thread.sleep(2000);
        Select year = new Select(driver.findElement(By.cssSelector("#year")));
        year.selectByVisibleText("1994");
        System.out.println("Seventh Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]")).click();
        System.out.println("Eight Phase ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/img[1]")).click();
        System.out.println("Done Alhamdulillah");
        Thread.sleep(2000);
        driver.quit();

    } }

