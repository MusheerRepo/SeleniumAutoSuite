#Author: Musheer

Feature: Sign in
  Scenario: Sign in with correct credentials
    Given homepage of site
    When sign in with existing credentials
    Then user should be able to login