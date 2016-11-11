package example.amazon;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;
import static java.lang.Thread.sleep;

public class AmazonStepDefinitions extends SeleniumTest{
	
	private AmazonHomePage amazonHomePage;
	
	@Given("^I have visited Amazon website$")
	public void i_have_visited_Amazon_website() throws Throwable {
	    amazonHomePage = AmazonHomePage.launch();
	}

	@Given("^page has opened$")
	public void and_page_has_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
	    amazonHomePage.AmazonSearch(arg1);
	}

	@When("^I sort by \"([^\"]*)\"$")
	public void i_sort_by(String arg1) throws Throwable {
	    amazonHomePage.SortBy(arg1);
	    sleep(5000);
	}

	@Then("^the first item is \"([^\"]*)\"$")
	public void the_first_item_is(String arg1) throws Throwable {
	    String checked = amazonHomePage.Check();
	    //assertor.assertTrue("Check string " + checked + " contains " + arg1, checked.contains(arg1));
	    System.out.println("Checked '" + checked + "'");
	    sleep(5000);
	}
	
	@Then("^I select item \"([^\"]*)\"$")
	public void i_select_item(String arg1) throws Throwable {
	    amazonHomePage.Select();
	    sleep(5000);
	}
	
	@Then("^I select \"([^\"]*)\"$")
	public void i_select(String arg1) throws Throwable {
	    amazonHomePage.TB();
	    sleep(5000);
	}
	
	@Then("^I add \"([^\"]*)\" into basket$")
	public void i_add_into_basket(String arg1) throws Throwable {
		amazonHomePage.Basket();
		sleep(5000);
	}
	
	@Then("^I checkout the basket$")
	public void i_checkout_the_basket() throws Throwable {
		amazonHomePage.Checkout();
		sleep(5000);
	}
	
	@Then("^I decline breakdown cover$")
	public void i_decline_breakdown() throws Throwable {
		amazonHomePage.Nothanks();
		sleep(5000);
	}
	
	@Then("^I check sign in$")
	public void i_check_sign_in() throws Throwable {
	    String checked2 = amazonHomePage.Signin();
	    System.out.println("Checked '" + checked2 + "'");
	    sleep(5000);
	}

}
