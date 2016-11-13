package example.amazon;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.homeoffice.virtuoso.framework.test.SeleniumTest;

import static java.lang.Thread.sleep;

/**
 * Created by adrian on 10/11/16.
 */
public class AmazonStepDefinition extends SeleniumTest {

    AmazonHomePage amazonHomePage;

    @Given("^I have visited amazon\\.co\\.uk$")
    public void i_have_visited_amazon_co_uk() throws Throwable {
        amazonHomePage = AmazonHomePage.launch();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String search) throws Throwable {
        amazonHomePage.enterSearch(search);
    }

    @When("^I select the link \"([^\"]*)\"$")
    public void i_select_the_link(String arg1) throws Throwable {
        amazonHomePage.clickLinkText(arg1);
    }

    @Then("^I can add it to my basket$")
    public void i_can_add_it_to_my_basket() throws Throwable {
        amazonHomePage.clickAddToBasket();
    }

    @And("^my basket contains \"([^\"]*)\" item with a subtotal \"([^\"]*)\"$")
    public void myBasketContainsItemWithASubtotal(String item, String price) throws Throwable {
        amazonHomePage.clickBasket();
        String items = amazonHomePage.returnSubtotalItems();
        String subtotal = amazonHomePage.returnSubtotalPrice();
        assertor.assertTrue("Check number of items contains " + item + ", actual: " + items, items.contains(item));
        assertor.assertTrue("Check price equals " + price + ", actual: " + subtotal, subtotal.contains(price));
    }
}
