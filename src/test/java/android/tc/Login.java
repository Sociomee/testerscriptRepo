package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import base.AppDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import static base.AppFactory.driver;

public class Login {

    @Test(dataProvider = "credentials")
    public void Tc_Login(String scenario, String username, String password) throws InterruptedException {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        tp.login_tc();
        tp.email_field_login.sendKeys(username);
        tp.password_field_login.sendKeys(password);
        tp.continue_button_login.click();


        if (scenario.equals("Valid_username & Valid_password")){
            Thread.sleep(3000);
            basePage.sociomee_logo.isDisplayed();
        }

        else if (scenario.equals("Invalid_username & Invalid_password"))
        {
            Thread.sleep(3000);
            basePage.invalid_email.isDisplayed();
        }
        else if (scenario.equals("Valid_username & Invalid_password"))
        {
            Thread.sleep(3000);
            basePage.invalid_password.isDisplayed();
        }
        else if (scenario.equals("Invalid_username & Valid_password"))
        {
            Thread.sleep(3000);
            basePage.invalid_email.isDisplayed();
        }
        driver.quit();
    }
    @DataProvider(name = "credentials")
    public Object[][] getData() {

        return new Object[][] {
                {"Valid_username & Valid_password","abhinavdubey.knp@bbdu.ac.in","Dbm@12345"},
                {"Invalid_username & Invalid_password","abhinavdubey.knp@b.ac.in","Abhiv@12"},
                {"Valid_username & Invalid_password","abhinavdubey.knp@bbdu.ac.in","Abhiv@12"},
                {"Invalid_username & Valid_password","abhinavdubey.knp@b.ac.in","Dbm@12345"}
        };
    }

}
