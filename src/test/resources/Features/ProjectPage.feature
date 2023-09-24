@Reg
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

  Scenario: 3P Sending To Arcgived Any Existing Project On Programs Page
    When Click Project button
    And Click on the program filter area
    And Archive Program Filter is Selected
    And Archive Programs Are Seen Listed

  Scenario: 4P Searching By Keyword Functionality On Programs Page
    When Click Project button
    And The project is searched in the Project Area
    And It is seen that the program name comes according to the entered keyword

  Scenario: 5P Filtering By Status On Programs Page
    When Click Project button
    And Task Status Filter Area is Clicked
    And Click on Ready to Start Task Status
    And It is seen that tasks that are Ready to Start are coming


  Scenario: 6P Filtering By Start Date and Delivered Date On Programs Page
    When Click Project button
    And Click on the Start Date Filter Field
    And Any Date Selected
    Then It is seen that it is filtered according to the selected date

  Scenario: 7P Checking Clear Functionality On Programs Page
    When Click Project button
    And Task Status Filter Area is Clicked
    And Click on Ready to Start Task Status
    And Click on the Clean Filter Button

  Scenario: 8P Checking Sorting Functionality On Programs Page
    And On the project page click the Sort by name button
    Then It can be seen that it is sorted by name on the project page
    And On the project page click the Sort by status button
    Then It can be seen that it is sorted by status on the project page
    And On the project page click the Sort by Progress button
    Then It can be seen that the project page is sorted by Progress
    And On the project page click the Sort by Total Cost button
    Then On the project page it can be seen that it is sorted according to Total Cost
    And On the project page click the Sort by Start Date button
    Then On the project page it can be seen that it is sorted by Start Date





