@regressionTest
@userAcceptanceTest
Feature: Ebay Searching
	As a User
	I want to search for an item for auction
	So that I can get the item in twenty four hours


	Background: Searching for magic cards
		Given I am on the ebay home page
	
	Scenario Outline: 
		When I search for an "<item>"
		And Look within the UK
		And Select auction
		And the auction ends soon
		Then I select an "<item>"
		And check the value of the next bid is less than "<value>"

		Examples:
			|item														|value		|
			|Liliana of the veil						|70.0			|
#			|Emrakul, the Promised End			|10.0			|
#			|Ulamog, the Ceasless Hunger		|10.0			|
#			|Kozilek, the Great Distortion	|5.0			|