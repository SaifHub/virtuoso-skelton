
# @author ABDUL SAIF
# @date	  01/12/2016

@virtuoso
Feature: Wikipedia searching
  As a user
  I want to use Wikipedia
  So that I find information on topics of interest

  Scenario Outline: Wikipedia search
    Given the Wikipedia site is accessed
    When I search for '<Item>'
    Then I check results

  Examples:
  | Item      	   |
  | Computing 	   |
  | United Kingdom |
  | Apple          |

