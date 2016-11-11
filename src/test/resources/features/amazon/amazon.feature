
@tag
Feature: Ainsley Harriot Cutout
	As a customer I want to add items to basket so that I can make a purchase.
  
@tag1
Scenario: Amazon search
  Given I visit amazon's website
  When I search for "Ainsley Harriot cutout"
	And I click the first result
	And I read the reviews
  Then I add item to basket