
# @author ABDUL SAIF
# @date	  10/11/2016

  @virtuoso
  Feature: Amazon search
          As a customer I want to use Amazon, so that I can search for a product

  Background: Amazon Website
    Given I have visited Amazon website

  Scenario: Amazon search and checkout
    When I search for "echo dot"
    And  I sort by "Relevance"
    Then the first item is "echo dot"
    Then I select item "echo dot"
    Then I add "echo dot" into basket
    Then I decline add-on
    Then I check the cart
    Then I check sign-in