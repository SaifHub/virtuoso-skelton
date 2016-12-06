
# @author : ABDUL SAIF
# @date	  : 06/12/2016

@virtuoso
Feature: Belly and Cukes

  @growl
  Scenario: A few cukes
    Given I have '40' cukes in my belly
    When I wait '1' hour
    Then my belly should 'growl'

  @silent
  Scenario: No cukes
    Given I have '20' cukes in my belly
    When I wait '1' hour
    Then my belly should 'silent'

