@Student
Feature: API test for setting some students to the service

  Scenario : Add some students into the list
    When I add some students add2
    Then I should get new list sixStudents after adding

#  Scenario : Delete first student into the list
#    When I delete first students
#    Then I should get new list after deleting and success code
#
#  Scenario : Change second students into the list
#    When I change some students
#    Then I should get new list after changing and success code
#
#    Examples:
#      | students  |  | list         | code |
#      | add2      |  | sixStudents  | 200  |
#    #  | deleteFirst |  | fiveStudent | 200 |
#      | putSecond |  | secondUpdate | 200  |