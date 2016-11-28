package example.serenity;

/*
* @name: ABDUL SAIF
* @date: 24/11/2016
*/

import static org.assertj.core.api.Assertions.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class StepDefinitionS {

    private HomePageS homePageS;

    //METHODS below are glued to FEATURES available within amazon.feature
    @Given("^I open Amazon$")
    public void iOpenAmazon()  {
        homePageS.open();
    }

    @When("^I search for '(.*)'$")
    public void iSearchFor(String actionName) {
        homePageS.search(actionName);
    }

    @When("^I select item '(.*)'$")
    public void iSelectItem(String actionName) {
        homePageS.selectItem();
    }

    @When("^I add 'echo' into basket$")
    public void iAddIntoBasket() {
        homePageS.basket();
    }

    @When("^I decline add-on$")
    public void iDeclineAddon() {
        homePageS.declineAddOn();
    }

    @When("^I checkout the cart$")
    public void iCheckTheCart() {
        homePageS.cart();
    }

    @When("^I proceed to checkout$")
    public void iProceedToCheckout() {
        homePageS.checkout();
    }

    @Then("^I check sign in$")
    public void iCheckSignIn() {
        homePageS.signIn();
    }

} // END of AmazonStepDefinition class