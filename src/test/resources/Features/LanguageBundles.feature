@Reg
Feature: Language Bundles

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button

  Scenario: 1L Language Bundles Control
    When Click Language Bundles button
    Then Language Bundles page appears

  Scenario: 2L Checking Clear Filtering Functionalty On Laguage Bundles Page
    When Click Language Bundles button
    And Test name is entered in the name field
    And It is seen that there are filters related to the test name
    And Click the Clear Button
    And The filter field appears to be deleted

  Scenario: 3L Searching By Name On Laguage Bundles Page
    When Click Language Bundles button
    And Keyword is entered in the name field
    Then It appears that you are searching by keyword on Laguage Bundles Page

  Scenario: 4L Searching By Client On Laguage Bundles Page
    When Click Language Bundles button
    And Keyword is entered in the client name field
    Then It appears that you are searching by client name keyword on Laguage Bundles Page

  Scenario: 5L Checking Adding New Languages Bundle On Language Bundles Page
    When Click Language Bundles button
    And Click on the add new language button
    And Any name can be entered in the name field
    And Client name is entered in the client field
    And Language option is selected as English
    And Click on the save button
    And It appears that the new language has been registered
