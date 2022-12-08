package base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.appium.java_client.FindsByAndroidUIAutomator;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static base.AppFactory.driver;

public class Util {

    public static void scrollDown() {
        Dimension dimension = AppDriver.getDriver().manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight() * 0.8;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight() * 0.5;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) AppDriver.getDriver())
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();


    }

    public static void scrollUp() {
        Dimension dimension = AppDriver.getDriver().manage().window().getSize();

        Double scrollHeightEnd = dimension.getHeight() * 0.5;
        int scrollStart = scrollHeightEnd.intValue();

        Double scrollHeightStart = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightStart.intValue();

        new TouchAction((PerformsTouchActions) AppDriver.getDriver())
                .press(PointOption.point(0, scrollEnd))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(0, scrollStart))
                .release().perform();


    }

    public static void camera_click_button() {

        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(PointOption.point(534, 2030)).perform();



    }
}

