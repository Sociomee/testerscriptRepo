package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import base.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.time.Duration;

import static base.AppFactory.driver;

public class Already_created_post_functionality {

    @Test
    public void Edit_post_details() throws InterruptedException {


        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(3000);
        tp.add_feed.click();
        Thread.sleep(2000);
        Util.scrollUp();
        Thread.sleep(2000);
        tp.enter_text_for_post.sendKeys("Automated-Lucifer-MS");
        tp.tap_to_post_text.click();
        Thread.sleep(7000);
        System.out.println(tp.posted_text.getText());
        Thread.sleep(4000);
        Util.scrollDown();
        Thread.sleep(1000);
        tp.like_button.click();


        String current_like_count = tp.first_like.getText();
        System.out.println(current_like_count);
        String desired_like_count = "1";
        if (current_like_count.equals(desired_like_count)) {
            System.out.println("like button is working fine");
        } else {
            System.out.println("like button is not working fine");
        }

        Thread.sleep(2000);
        tp.like_button.click();
        Thread.sleep(2000);


        String new_current_like_count = tp.first_like.getText();
        System.out.println(new_current_like_count);
        String new_desired_like_count = "0";
        if (new_current_like_count.equals(new_desired_like_count)) {
            System.out.println("Unlike button is working fine");
        } else {
            System.out.println("Unlike button is not working fine");
        }
        Thread.sleep(1000);
        tp.comment_button.click();
        Thread.sleep(1000);
        tp.add_comment.sendKeys("je suis diable");
        tp.comment_send_button.click();
        tp.add_comment.sendKeys("je suis diable");
        tp.comment_send_button.click();
        tp.add_comment.sendKeys("je suis diable");
        tp.comment_send_button.click();
        Thread.sleep(4000);
        tp.like_second_comment.click();
        Thread.sleep(4000);
        tp.reply_second_comment.click();
        Thread.sleep(4000);
        tp.add_reply_comment.sendKeys("je suis diable");
        tp.comment_reply_send_button.click();
        Thread.sleep(4000);
        tp.back_from_comment_reply.click();
        Thread.sleep(2000);
        tp.back_from_comment_reply.click();
        tp.share_post.click();
        tp.send4th_button.click();
        Thread.sleep(4000);
        tp.three_dot_menu_for_recent_post.click();
        tp.turn_off_post_comment.click();
        Thread.sleep(2000);
        tp.three_dot_menu_for_recent_post.click();


        String current_comment_status = tp.turn_on_post_comment.getText();
        System.out.println(current_comment_status);
        String desired_comment_status = "Turn on Post Comments";
        if (current_comment_status.equals(desired_comment_status)) {
            System.out.println("comments are successfully turned off");
        } else {
            System.out.println("comments are not successfully turned off");
        }

        Thread.sleep(4000);
        tp.turn_on_post_comment.click();
        tp.three_dot_menu_for_recent_post.click();


        String new_current_comment_status = tp.turn_off_post_comment.getText();
        System.out.println(new_current_comment_status);
        String new_desired_comment_status = "Turn off Post Comments";
        if (new_current_comment_status.equals(new_desired_comment_status)) {
            System.out.println("comments are successfully turned on");
        } else {
            System.out.println("comments are not successfully turned on");
        }

        Thread.sleep(4000);
        tp.touch_outside.click();
        Thread.sleep(4000);

        LongPressOptions longPressOptions = new LongPressOptions();
        longPressOptions.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(tp.like_button));
        TouchAction action = new TouchAction(driver);
        action.longPress(longPressOptions).release().perform();
        tp.omg_react_icon.click();
        tp.total_likes_reacts.click();
        String current_reaction_text = tp.reaction_display.getText();
        System.out.println(current_reaction_text);
        String desired_reaction_text = "OMG";
        if (current_reaction_text.equals(desired_reaction_text)) {
            System.out.println("OMG reaction is displayed successfully");
        } else {
            System.out.println("OMG reaction is not displayed successfully");
        }

