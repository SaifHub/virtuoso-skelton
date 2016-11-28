package RESTTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ManagePhilUtils extends PhilUtils {


    @When("^I visit the given \"([^\"]*)\"$")
    public void iVisitTheGiven(String arg0) throws Throwable {
        this.version(arg0);
    }

    @Then("^the responce status \"([^\"]*)\" is returned$")
    public void theResponceStatusIsReturned(int arg0) throws Throwable {
        assertEquals(arg0,getResponseStatusCode());
    }


}
