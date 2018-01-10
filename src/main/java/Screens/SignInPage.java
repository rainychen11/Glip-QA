package Screens;

import Tools.Helper;
import io.appium.java_client.MobileElement;


/**
 * Created by rainy.chen on 8/15/17.
 */
public class SignInPage {




    /**
     * define elements
     */
    public static MobileElement EmailField() {
        return Helper.findByAccessibilityId("UserNameTextField");
    }

    public static MobileElement PasswordField() {
        return Helper.findByAccessibilityId("PasswordTextField");
    }

    public static MobileElement ClearTextBtn() { return Helper.findByAccessibilityId("Clear text"); }

    public static MobileElement SignInButton() {
        return Helper.findByAccessibilityId("SignInButton");
    }

    public static MobileElement SignInPageTitle() {
        return Helper.findByAccessibilityId("Sign In");
    }

    public static MobileElement GlipEnvItem() {
        return Helper.findByAccessibilityId("Glip");
    }

    public static MobileElement BackButton() {
        return Helper.findByAccessibilityId("barItemBackBtn");
    }


    /**
     * define actions
     */


    public static void getSignInPageTitle(){
        MobileElement element = null;
        try {
            element = SignInPageTitle();
        }catch (Exception e) {
            Helper.waitForElementAppear(5000);
            element = SignInPageTitle();
        }
    }

    public static void getEmailFieldAndInput(String input) {
        MobileElement element = null;
        try {
            element = EmailField();
        } catch (Exception e) {
            Helper.waitForElementAppear(5000);
            element = EmailField();
        }

        element.click();
        /*if (ClearTextBtn() != null) {
            clickClearTextBtn();
        }
        */
        Helper.waitForElementAppear(5000);
        Helper.sendKeysInKeyboard(input);
    }



    public static void getPasswordFieldAndInput(String input) {
        PasswordField().click();
        Helper.sendKeysInKeyboard(input);
    }


    public static void clickClearTextBtn() {
        ClearTextBtn().click();
    }

    public static void doLoginProcess(String email, String password) {
        getEmailFieldAndInput(email);
        getPasswordFieldAndInput(password);
        SignInButton().click();
        Helper.waitForElementAppear(5000);
    }

    public static void LoginViaProductionEnv(String email, String password) {
        getEmailFieldAndInput("#glipiosta#");
        getPasswordFieldAndInput("1");
        SignInButton().click();
        Helper.waitForElementAppear(5000);
        GlipEnvItem().click();
        BackButton().click();
        EmailField().clear();
        doLoginProcess(email, password);
        Helper.waitForElementAppear(5000);
    }
}
