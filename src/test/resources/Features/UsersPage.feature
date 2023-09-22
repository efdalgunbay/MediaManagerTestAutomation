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

  Scenario: 3U Searching By Name On User Page
    When Click User button
    And A keyword is entered in the name field
    And It appears that you are searching by keyword

  Scenario: 4U Searching By Client On User Page
    When Click User button
    And Keyword is entered in the client name field Users Page
    Then It appears that you are searching by client name keyword on Users Page

  Scenario: 5U Searching By User Role On User Page
    When Click User button
    And User Role Filter is made
    And It is seen that the filter is made according to the selected Role
