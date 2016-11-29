package example.wikipedia;

/*
* @name : ABDUL SAIF
* @date : 10/11/2016
*/

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;

/*
 * Test class for the Cucumber-JVM to Virtuoso integration.
 *
 * Extension of a Selenium-based test.
 *
 * The test implements the steps defined in a feature file.
 * The extension of the SeleniumTest class allows this test class,
 * to take advantage of Virtuoso capabilities and automatically
 * initialise the Selenium web driver as per the configuration properties.
 */
public class WikipediaStepDefinitions extends SeleniumTest {

    WikipediaHomePage wikipediaHomePage;
    WikipediaComputingPage wikipediaComputingPage;

    //ALL METHODS below are glued to FEATURES available within wikipedia.feature
    @Given("^the Wikipedia site is accessed$")
    public void the_Wikipedia_site_is_accessed() throws Throwable
    {
        wikipediaHomePage = WikipediaHomePage.launch();
    }

    @When("^searching for \"(.*?)\"$")
    public void searching_for(String term) throws Throwable
    {
        wikipediaHomePage.setSearchInputText(term);
        wikipediaComputingPage = wikipediaHomePage.clickGoButton();
    }

    @Then("^the returned page contains the \"(.*?)\" header$")
    public void the_returned_page_contains_the_header(String term) throws Throwable
    {
        assertor.assertEquals("The returned page does not contain the header", term, wikipediaComputingPage.getFirstHeading());
    }
}

