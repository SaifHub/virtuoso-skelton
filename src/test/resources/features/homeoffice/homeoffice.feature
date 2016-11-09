Feature: Homeoffice searching
  As a user
  I want to use Homeoffice
  So that I find information on topics of interest

  Background:
    Given the Homeoffice site is accessed

  Scenario Outline:
    When searching for "<Passport>"
    Then the returned page contains the "<Passport>" header

    Examples:
      | Policies    |
      | Statistics  |
