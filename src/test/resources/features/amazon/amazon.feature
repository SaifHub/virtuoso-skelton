
# @author ABDUL SAIF
# @date	  10/11/2016


	Feature: Amazon search
  				 As a customer I want to use Amazon, so that I can search for a product

  Background: Amazon Website
    Given I have visited Amazon website
    And   page has opened

  Scenario: Amazon search and checkout
    When I search for "xbox one"
    And  I sort by "Featured"
    Then the first item is "xbox one s"
    Then I select item "xbox one s"
    Then I select "FIFA 1TB"
    Then I add "xbox one s" into basket
    Then I checkout the basket
    Then I decline breakdown cover
    Then I check sign in