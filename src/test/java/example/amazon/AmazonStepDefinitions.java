package example.amazon;
	
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.Amazon.AmazonHomePage;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;
	
public class AmazonStepDefinitions extends SeleniumTest
{
	// Attributes
		AmazonHomePage amazonHomePage;
		
	@Given("^I am on the home page for Amazon\\.co\\.uk$")
	public void i_am_on_the_home_page_for_Amazon_co_uk() throws Throwable {
	    amazonHomePage = AmazonHomePage.launch();   
	}

	@When("^I search for an \"([^\"]*)\" of interest$")
	public void i_search_for_an_of_interest(String arg1) throws Throwable {
	    amazonHomePage.EnterSearch(arg1);
	}

	@When("^I select the \"([^\"]*)\" I wish to buy$")
	public void i_select_the_I_wish_to_buy(String arg1) throws Throwable {
	    amazonHomePage.SelectItem();
	}

	@Then("^I add the \"([^\"]*)\" to my basket$")
	public void i_add_the_to_my_basket(String arg1) throws Throwable {
	    amazonHomePage.AddItem();
	}
	// Constructors

	// Methods
}
