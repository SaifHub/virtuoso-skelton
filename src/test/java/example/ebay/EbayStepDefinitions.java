/**
 * 
 */
package example.ebay;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author LMear
 *
 */
public class EbayStepDefinitions
{
	EbayHomePage ebayHomePage;
	
	@Given("^I am on the ebay home page$")
	public void i_am_on_the_ebay_home_page() throws Throwable {
	    ebayHomePage.open();
	}

	@When("^I search for an \"(.*)\"$")
	public void i_search_for_an(String arg1) throws Throwable {
	    ebayHomePage.search(arg1);
	}
	
	@When("^Look within the UK$")
	public void look_within_the_UK() throws Throwable {
	    ebayHomePage.uK();
	}

	@When("^Select auction$")
	public void select_auction() throws Throwable {
	    ebayHomePage.auction();
	}

	@When("^the auction ends soon$")
	public void the_auction_ends_soon() throws Throwable {
	    ebayHomePage.time();
	}

	@Then("^I select an \"(.*)\"$")
	public void i_select_an(String arg1) throws Throwable {
	    ebayHomePage.select();
	}

	@Then("^check the value of the next bid is less than \"(.*)\"$")
	public void check_the_value_of_the_next_bid_is_less_than(String arg2) throws Throwable {
	    ebayHomePage.compare(arg2);
	}
}
