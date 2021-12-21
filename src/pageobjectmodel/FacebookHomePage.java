package pageobjectmodel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookHomePage {

    WebDriver driver;
    public FacebookHomePage(WebDriver driver){
        this.driver=driver;
    }


    @FindBy(how = How.XPATH,using = "//body/div[@id='mount_0_0_DV']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/*[1]") WebElement accountDropDown;
    @FindBy(how = How.XPATH,using = "//body/div[@id='mount_0_0_Sm']/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[1]") WebElement logoutButton;


    public void homePageDropDown() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        Select dropdown = new Select(accountDropDown);
        dropdown.selectByVisibleText("Log Out");

    }
    //public void logout(){logoutButton.click();}

}
