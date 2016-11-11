Feature: Gov searching
  As a user
  I want to use Gov
  So that I find information on topics of interest

  Background:
    Given the Gov site is accessed

  Scenario:
    When searching for "finance"
    Then the returned page contains the "finance" header
