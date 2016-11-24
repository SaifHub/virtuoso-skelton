
    # @name: ABDUL SAIF
    # @date: 24/11/2016

  Feature: Amazon search
    As a customer I want to use Amazon, so that I can search for a product

    Scenario: Amazon search and checkout
      Given I open Amazon
      When I search for 'echo'
      #Then  I sort by 'Relevance'
      When I select item 'echo'
      When I add 'echo' into basket
      When I decline add-on
      When I checkout the cart
      When I proceed to checkout
      Then I check sign in