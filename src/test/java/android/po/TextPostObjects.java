package android.po;

import base.AppDriver;
import base.Util;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.AppFactory.driver;

public class TextPostObjects {

    public TextPostObjects() {

        PageFactory.initElements(new AppiumFieldDecorator(AppDriver.getDriver()), this);
    }

    @FindBy(id = "com.sociomee.app:id/ivCreatePost")
    public MobileElement add_feed;


    @FindBy(id = "com.sociomee.app:id/txt_threat")
    public MobileElement threat_button;

    @FindBy(id = "com.sociomee.app:id/outline_edit_text")
    public MobileElement enter_text;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement severe;

    @FindBy(id = "com.sociomee.app:id/cl_alert_level")
    public MobileElement alert_level;

    @FindBy(id = "com.sociomee.app:id/cl_post_area")
    public MobileElement alert_range;

    @FindBy(id = "com.sociomee.app:id/seekBarAlert")
    public MobileElement select_range;

    @FindBy(id = "com.sociomee.app:id/btnContinue")
    public MobileElement continue_start;

    @FindBy(id = "com.sociomee.app:id/btn_post_alert")
    public MobileElement post_button;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement permission_button_2;

    @FindBy(id = "com.sociomee.app:id/txt_sign_up")
    public MobileElement signup_button;

    @FindBy(id = "com.sociomee.app:id/edt_email_number")
    public MobileElement email_field_login;

    @FindBy(id = "com.sociomee.app:id/edt_password")
    public MobileElement password_field_login;

    @FindBy(id = "com.sociomee.app:id/btn_continue")
    public MobileElement continue_button_login;

    @FindBy(id = "com.sociomee.app:id/txt_log_in")
    public MobileElement login_button_2;

    @FindBy(id = "com.sociomee.app:id/et_email_num")
    public MobileElement phone_number_field;

    @FindBy(id = "com.sociomee.app:id/txt_contact")
    public MobileElement otp_text;

