package Steps;

import Screens.NotificationPage;
import Screens.SignInPage;
import Tools.AppiumTestBase;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by rainy.chen on 9/24/17.
 */
public class NotificationPage_steps {

   @Before
   public void Start() throws Throwable{
       AppiumTestBase.getInstance().setUp();
   }



    @Then("^\\[NotificationPage\\] Login successfully$")
    public void notification_pageLoginSuccessfully() throws Throwable {

        assertTrue(NotificationPage.TurnNotificationsONbutton() !=null);

    }
}
