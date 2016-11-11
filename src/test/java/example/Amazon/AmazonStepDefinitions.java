package example.Amazon;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.Amazon.AmazonHomePage;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;

public class AmazonStepDefinitions extends SeleniumTest{

	AmazonHomePage amazonHomePage;


	@Given("^I am at the site \"([^\"]*)\"$")
	public void i_am_at_the_site(String URL) throws Throwable {
		amazonHomePage = AmazonHomePage.launch(URL);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		amazonHomePage.EnterSearch(arg1);

	}

	@When("^I then select the item I wish to buy$")
	public void i_then_select_the_item_I_wish_to_buy() throws Throwable {
		amazonHomePage.SelectLink();
	}

	@Then("^I then select the one time purchase option$")
	public void i_then_select_the_one_time_purchase_option() throws Throwable {
		amazonHomePage.OneTimePurchase();
	}


	@Then("^I add the item to my basket$")
	public void i_add_the_item_to_my_basket() throws Throwable {
		amazonHomePage.AddToBasket();

	}

}