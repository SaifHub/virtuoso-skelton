
# @author ABDUL SAIF
# @date	  24/11/2016

  @virtuoso
  Feature: Amazon search (2)
           As a customer I want to use Amazon, so that I can search for a product - serenity

  Scenario: Amazon search and checkout (2)
    Given I open Amazon
    When I search for 'echo'
    When I select item 'echo'
    When I add 'echo' into basket
    When I decline add-on
    When I checkout the cart
    When I proceed to checkout
    Then I check sign-in