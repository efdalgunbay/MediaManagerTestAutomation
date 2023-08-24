@Login
Feature: Project Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button


    Scenario: 1P Project Page Control
      When Click Project button
      Then Project page appears

      Scenario: 2P New Task Control
        When Click Project button
        And The project is searched in the Project Area
        And Click Open Task Button
        And Click Add Task Button
        And Click Blog Task Button
        When Task Name is Entered
        And Services The field is filled
        And Product Area The field is filled
        When Product The field is filled
        And Task Assigned to a Person
        And Click Save Button
        Then New Blog Task Appears to be Saved



