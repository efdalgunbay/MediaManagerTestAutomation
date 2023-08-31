@Reg
Feature: Setting Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button


    Scenario: 1S Setting Page Control
      When Click Setting button
      Then Setting page appears