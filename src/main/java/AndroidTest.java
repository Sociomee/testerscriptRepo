import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

        import java.net.MalformedURLException;
        import java.net.URL;

import static base.AppFactory.driver;

public class AndroidTest {


    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appium:deviceName","2efe272f");
        dc.setCapability("platformName","android");
        dc.setCapability("appium:appPackage","com.sociomee.app");
        dc.setCapability("appium:appActivity","com.sociomee.app.ui.authentication.activity.SplashActivity");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);


        Thread.sleep(7000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
        el1.click();
        Thread.sleep(7000);
        MobileElement el2 = (MobileElement) driver.findElementById("com.sociomee.app:id/txt_log_in");
        el2.click();
        Thread.sleep(7000);
        MobileElement el3 = (MobileElement) driver.findElementById("com.sociomee.app:id/edt_email_number");
        el3.click();
        el3.sendKeys("7752854268");
        MobileElement el4 = (MobileElement) driver.findElementById("com.sociomee.app:id/edt_password");
        el4.click();
        el4.sendKeys("Dbm@123456");
        MobileElement el5 = (MobileElement) driver.findElementById("com.sociomee.app:id/btn_continue");
        el5.click();
        Thread.sleep(7000);
        // MobileElement account = ad.findElementById("com.sociomee.app:id/img_logo");
       // Assert.assertTrue(account.isDisplayed(),"Login not successfull");
        driver.quit();


    }
}