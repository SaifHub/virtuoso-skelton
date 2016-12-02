package example.amazon;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.amazon.AmazonHomePage;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;

public class AmazonStepDefinitions {

	AmazonHomePage amazonHomePage;


	@Given("^I open Amazon$")
	public void IOpenAmazon()
	{
		amazonHomePage.open(); 
	}

	@When("^I search for '(.*)'$")
	public void i_search_for(String arg1) {
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