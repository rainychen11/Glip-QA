package Steps;

import Tools.AppiumTestBase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Screens.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by rainy.chen on 9/17/17.
 */
public class WelcomePage_steps {


    @Before
    public void Start() throws Throwable{
        AppiumTestBase.getInstance().setUp();
    }


    @Given("^\\[WelcomePage\\] Enter Welcome screen$")
    public void welcome_Page_Enter_Welcome_Screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^\\[WelcomePage\\] Enter Sign In screen$")
    public void welcome_Page_Enter_Sign_In_Screen() throws Throwable {
        WelcomePage.EnterSignIntoScreen();
    }


}
