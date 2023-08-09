Feature: Language Bundles

  Background:
    Given Fill in the username field
    And Password field is filled
    And Click the login button

  @Login
    Scenario: 1L Language Bundles Control
      When Click Language Bundles button
      Then Language Bundles page appears