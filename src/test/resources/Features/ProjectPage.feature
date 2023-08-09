@Login
Feature: Project Page

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button


    Scenario: 1P Project Page Control
      When Click Project button
      Then Project page appears