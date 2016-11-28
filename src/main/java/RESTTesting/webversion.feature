@restall
@appversion
Feature: Application Version Identification
  As an administrator of the Mock Authentication service
  I want to identify the version that is deployed
  So that I can assert compatibility of services
  
@regression
  Scenario: Visit webpage
    When I visit the given "https://www.amazon.co.uk/argage"
    Then the responce status "404" is returned
