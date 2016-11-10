Feature: Amazon Searching
	As a User
	I want to search for an Item
	So I can add an item to my basket
	
	Background:
	Given I am on the home page for Amazon.co.uk

	Scenario Outline: Title of your scenario
	When I search for an "<Item>" of interest
	And I select the "<Item>" I wish to buy
	Then I add the "<Item>" to my basket

		Examples:
		|Item					|
		|Fire Tv Stick|
		|Amazon Echo	|
