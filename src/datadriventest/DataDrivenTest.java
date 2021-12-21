package datadriventest;

import excelutility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DataDrivenTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/account/create?.intl=us&.lang=en-US&src=ym&activity=ybar-mail&pspid=2023538075&add=1&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Fpspid%3D2023538075%26activity%3Dybar-mail&specId=yidReg");

        Xls_Reader reader = new Xls_Reader("\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\FacebookSignUpData.xlsx");
        int rowCount = reader.getRowCount("FacebookSignUpData");
        System.out.println(rowCount);

        reader.addColumn("FacebookSignUpData", "Status");

        for (int rowNum=2; rowNum<=rowCount; rowNum++){
            System.out.println("======");
            String firstname = reader.getCellData("FacebookSignUpData","First name",rowNum);
            System.out.println(firstname);

            String lastname = reader.getCellData("FacebookSignUpData","Last name",rowNum);
            System.out.println(lastname);

            String email = reader.getCellData("FacebookSignUpData","Email",rowNum);
            System.out.println(email);

            String password = reader.getCellData("FacebookSignUpData","Password",rowNum);
            System.out.println(password);

            String month = reader.getCellData("FacebookSignUpData","Month",rowNum);
            System.out.println(month);

            String day = reader.getCellData("FacebookSignUpData","Day",rowNum);
            System.out.println(day);

            String year = reader.getCellData("FacebookSignUpData","Year",rowNum);
            System.out.println(year);

            String gender = reader.getCellData("FacebookSignUpData","Gender",rowNum);
            System.out.println(gender);

//            Actions action = new Actions(driver);
//            action.moveToElement(driver.findElement(By.xpath("//a[@id='createacc']")));
//            action.click().build().perform();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")).sendKeys(firstname);
            System.out.println("First Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]")).clear();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/input[1]")).sendKeys(lastname);
            System.out.println("Second Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(email);
//            action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")));
//            action.click().sendKeys(email).build().perform();
            System.out.println("Third Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).clear();
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(password);
            System.out.println("Fourth Phase");
            Thread.sleep(1000);
            Select select = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
            select.selectByVisibleText(month);
            System.out.println("Fifth Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='usernamereg-day']")).clear();
            driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys(day);
            System.out.println("Sixth Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='usernamereg-year']")).clear();
            driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys(year);
            System.out.println("Seventh Phase");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).clear();
            driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys(gender);
            System.out.println("Eight Phase ");
            Thread.sleep(1000);
//            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/img[1]")).click();
            System.out.println("Done Alhamdulillah");
            reader.setCellData("FacebookSignUpData","Status",rowNum,"Pass");

        }
        driver.quit();


    }
}