        tp.back_from_like_screen.click();
        Thread.sleep(4000);

    }

    // ************************ // TESTING DELETE POST FUNCTIONALITY FROM CREATOR END \\ ********************** \\

    @Test
    public void delete_post() throws InterruptedException {


        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);

        // ********************************** ADDING A NEW TEXT POST  ***********************************\\

        tp.add_feed.click();
        Thread.sleep(2000);
        Util.scrollUp();
        Thread.sleep(2000);
        tp.enter_text_for_post.sendKeys("Automated-Lucifer-MS");
        tp.tap_to_post_text.click();
        Thread.sleep(7000);

        // ******************************** DELETING THE ADDED TEXT POST **********************************\\

        tp.three_dot_menu_for_recent_post.click();
        tp.delete_button.click();
        tp.proceed_to_delete.click();
        Thread.sleep(8000);
        tp.post_deleted.isDisplayed();
        Thread.sleep(1000);

        // ************************ ADDING A NEW TEXT POST FOR FURTHER VIEWER END TESTING ********************** \\

        tp.add_feed.click();
        Thread.sleep(2000);
        Util.scrollUp();
        Thread.sleep(2000);
        tp.enter_text_for_post.sendKeys("hide/report/block");
        tp.tap_to_post_text.click();
    }

    // ************** // TESTING "3DOTS" FUNCTIONALITY OF THE CREATED POST AT "VIEWER" END \\ ***************** \\


    @Test
    public void edit_post_from_viewer_end() throws InterruptedException {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login_another_id();
        Thread.sleep(3000);

        // ***************************** TURNING OFF POST NOTIFICATION AND VALIDATING IT ************************** \\

        tp.three_dot_menu_for_recent_post.click();
        tp.turn_off_post_notification.click();
        tp.three_dot_menu_for_recent_post.click();
        String current_notification_status = tp.turn_on_post_notification.getText();
        System.out.println(current_notification_status);
        String desired_notification_status = "Turn on post notification";
        if (current_notification_status.equals(desired_notification_status)) {
            System.out.println("notifications are successfully turned off");
        } else {
            System.out.println("notifications are not successfully turned off");
        }

        // ************************** TURNING ON POST NOTIFICATION AND VALIDATING IT **************************\\

        tp.turn_on_post_notification.click();
        tp.three_dot_menu_for_recent_post.click();
        String new_current_notification_status = tp.turn_off_post_notification.getText();
        System.out.println(new_current_notification_status);
        String new_desired_notification_status = "Turn off post notification";
        if (new_current_notification_status.equals(new_desired_notification_status)) {
            System.out.println("notifications are successfully turned on");
        } else {
            System.out.println("notifications are not successfully turned on");
        }

        // ****************************** UNFOLLOWING USER AND VALIDATING IT *********************************** \\

        tp.unfollow_user.click();
        Thread.sleep(3000);
        tp.three_dot_menu_for_recent_post.click();
        String current_following_status = tp.follow_user.getText();
        System.out.println(current_following_status);
        String desired_following_status = "Follow MorningStar";
        Thread.sleep(3000);

        if (current_following_status.equals(desired_following_status)) {
            System.out.println("user of the post is unfollowed successfully");
        } else {
            System.out.println("user of the post is not unfollowed successfully");
        }
        Thread.sleep(3000);

        // ****************************** FOLLOWING USER AND VALIDATING IT *********************************** \\

        tp.follow_user.click();
        Thread.sleep(3000);
        tp.three_dot_menu_for_recent_post.click();
        String new_current_following_status = tp.unfollow_user.getText();
        System.out.println(new_current_following_status);
        String new_desired_following_status = "Unfollow MorningStar";
        Thread.sleep(3000);

        if (new_current_following_status.equals(new_desired_following_status)) {
            System.out.println("user of the post is followed successfully");
        } else {
            System.out.println("user of the post is not followed successfully");
        }
    }


    // ******************************** TEST AND VALIDATE BLOCK USER AND UNBLOCK USER *********************************** \\
    @Test
    public void edit_post_from_viewer_end_block_and_unblock() throws InterruptedException {


        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login_another_id();
        Thread.sleep(3000);
        tp.three_dot_menu_for_recent_post.click();
        tp.block_user.click();
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollUp();
        Thread.sleep(2000);
        basePage.hamburger_button.click();
        Thread.sleep(3000);
        tp.setting_button.click();
        Thread.sleep(2000);
        tp.account_button.click();
        tp.blocked_people_button.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@text,'MorningStar')]")).click();
        Thread.sleep(8000);
        tp.user_profile_three_dot_menu.click();
        tp.unblock_user.click();
        tp.back_from_like_screen.click();
        Thread.sleep(3000);
        tp.back_from_like_screen.click();
        Thread.sleep(3000);
        tp.back_from_like_screen.click();
        Thread.sleep(3000);
        tp.back_from_like_screen.click();
        Thread.sleep(3000);
        tp.back_from_like_screen.click();
        Thread.sleep(3000);
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollUp();
        tp.three_dot_menu_for_recent_post.click();

        String current_blocked_status = tp.block_user.getText();
        System.out.println(current_blocked_status);
        String desired_blocked_status = "Block MorningStar";
        Thread.sleep(3000);

        if (current_blocked_status.equals(desired_blocked_status)) {
            System.out.println("user is unblocked successfully");
        } else {
            System.out.println("user is not unblocked successfully");
        }

    }
    }


