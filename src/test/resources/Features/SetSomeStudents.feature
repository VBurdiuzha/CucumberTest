@Students

Feature: API test for setting some students to the service

  Scenario: Add some students into the list
    When I add some students
    Then I should get success status code

  Scenario: Delete first student into the list
    When I delete first students
    Then I should get success status code

  Scenario: Change second students into the list
    When I change second students
    Then I should get success status code
