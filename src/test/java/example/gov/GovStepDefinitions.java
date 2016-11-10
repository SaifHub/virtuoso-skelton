package example.gov;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.gov.GovHomeOfficePage;
import example.gov.GovSearchPage;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;



/***
 * Test class for the Cucumber-JVM to Virtuoso integration.
 * <p>
 * Extension of a Selenium-based test.
 * <p>
 * The test implements the steps defined in a feature file.
 * The extension of the SeleniumTest class allows this test class,
 * to take advantage of Virtuoso capabilities and automatically
 * initialise the Selenium web driver as per the configuration properties.
 */
public class GovStepDefinitions extends SeleniumTest {

    GovHomeOfficePage govHomeOfficePage;
    GovSearchPage govSearchPage;

    @Given("^the Gov site is accessed$")
    public void the_Gov_site_is_accessed() throws Throwable {
        govHomeOfficePage = example.gov.GovHomeOfficePage.launch();
    }

    @When("^searching for \"(.*?)\"$")
    public void searching_for(String term) throws Throwable {
    	govHomeOfficePage.setSearchInputText(term);
        govSearchPage = govHomeOfficePage.clickGoButton();
    }

    @Then("^the returned page contains the \"(.*?)\" header$")
    public void the_returned_page_contains_the_header(String term) throws Throwable {
        assertor.assertEquals("The returned page does not contain the header", term, govSearchPage.getFirstHeading());
    }
}

