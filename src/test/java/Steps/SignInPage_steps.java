package Steps;


import Screens.SignInPage;
import Tools.AppiumTestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import Tools.Helper;
import cucumber.api.java.en.When;
import static Tools.AppiumTestBase.*;



/**
 * Created by rainy.chen on 9/17/17.
 */
public class SignInPage_steps {

    @Before
    public void Start() throws Throwable{
        AppiumTestBase.getInstance().setUp();
    }


    @Then("^\\[SignInPage\\] Sign In screen shows$")
    public void sign_In_Page_Sign_In_Screen_Shows() throws Throwable {
        Helper.waitForElementAppear(2000);
        assertTrue(SignInPage.SignInPageTitle() !=null,"notification screen shows");
    }

    private void assertTrue(boolean b, String notification_screen_shows) {
    }


    @When("^\\[SignInPage\\] Input Email \"([^\"]*)\" and Password \"([^\"]*)\" and login$")
    public void signinpage_InputEmailAndPasswordAndLogin(String email, String password) throws Throwable {
        SignInPage.doLoginProcess(email, password);
    }


    @When("^\\[SignInPage\\] Input Production Email \"([^\"]*)\" and Password \"([^\"]*)\" and login$")
    public void signinpage_InputProductionEmailAndPasswordAndLogin(String email, String password) throws Throwable {
        SignInPage.LoginViaProductionEnv(email,password);
    }
}
