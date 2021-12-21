package pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FacebookLoginTest extends TestBase{

    @Test
    public void action() throws InterruptedException {
        FacebookLoginPage loginPage= PageFactory.initElements(driver, FacebookLoginPage.class);
        loginPage.setEmail("hassaannizam2009@hotmail.com");
        loginPage.setPassword("Sethqayoom7462159");
        loginPage.login();
        Thread.sleep(2000);


        FacebookHomePage homePage= PageFactory.initElements(driver, FacebookHomePage.class);
        homePage.homePageDropDown();
        //homePage.logout();
    }

}
