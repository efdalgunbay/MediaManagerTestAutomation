Feature: Home Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button

    @Login
    Scenario: 1H Home Page Control
      Then Home page appears