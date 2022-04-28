Feature: Test first hello api
  
  Scenario: first test
    Given url 'http://localhost:8080/firsthelloapi/hello'
    When method GET
    Then status 200
