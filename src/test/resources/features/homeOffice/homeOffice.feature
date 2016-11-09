Feature: HomeOffice searching
  As a user
  I want to use HomeOffice Website
  So that I can select links from the page header

  Background:
    Given the HomeOffice site is accessed

  Scenario Outline:
    When selecting a link on "<Term>"
    Then the returned page contains the "<Term>" header

    Examples:
      | Term        |
      | Statistics  |
      | Policies    |
