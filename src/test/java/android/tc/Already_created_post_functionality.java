package android.tc;

import android.po.BasePage;
import android.po.TextPostObjects;
import base.Util;
import org.testng.annotations.Test;

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

        boolean verify_like = tp.like_button.isEnabled();
        if(verify_like == true)
        {
            System.out.println("like button is working fine");;
        }
        else {
            System.out.println("like button is not working fine");
        }

        Thread.sleep(4000);
        tp.like_button.click();
        Thread.sleep(2000);

        boolean verify_unlike = tp.like_button.isEnabled();
        if(verify_unlike == true)
        {
            System.out.println("unlike button is working fine");;
        }
        else
        {
            System.out.println("unlike button is not working fine");
        }
        Thread.sleep(1000);
        tp.like_button.click();
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


    }
}
