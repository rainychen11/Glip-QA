package Tools;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by rainy.chen on 8/15/17.
 */


public abstract class Helper {
    private static IOSDriver driver;
    private static WebDriverWait driverWait;
    /**
     * Initialize the webdriver. Must be called before using any helper methods. *
     */
    public static void init(IOSDriver iosDriver) {
        driver = iosDriver;
        int timeoutInSeconds = 60;
        driverWait = new WebDriverWait(iosDriver, timeoutInSeconds);
    }

    /**
     * set wait time to get Expected element appear
     **/
    public static void waitForElementAppear(long millionSec) {
        try {
            new Thread().sleep(millionSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * below methods all about locating element
     **/

    public static MobileElement findByAccessibilityId(String accessbilityId) {
        MobileElement mobileElement = (MobileElement) driver.findElementByAccessibilityId(accessbilityId);
        return mobileElement;
    }

    public static MobileElement getElementByAccessibilityId(String name) {
        MobileElement element = null;
        try {
            element = findByAccessibilityId(name);
        } catch (Exception e) {
            System.out.println(String.format("[WARN]Cannot find %s in the screen", name));
        }
        return element;
    }

    public static void sendKeysInKeyboard(String inputString) {
        driver.getKeyboard().sendKeys(inputString);
    }






}
