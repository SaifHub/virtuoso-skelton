package example.amazon;

import amazon.AmazonHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;
import static java.lang.Thread.sleep;

public class AmazonStepDefinitions extends SeleniumTest{

	AmazonHomePage amazonHomePage;

	@Given("^I visit amazon's website$")
	public void i_visit_amazon_s_website() throws Throwable {
		amazonHomePage = AmazonHomePage.launch();
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws Throwable {
		amazonHomePage.AmazonSearch(arg1);
		sleep (5000);
	}

	@When("^I click the first result$")
	public void i_click_the_first_result() throws Throwable {
		amazonHomePage.AmazonResult();
		sleep (5000);
	}

	@When("^I read the reviews$")
	public void i_read_the_reviews() throws Throwable {
		amazonHomePage.AmazonReview();
		sleep (5000);
		amazonHomePage.AmazonHome();
		sleep (500);
	}

	@Then("^I add item to basket$")
	public void i_add_item_to_basket() throws Throwable {
		amazonHomePage.AmazonBasket();
		sleep (5000);
		
	}


}