    @FindBy(id = "com.sociomee.app:id/downAerrow")
    public MobileElement down_arrow_button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]")
    public MobileElement other_country_code;

    @FindBy(id = "com.sociomee.app:id/txt_error")
    public MobileElement mobileNo_already_exists;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public MobileElement sms_permission;

    @FindBy(id = "com.sociomee.app:id/edt_caption")
    public MobileElement recommendation_text;

    @FindBy(id = "com.sociomee.app:id/edt_caption")
    public MobileElement enter_text_for_post;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView"
    )
    public MobileElement posted_text;

    @FindBy(id = "com.sociomee.app:id/txt_post")
    public MobileElement tap_to_post_text;

    @FindBy(id = "com.sociomee.app:id/cl_media")
    public MobileElement select_media;

    @FindBy(id = "com.sociomee.app:id/iv_mask")
    public MobileElement select_image;

    @FindBy(id = "com.sociomee.app:id/picture_right")
    public MobileElement next_button_image;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Crop\"]")
    public MobileElement next_from_crop_screen;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.TextView")
    public MobileElement next_from_filter_screen;

    @FindBy(id = "com.sociomee.app:id/edt_image_caption")
    public MobileElement image_caption;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement allow_image_from_device;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public MobileElement allow_access_photo_media;


    @FindBy(id = "com.sociomee.app:id/cl_thought")
    public MobileElement thought_button;

    @FindBy(id = "com.sociomee.app:id/edt_thought")
    public MobileElement thought_text;

    @FindBy(id = "com.sociomee.app:id/cl_you_are")
    public MobileElement add_your_location;

    @FindBy(id = "com.sociomee.app:id/txt_set_location_")
    public MobileElement set_location_on_map;

    @FindBy(id = "com.sociomee.app:id/btn_use_my_current_")
    public MobileElement use_current_location;

    @FindBy(id = "com.sociomee.app:id/cl_poll")
    public MobileElement poll_button;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
    public MobileElement poll_text;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.EditText\n")
    public MobileElement poll_option1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.EditText\n")
    public MobileElement poll_option2;

    @FindBy(id = "com.sociomee.app:id/txt_duration_from")
    public MobileElement poll_duration;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Mon, 17 Jul\"]")
    public MobileElement poll_start_date;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Tue, 18 Jul\"]")
    public MobileElement poll_end_date;

    @FindBy(id = "com.sociomee.app:id/confirm_button")
    public MobileElement save_poll_duration;

    @FindBy(id = "com.sociomee.app:id/cl_recommendation")
    public MobileElement recommendation_button;

    @FindBy(id = "com.sociomee.app:id/card_camera")
    public MobileElement select_camera_for_image_post;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]")
    public MobileElement select_photo_from_the_list;

    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement permission_to_use_camera;

    @FindBy(id = "com.android.camera:id/done_button")
    public MobileElement image_captured_successful;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Crop\"]")
    public MobileElement captured_image_through_camera_edit_screen_tick_icon;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View\n")
    public MobileElement select_filter_i_1977;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    public MobileElement captured_image_through_camera_filter_screen_next_icon;





    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView[2]\n")
    public MobileElement grid_select_image;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    public MobileElement select_2nd_image;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    public MobileElement select_3rd_image;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.widget.FrameLayout[1]/android.view.ViewGroup")
    public MobileElement thought_text_color;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout[5]/android.view.ViewGroup")
    public MobileElement thought_background_color;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    public MobileElement select_gallery_for_media;

    @FindBy(id = "com.sociomee.app:id/media_count")
    public MobileElement multiple_image_counter;

    @FindBy(id = "com.sociomee.app:id/img_remove")
    public MobileElement remove_media;

    @FindBy(id = "com.sociomee.app:id/cl_blog")
    public MobileElement article_button;

    @FindBy(id = "com.sociomee.app:id/img_like_post")
    public MobileElement like_button;

    @FindBy(id = "com.sociomee.app:id/img_comment_post")
    public MobileElement comment_button;

    @FindBy(id = "com.sociomee.app:id/edt_add_comment")
    public MobileElement add_comment;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]")
    public MobileElement like_second_comment;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[6]")
    public MobileElement reply_second_comment;

    @FindBy(id = "com.sociomee.app:id/img_send")
    public MobileElement comment_send_button;

    @FindBy(id = "com.sociomee.app:id/img_send_comment")
    public MobileElement comment_reply_send_button;

    @FindBy(id = "com.sociomee.app:id/edt_add_comment_reply")
    public MobileElement add_reply_comment;

    @FindBy(id = "com.sociomee.app:id/img_toolbar_back")
    public MobileElement back_from_comment_reply;

    @FindBy(id = "com.sociomee.app:id/img_share_post")
    public MobileElement share_post;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView[3]")
    public MobileElement send4th_button;

    @FindBy(id = "com.sociomee.app:id/img_more_options")
    public MobileElement three_dot_menu_for_recent_post;

    @FindBy(id = "com.sociomee.app:id/txt_menu_2")
    public MobileElement turn_off_post_comment;

    @FindBy(id = "com.sociomee.app:id/txt_menu_2")
    public MobileElement turn_on_post_comment;

    @FindBy(id = "com.sociomee.app:id/touch_outside")
    public MobileElement touch_outside;


    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public MobileElement first_like;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.ImageView")
    public MobileElement omg_react_icon;

    @FindBy(id = "com.sociomee.app:id/txt_liked_by_post")
    public MobileElement total_likes_reacts;

    @FindBy(xpath = "com.sociomee.app:id/img_bookmark_post")
    public MobileElement bookmark_button;


    @FindBy(id = "com.sociomee.app:id/txt_days")
    public MobileElement reaction_display;

    @FindBy(id = "com.sociomee.app:id/img_back")
    public MobileElement back_from_like_screen;

    @FindBy(id = "com.sociomee.app:id/txt_menu_4")
    public MobileElement delete_button;

    @FindBy(id = "com.sociomee.app:id/txt_proceed")
    public MobileElement proceed_to_delete;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView")
    public MobileElement post_deleted;

    @FindBy(id = "com.sociomee.app:id/txt_menu_2")
    public MobileElement turn_off_post_notification;

    @FindBy(id = "com.sociomee.app:id/txt_menu_2")
    public MobileElement turn_on_post_notification;

    @FindBy(id = "com.sociomee.app:id/txt_menu_5")
    public MobileElement unfollow_user;

    @FindBy(id = "com.sociomee.app:id/txt_menu_5")
    public MobileElement follow_user;

    @FindBy(id = "com.sociomee.app:id/txt_menu_6")
    public MobileElement block_user;


    @FindBy(id = "com.sociomee.app:id/cl_settings")
    public MobileElement setting_button;

    @FindBy(id = "com.sociomee.app:id/txt_account")
    public MobileElement account_button;

    @FindBy(id = "com.sociomee.app:id/txt_blocked_people")
    public MobileElement blocked_people_button;

    @FindBy(id = "com.sociomee.app:id/img_user_option")
    public MobileElement user_profile_three_dot_menu;

    @FindBy(id = "com.sociomee.app:id/txt_menu_2")
    public MobileElement unblock_user_from_user_profile;

    @FindBy(xpath = "//*[contains(@text,'Block MorningStar')]")
    public MobileElement block_user_text;

    @FindBy(xpath = "com.sociomee.app:id/edt_add_comment_post")
    public MobileElement add_comment_from_social_feed;

    @FindBy(xpath = "com.sociomee.app:id/img_comment_send_post")
    public MobileElement send_comment_from_social_feed;

    @FindBy(xpath = "com.sociomee.app:id/txtCommentFirst")
    public MobileElement latest_comment_on_post_from_social_feed;





























    By by_permission_button_2 = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By by_login_button_2 = By.id("com.sociomee.app:id/txt_log_in");


    public void login_tc() throws InterruptedException {
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_permission_button_2));
        permission_button_2.click();
        new WebDriverWait(AppDriver.getDriver(), 1000).until(ExpectedConditions.presenceOfElementLocated(by_login_button_2));
        login_button_2.click();


    }

    public void other_country() throws InterruptedException {

        down_arrow_button.click();
        Thread.sleep(5000);
        other_country_code.click();
        Thread.sleep(5000);
        continue_button_login.click();
        Thread.sleep(5000);



    }
}
