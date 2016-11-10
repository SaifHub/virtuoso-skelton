
Feature: Amazon search
  I want to use Amazon

  Background: Title of your scenario
    Given I have visited Amazon website
    And and page has opened

  Scenario: Title of your scenario outline
    When I search for "xbox one"
    And I sort by "Featured"
    Then the first item is "xbox one s"
    Then I select item "xbox one s"
    Then I select "FIFA 1TB"
    Then I add "xbox one s" into basket
    Then I checkout the basket
    Then I decline breakdown cover
    Then I check sign in