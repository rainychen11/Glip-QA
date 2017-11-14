package Screens;

import Tools.AppiumTestBase;
import Tools.Helper;
import io.appium.java_client.MobileElement;



/**
 * Created by rainy.chen on 8/15/17.
 */
public class WelcomePage {


    public static MobileElement SignIntoGlipButton() {
        try{
            return Helper.findByAccessibilityId("SignInButton");
        }catch (Exception e){
            Helper.waitForElementAppear(5000);
            return Helper.findByAccessibilityId("SignInButton");
        }
    }

    public static void EnterSignIntoScreen() {
        SignIntoGlipButton().click();
    }

}
