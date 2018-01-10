import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
//import static org.testng.AssertJUnit.*;


/**
 * Created by rainy.chen on 9/27/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber/cucumber.json", "html:target/cucumber", "pretty"}, features = "src/features/Login.feature", glue = "Steps", tags = {"@P4"})

public class RunCaseTest {



}
