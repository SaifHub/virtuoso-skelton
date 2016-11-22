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

  @silent
  Scenario: zero hours
    Given I have 50 cukes in my belly
    When I wait 0 hour
    Then my belly should silent

