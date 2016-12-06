
# @author : ABDUL SAIF
# @date	  : 28/11/2016

  @virtuoso
  Feature: REST Fetch
           As administrator I want to receive a response

  @regression
    Scenario: Visit webpage
    When I visit the given webpage "https://www.amazon.co.uk/saifisthebest"
    Then the response status "404" is returned