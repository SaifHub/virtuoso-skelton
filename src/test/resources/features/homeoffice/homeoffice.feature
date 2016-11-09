Feature: Wikipedia searching
  As a user
  I want to use Home Office
  So that I find information on topics of interest

  Background:
    Given the Home Office site is accessed

  Scenario Outline:
    When searching for "<Term>"
    Then the returned page contains the "<Term>" header

    Examples:
      | Term        |
      | Computing   |
      | Donald Trump |
