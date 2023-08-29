@Home
Feature: Home Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button


    Scenario: 1H Home Page Control
      Then Home page appears

  Scenario: 2H Start Date Filter Control
    And Click on the start date filter field
    And Click on Start Date Option Field
    And Click Last Month
    And Click on Content Type Write


  Scenario: 3H Deadline Filter Control
    And Click on the deadline filter field
    And Select Date Option Field Clicked
    And Last 7 Days Click
    And Click on Content Type Write

  Scenario: 4H Content Type Filter Control
    And Click on Content Type
    And Ad-hoc selected
    Then It is seen that filtering is done in Ad-hoc type
    And Click on Content Type Write

  Scenario: 5H Product Area Filter Control
    And Click on the Product Area filter field
    And Cloud filter is selected
    And Click on Content Type Write

  Scenario: 6H Product Filter Control
    And Click on the Product filter field
    And Android filter is selected
    And Click on Content Type Write

  Scenario: 7H Clear Filter Control
    And Click on the Product Area filter field
    And Cloud filter is selected
    And Click on Content Type Write
    And Click on Clean Filter Button