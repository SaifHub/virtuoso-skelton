package example.homeOffice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
public class HomeOfficeStepDefinitions extends SeleniumTest {

    HomeOfficeHomePage homeOfficeHomePage;
    HomeOfficeComputingPage homeOfficeComputingPage;

    @Given("^the HomeOffice site is accessed$")
    public void the_HomeOffice_site_is_accessed() throws Throwable {
        homeOfficeHomePage = HomeOfficeHomePage.launch();
    }

    @When("^selecting a link on \"(.*?)\"$")
    public void selecting_a_link_on(String term) throws Throwable {
        homeOfficeHomePage.setSearchInputText(term);
        homeOfficeComputingPage = homeOfficeHomePage.clickGoButton();
    }

    @Then("^the returned page contains the \"(.*?)\" header$")
    public void the_returned_page_contains_the_header(String term) throws Throwable {
        assertor.assertEquals("The returned page does not contain the header", term, homeOfficeComputingPage.getFirstHeading());
    }
}

