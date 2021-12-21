package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookLoginPage {
    WebDriver driver;
    public FacebookLoginPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement emailTextBox;
    @FindBy(how = How.XPATH,using = "//input[@id='pass']") WebElement passwordTextBox;
    @FindBy(how = How.XPATH,using = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]") WebElement loginClickButton;

    public void setEmail(String Email){
        emailTextBox.sendKeys(Email);
    }

    public void setPassword(String Password){
        passwordTextBox.sendKeys(Password);
    }

    public void login(){
        loginClickButton.click();
    }
}
