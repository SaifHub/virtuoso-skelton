Feature: Gov searching
  As a user
  I want to use Gov
  So that I find information on topics of interest

  Background:
    Given the Gov site is accessed

  Scenario Outline:
    When searching for "<Term>"
    Then the returned page contains the "<Term>" header

    Examples:
    	| Term 	|	
      | visa    |
