package android;

import android.po.BasePage;
import org.testng.annotations.Test;

public class Launch_and_Kill {

  /* @BeforeTest()
    public void Setup() throws MalformedURLException {
        AppFactory.Android_Login();

    }*/
    @Test
    public void Tc_Login() throws InterruptedException {

        BasePage basePage = new BasePage();
        basePage.login();
        Thread.sleep(5000);
    }

   /*@AfterTest
    public void tearDown(){
        AppFactory.closeApp();
    }*/
}

