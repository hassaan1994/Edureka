package datadriventest;

import excelutility.YahooUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class DataProviderTestNg {

    WebDriver driver;

    @BeforeMethod
    public void browserSetUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://login.yahoo.com/account/create?.intl=us&.lang=en-US&src=ym&activity=ybar-mail&pspid=2023538075&add=1&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Fpspid%3D2023538075%26activity%3Dybar-mail&specId=yidReg");

    }
    @DataProvider
    public Iterator<Object[]> getData(){
        ArrayList<Object[]> testData = YahooUtility.getDataFromExcel();
        return testData.iterator();

    }

    @Test(dataProvider = "getData")
    public void yahooSignUpData (String firstname, String lastname, String email, String password, String month, String day, String year, String gender) throws InterruptedException {
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys(firstname);
        System.out.println("First Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]")).sendKeys(lastname);
        System.out.println("Second Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(email);
//            action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")));
//            action.click().sendKeys(email).build().perform();
        System.out.println("Third Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(password);
        System.out.println("Fourth Phase");
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/select[1]")));
        select.selectByVisibleText(month);
        System.out.println("Fifth Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[2]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[2]/input[1]")).sendKeys(day);
        System.out.println("Sixth Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[3]/input[1]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[3]/input[1]")).sendKeys(year);
        System.out.println("Seventh Phase");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/input[13]")).clear();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/input[13]")).sendKeys(gender);
        System.out.println("Eight Phase ");
        Thread.sleep(2000);
//            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/img[1]")).click();
        System.out.println("Done Alhamdulillah");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}


