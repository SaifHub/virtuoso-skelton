package example.serenity;

/*
* @name: ABDUL SAIF
* @date: 24/11/2016
*/

//import com.testerstories.tutorial.todos.pages.AmazonHomePage;
//import static org.assertj.core.api.Assertions.assertThat;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
//import net.thucydides.core.annotations.Steps;
//
//public class AmazonStepDefinition {
//
//    private AmazonHomePage amazonHomePage;
//
//    //METHODS below are glued to FEATURES available within amazon.feature
//    @Given("^I open Amazon$")
//    public void iOpenAmazon()  {
//        amazonHomePage.open();
//    }
//
//    @When("^I search for '(.*)'$")
//    public void iSearchFor(String actionName) {
//        amazonHomePage.search(actionName);
//    }
//
//    //@Then("^I sort by '(.*)'$")
//    //public void iSortBy(String actionName) {
//    //    amazonHomePage.sort(actionName);
//    //}
//
//    @When("^I select item '(.*)'$")
//    public void iSelectItem(String actionName) {
//        amazonHomePage.selectItem();
//    }
//
//    @When("^I add 'echo' into basket$")
//    public void iAddIntoBasket() {
//        amazonHomePage.basket();
//    }
//
//    @When("^I decline add-on$")
//    public void iDeclineAddon() {
//        amazonHomePage.declineAddOn();
//    }
//
//    @When("^I checkout the cart$")
//    public void iCheckTheCart() {
//        amazonHomePage.cart();
//    }
//
//    @When("^I proceed to checkout$")
//    public void iProceedToCheckout() {
//        amazonHomePage.checkout();
//    }
//
//    @Then("^I check sign in$")
//    public void iCheckSignIn() {
//        amazonHomePage.signIn();
//    }
//
//} // END of AmazonStepDefinition class