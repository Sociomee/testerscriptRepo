package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import base.Util;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static base.AppFactory.driver;

public class Create_All_Type_Of_Post

{

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
        tp.enter_text_for_post.sendKeys("Automated-Lucifer-MS");
        tp.tap_to_post_text.click();
        Thread.sleep(7000);
        System.out.println(tp.posted_text.getText());

    }

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
        tp.image_caption.sendKeys("Automated-PB");
        tp.continue_button_login.click();
        tp.tap_to_post_text.click();
        Thread.sleep(1000);

    }

    @Test
    public void Threat_post() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(4000);
        tp.add_feed.click();
        Thread.sleep(4000);
        tp.threat_button.click();
        tp.enter_text.sendKeys("Automated-MorningStar");
        tp.alert_level.click();
        Thread.sleep(2000);
        tp.severe.click();
        tp.alert_range.click();
        tp.select_range.click();
        tp.continue_start.click();
        tp.post_button.click();
        Thread.sleep(4000);

    }

    @Test
    public void Thought_post() throws InterruptedException

    {
        BasePage basePage = new BasePage();
        TextPostObjects tp = new TextPostObjects();
        basePage.login();
        Thread.sleep(4000);
        tp.add_feed.click();
        Thread.sleep(4000);
        tp.thought_button.click();
        Thread.sleep(4000);
        tp.thought_text.sendKeys("My-Automated-Thought");
        Thread.sleep(2000);
        tp.thought_text_color.click();
        tp.thought_background_color.click();
        tp.add_your_location.click();
        tp.set_location_on_map.click();
        Thread.sleep(2000);
        tp.use_current_location.click();
        Thread.sleep(2000);
        tp.tap_to_post_text.click();
        Thread.sleep(3000);

    }

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
        tp.poll_text.sendKeys("Automating_the_poll");
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

    }

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
        tp.recommendation_text.sendKeys("I am seeking recommendation for aftermarket exhaust");
        tp.tap_to_post_text.click();
        Thread.sleep(4000);

    }

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
        Thread.sleep(2000);
        tp.image_captured_successful.click();
        tp.image_caption.sendKeys("Automated-PB");
        tp.continue_button_login.click();
        tp.tap_to_post_text.click();
        Thread.sleep(1000);

    }

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
        tp.tap_to_post_text.click();
        Thread.sleep(1000);

    }

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
        tp.multiple_image_counter.getText();
        String act_media_count=tp.multiple_image_counter.getText();
        System.out.println(act_media_count);
        String desired_media_count="2  media";
        if (act_media_count.equals(desired_media_count))
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

    }
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




    }
}

