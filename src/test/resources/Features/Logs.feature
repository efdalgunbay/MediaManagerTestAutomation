Feature: Logs Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button

  @Login
    Scenario: 1LO Logs Page Control
      When Click Logs button
      Then Logs Page appears