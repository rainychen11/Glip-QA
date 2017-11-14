package Tools;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;


/**
 * Created by rainy.chen on 8/15/17.
 */
public class AppiumTestBase {
    public IOSDriver mIOSDriver;
    public static AppiumTestBase sAppiumTestBase = new AppiumTestBase();


    public AppiumTestBase() {
        try {
            System.out.println("[AppiumTestBase Setup method] setup Appium driver");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "iPhone Simulator");
            capabilities.setCapability("platformVersion", "10.3");
            capabilities.setCapability("platformName", "iOS");
            //capabilities.setCapability("noReset", "true");
            capabilities.setCapability("automationName", "xcuitest");
            capabilities.setCapability("app", "/Users/rainy.chen/Downloads/Glip 2.app");

            mIOSDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        } catch (Exception e) {
            System.out.println("----[AppiumTestBase Setup method] setup Appium driver failed");
        }
    }

    public static AppiumTestBase getInstance() {
        return sAppiumTestBase;
    }

    public void setUp() {
        Helper.init(mIOSDriver);
    }


    public void tearDown() throws IOException, InterruptedException {
        try {
            mIOSDriver.quit();
            System.out.println("[AppiumTestBase Tear down method] quit driver");
        } catch (Exception e) {
            System.out.println("----[AppiumTestBase Tear down method] quit driver failed");

        }

    }
}
