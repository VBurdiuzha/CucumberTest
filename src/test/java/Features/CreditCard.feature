@CreditCard @Login @Git

Feature: Operations with my credit card
  implementation with using DataTable

  Scenario: I want withdraw money from my card
    Given I have card balance
      | balance | withdraw | current | operation |
      | 900     | 300      | 600     | success   |
      | 900     | 500      | 400     | success   |
      | 900     | 999      | error   | failed    |

    When I want withdraw withdraw money from my balance
    When I want get information about current money on card
    Then I want to get message about operation
