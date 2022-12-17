package android.po;

import base.AppDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static base.AppFactory.driver;

public class BasePage {

    public BasePage() {

        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement permission;

    @FindBy(id = "com.sociomee.app:id/txt_log_in")
    public MobileElement login_button;

    @FindBy(id = "com.sociomee.app:id/edt_email_number")
    public MobileElement email_field;

    @FindBy(id = "com.sociomee.app:id/edt_password")
    public MobileElement password_field;

    @FindBy(id = "com.sociomee.app:id/btn_continue")
    public MobileElement continue_button;

    @FindBy(id = "com.sociomee.app:id/img_hamburger_menu")
    public MobileElement hamburger_button;

    @FindBy(id = "com.sociomee.app:id/txt_polls")
    public MobileElement poll;

    @FindBy(id = "com.sociomee.app:id/img_logo")
    public MobileElement sociomee_logo;

    @FindBy(id = "com.sociomee.app:id/txt_invalid_email_email")
    public MobileElement invalid_email;

    @FindBy(id = "com.sociomee.app:id/txt_invalid_email_pass")
    public MobileElement invalid_password;

    // @FindBy(id = "com.sociomee.app:id/img_logo")
    //public MobileElement app_logo;

    By by_permission = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By by_login_button = By.id("com.sociomee.app:id/txt_log_in");
    By by_email_field = By.id("com.sociomee.app:id/edt_email_number");

    By by_hamburger_button = By.id("com.sociomee.app:id/img_hamburger_menu");


    public void login() throws InterruptedException {
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_permission));
        permission.click();
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_login_button));
        login_button.click();
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_email_field));
        email_field.sendKeys("7752854268");
        password_field.sendKeys("Abhinav@999");
        continue_button.click();
        Thread.sleep(5000);


        // MobileElement account = driver.findElementById("com.sociomee.app:id/img_logo");
        // Assert.assertTrue(account.isDisplayed(),"Login not successfull");


    }

    public void login_another_id() throws InterruptedException {
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_permission));
        permission.click();
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_login_button));
        login_button.click();
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_email_field));
        email_field.sendKeys("9140712062");
        password_field.sendKeys("Abhinav@125");
        continue_button.click();
        Thread.sleep(5000);


    }
}
