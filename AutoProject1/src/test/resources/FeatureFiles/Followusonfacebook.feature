#Author: Musheer

Feature: Homepage
  Scenario: Follow us on facebook
    Given homepage of site
    When sign in with existing credentials
    Then user should be able to login
    When email added to the follow us on facebook field
    And click on submit button
    Then the site should be followed on facebook
    
