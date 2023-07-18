package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppFactory {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities dc;

    public static void Android_Login() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability("appium:deviceName","2efe272f");
        dc.setCapability("platformName","android");
        dc.setCapability("appium:appPackage","com.sociomee.app");
        dc.setCapability("appium:appActivity","com.sociomee.app.ui.authentication.activity.SplashActivity");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);


        AppDriver.setDriver(driver);

    }
    public static void closeApp()
    {

        driver.quit();
    }
}
