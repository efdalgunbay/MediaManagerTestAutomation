Feature: Users Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button

  @Login
    Scenario: 1U User Page Control
      When Click User button
      Then User page appears