package example.REST;

/**
 * @author : ABDUL SAIF
 * @date   : 28/11/2016
 *
 */

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ManageSaifUtils extends SaifUtils {

    //ALL METHODS below are glued to FEATURES available within rest.feature
    @When("^I visit the given webpage \"([^\"]*)\"$")
    public void iVisitTheGiven(String vis) throws Throwable {
        this.version(vis);
    }

    @Then("^the response status \"([^\"]*)\" is returned$")
    public void theResponceStatusIsReturned(int res) throws Throwable {
        assertEquals(res,getResponseStatusCode());
    }

}