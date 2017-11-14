package Screens;

import Tools.Helper;
import io.appium.java_client.MobileElement;


/**
 * Created by rainy.chen on 8/15/17.
 */
public class  NotificationPage {

    public static MobileElement TurnNotificationsONbutton() {
        return Helper.findByAccessibilityId("Turn Notifications ON");
    }
}
