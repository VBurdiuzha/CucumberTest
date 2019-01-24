@CreditCard @Login @Git @Students
Feature: Get status form github

  Scenario Outline: Send request and get status
    When I Send <request> to the github service
    Then I should get <code> and response from <request>

    Examples:
      | request |  | code |
      | repos   |  | 200  |


