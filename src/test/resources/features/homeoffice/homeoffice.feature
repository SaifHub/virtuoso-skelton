
# @author : ABDUL SAIF
# @date	  : 01/12/2016

@virtuoso
Feature: Homeoffice navigation
  As a customer I want to use Homeoffice, so that I can navigate through the webpage

  Scenario: Homeoffice navigate to Student Finance
    Given I open Homeoffice
    When I look for 'finance'
    When I select link 'student finance login'
    When I select 'start now'
    When I fill in username 'saif'
    Then I fill in password 'is the best'