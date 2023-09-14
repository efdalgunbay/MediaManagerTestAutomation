@Reg
Feature: Users Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button


    Scenario: 1U User Page Control
      When Click User button
      Then User page appears

  Scenario: 2U Checking Clear Functionality On User Page
    When Click User button
    And Status Filter Area is Clicked
    And Inactive Filter is Selected
    And Click on the Clean Filter Button
    Then It is seen that the filter is cleaned