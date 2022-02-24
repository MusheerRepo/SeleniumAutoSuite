#Author: Musheer

Feature: Sign un
  Scenario: Sign un with correct credentials
    Given homepage of site
    When clicking on sign in 
    And Signing up with valid credentials
    Then user should be able to sign up