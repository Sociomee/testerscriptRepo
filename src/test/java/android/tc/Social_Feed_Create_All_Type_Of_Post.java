package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import base.Util;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static base.AppFactory.driver;

public class Social_Feed_Create_All_Type_Of_Post

{
    // ******************************* // TESTING AND VALIDATING TEXT POST \\ ************************************ \\

   @Test
    public void Text_post() throws InterruptedException

   {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(3000);
        tp.add_feed.click();
        Thread.sleep(2000);
        Util.scrollUp();
        Thread.sleep(2000);
        tp.enter_text_for_post.sendKeys("Automated 1964 Pontiac GTO");
        tp.tap_to_post_text.click();
        Thread.sleep(7000);
        Util.scrollUp();
       Util.scrollUp();
        Util.scrollTillTextDisplayed("Automated 1964 Pontiac GTO");
       Thread.sleep(5000);

    }
      // ******************************* // TESTING AND VALIDATING MEDIA POST \\ ************************************ \\

    @Test
    public void Media_post_through_gallery() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);
        tp.add_feed.click();
        Thread.sleep(2000);
        tp.select_media.click();
        tp.select_gallery_for_media.click();
        tp.allow_image_from_device.click();
        tp.select_image.click();
        tp.next_button_image.click();
        Thread.sleep(5000);
        tp.next_from_crop_screen.click();
        tp.next_from_filter_screen.click();
        tp.image_caption.sendKeys("Automated-1970 Chevrolet Chevelle");
        tp.continue_button_login.click();
        tp.tap_to_post_text.click();
        Thread.sleep(5000);
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollTillTextDisplayed("Automated-1970 Chevrolet Chevelle");
        Thread.sleep(5000);

    }


     // ******************************* // TESTING AND VALIDATING THREAT POST \\ ************************************ \\

    @Test
    public void Threat_post() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(5000);
        tp.add_feed.click();
        Thread.sleep(4000);
        tp.threat_button.click();
        tp.enter_text.sendKeys("Automated-1970 Plymouth Road Runner");
        tp.alert_level.click();
        Thread.sleep(2000);
        tp.severe.click();
        tp.alert_range.click();
        tp.select_range.click();
        tp.continue_start.click();
        tp.post_button.click();
        Util.scrollUp();
        Util.scrollUp();
        Thread.sleep(4000);
        Util.scrollTillTextDisplayed("Automated-1970 Plymouth Road Runner");
        Thread.sleep(4000);


    }
    // ******************************* // TESTING AND VALIDATING THOUGHT POST \\ ************************************ \\

    @Test
    public void Thought_post() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(5000);
        tp.add_feed.click();
        Thread.sleep(4000);
        tp.thought_button.click();
        Thread.sleep(4000);
        tp.thought_text.sendKeys("My-Automated-1967 chevrolet camaro");
        Thread.sleep(2000);
        tp.thought_text_color.click();
        tp.thought_background_color.click();
        tp.add_your_location.click();
        tp.set_location_on_map.click();
        Thread.sleep(2000);
        tp.use_current_location.click();
        Thread.sleep(2000);
        tp.tap_to_post_text.click();
        Util.scrollUp();
        Util.scrollUp();
        Thread.sleep(5000);
        Util.scrollTillTextDisplayed("My-Automated-1967 chevrolet camaro");
        Thread.sleep(4000);

    }
    // ******************************* // TESTING AND VALIDATING POLL POST \\ ************************************ \\

    @Test
    public void Poll_post() throws InterruptedException
    {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(4000);
        tp.add_feed.click();
        Thread.sleep(4000);
        Util.scrollDown();
        tp.poll_button.click();
        Thread.sleep(4000);
        tp.poll_text.sendKeys("Automating_the_poll_1965_SHELBY_MUSTANG");
        tp.poll_option1.sendKeys("Tesla");
        tp.poll_option2.sendKeys("Dodge Charger");
        tp.poll_duration.click();
        tp.poll_start_date.click();
        tp.poll_start_date.click();
        tp.poll_start_date.click();
        tp.poll_end_date.click();
        Thread.sleep(4000);
        tp.save_poll_duration.click();
        Thread.sleep(2000);
        tp.tap_to_post_text.click();
        Thread.sleep(5000);
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollTillTextDisplayed("Automating_the_poll_1965_SHELBY_MUSTANG");
        Thread.sleep(5000);

    }

    // **************************** // TESTING AND VALIDATING RECOMMENDATION POST \\ ******************************** \\

    @Test
    public void Recommendation_post() throws InterruptedException
    {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(4000);
        tp.add_feed.click();
        Thread.sleep(4000);
        tp.recommendation_button.click();
        tp.recommendation_text.sendKeys("I am seeking recommendation for aftermarket exhaust of 2015 Dodge challenger");
        tp.tap_to_post_text.click();
        Thread.sleep(4000);
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollTillTextDisplayed("I am seeking recommendation for aftermarket exhaust of 2015 Dodge challenger");
        Thread.sleep(4000);

    }

    // **************************** // TESTING AND VALIDATING MEDIA POST THROUGH CAMERA \\ ******************************** \\

    @Test
    public void Media_post_through_camera() throws InterruptedException
    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);
        tp.add_feed.click();
        Thread.sleep(2000);
        tp.select_media.click();
        tp.select_camera_for_image_post.click();
        Thread.sleep(2000);
        tp.permission_to_use_camera.click();
        Util.camera_click_button();
        Util.camera_click_button();
        Thread.sleep(5000);
        tp.image_captured_successful.click();
        tp.image_caption.sendKeys("Automated-PB-FORD-FAIR-LANE");
        tp.continue_button_login.click();
        tp.tap_to_post_text.click();
        Thread.sleep(5000);
        Util.scrollUp();
        Util.scrollUp();
        Util.scrollTillTextDisplayed("Automated-PB-FORD-FAIR-LANE");


    }
    // ******************** // TESTING AND VALIDATING MEDIA POST FOR MULTIPLE IMAGES \\ ***************************** \\

    @Test
    public void Media_post_multiple_images() throws InterruptedException
    {

        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);
        tp.add_feed.click();
        Thread.sleep(2000);
        tp.select_media.click();
        tp.select_gallery_for_media.click();
        tp.allow_image_from_device.click();
        Thread.sleep(2000);
        tp.grid_select_image.click();
        tp.select_2nd_image.click();
        tp.select_3rd_image.click();
        tp.next_button_image.click();
        Thread.sleep(2000);
        tp.next_from_crop_screen.click();
        tp.next_from_crop_screen.click();
        tp.next_from_crop_screen.click();
        Thread.sleep(2000);
        tp.continue_button_login.click();
        Thread.sleep(4000);
        tp.enter_text_for_post.sendKeys("Automated-Bumblebee");
        tp.tap_to_post_text.click();
        Thread.sleep(5000);
        Util.scrollUp();
        Util.scrollUp();
        Thread.sleep(2000);
        Util.scrollTillTextDisplayed("Automated-Bumblebee");

    }

    // *********** // TESTING AND VALIDATING REMOVE PARTICULAR MEDIA WHILE CREATING MULTIPLE MEDIA POST  \\ ********** \\

    @Test
    public void Media_post_remove_particular_media() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);
        tp.add_feed.click();
        Thread.sleep(2000);
        tp.select_media.click();
        tp.select_gallery_for_media.click();
        Thread.sleep(2000);
        tp.allow_image_from_device.click();
        Thread.sleep(2000);
        tp.grid_select_image.click();
        tp.select_2nd_image.click();
        tp.select_3rd_image.click();
        tp.next_button_image.click();
        Thread.sleep(2000);
        tp.next_from_crop_screen.click();
        tp.next_from_crop_screen.click();
        tp.next_from_crop_screen.click();
        Thread.sleep(2000);
        tp.continue_button_login.click();
        Thread.sleep(2000);
        tp.remove_media.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(@text,'2  media')]")).isDisplayed();

    }
    /*
    @Test
    public void Article_post() throws InterruptedException
    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(2000);
        tp.add_feed.click();
        Thread.sleep(2000);
        tp.article_button.click();


    }*/
}

