Feature: Wikipedia searching
  As a user
  I want to use Wikipedia
  So that I find information on topics of interest

  Background:
    Given the Wikipedia site is accessed

  Scenario Outline:
    When searching for "<Term>"
    Then the returned page contains the "<Term>" header

    Examples:
    | Term        |
      | Computing   |
      | Donald Trump |
