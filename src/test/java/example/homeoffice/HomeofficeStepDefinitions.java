package example.homeoffice;

/*
* @name : ABDUL SAIF
* @date : 02/12/2016
*/

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class HomeofficeStepDefinitions {

    HomeofficeHomePage homeofficeHomePage;

    @Given("^I open Homeoffice$")
    public void i_open_Homeoffice()
    {
        homeofficeHomePage.open();
    }

    @When("^I look for '(.*)'$")
    public void iSearchForFinance(String actionName)
    {
        homeofficeHomePage.search(actionName);
    }

    @When("^I select link '(.*)'$")
    public void i_select_item_student_finance_login(String actionName)
    {
        homeofficeHomePage.selectLink(actionName);
    }

    @When("^I select '(.*)'$")
    public void i_select_start_now(String actionName)
    {
        homeofficeHomePage.startNow(actionName);
    }

    @When("^I fill in username '(.*)'$")
    public void iFillInUsername(String actionName)
    {
        homeofficeHomePage.insertUsername(actionName);
    }

    @Then("^I fill in password '(.*)'$")
    public void iFillInPassword(String actionName)
    {
        homeofficeHomePage.insertPassword(actionName);
    }
}