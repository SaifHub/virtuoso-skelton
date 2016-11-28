
# @author ABDUL SAIF
# @date	  10/11/2016

@virtuoso
Feature: Belly

  @growl
  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  @silent
  Scenario: no cukes
    Given I have 20 cukes in my belly
    When I wait 1 hour
    Then my belly should silent

