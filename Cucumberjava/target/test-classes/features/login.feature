@SmokeScenario
Feature: to test login functionalty

  Scenario: check login successful with credential
    Given user is on login page
    When user enters  username and password
    And click on login page
    Then user is navigate to main page
