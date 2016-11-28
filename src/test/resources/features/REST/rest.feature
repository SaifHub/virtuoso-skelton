
# @author ABDUL SAIF
# @date	  28/11/2016

  @virtuoso
  Feature: RESTful fetch
           As administrator I want to recieve a response

  @regression
    Scenario: Visit webpage
    When I visit the given webpage "https://www.amazon.co.uk/argage"
    Then the response status "404" is returned