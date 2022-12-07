package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static base.AppFactory.driver;

public class Signup {


    @Test(dataProvider = "credentials")
    public void tc_Signup(String scenario, String phone_number) throws InterruptedException {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        Thread.sleep(4000);
        tp.permission_button_2.click();
        Thread.sleep(4000);
        tp.signup_button.click();
        tp.phone_number_field.sendKeys(phone_number);


        if (scenario.equals("Already_registered_phone_number_with_default_county_code"))
        {
            Thread.sleep(3000);
            tp.continue_button_login.click();
            Thread.sleep(2000);
            tp.mobileNo_already_exists.isDisplayed();
        }

        else if (scenario.equals("Unregistered_phone_number_with_other_country_code"))
        {
            tp.other_country();
            Thread.sleep(3000);
            basePage.invalid_password.isDisplayed();
        }
        else if (scenario.equals("Invalid_phone_number_with_other_country_code"))
        {
            tp.other_country();
            Thread.sleep(3000);
            basePage.invalid_password.isDisplayed();
        }

        else if (scenario.equals("Unregistered_phone_number_with_default_country_code"))
        {
            Thread.sleep(3000);
            tp.continue_button_login.click();
            Thread.sleep(3000);
            tp.sms_permission.isDisplayed();

        }
        driver.quit();
    }
    @DataProvider(name = "credentials")
    public Object[][] getData() {

        return new Object[][] {

                {"Already_registered_phone_number_with_default_county_code","7752854268"},
                {"Unregistered_phone_number_with_other_country_code","9140712062"},
                {"Invalid_phone_number_with_other_country_code","91407"},
                {"Unregistered_phone_number_with_default_country_code","9140712062"}
        };

    }
}
