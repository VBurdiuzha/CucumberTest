@API
  Feature: API test for creating a few rules for redirect service

    Scenario Outline: Create <rule> for service
      When I send request with <rule> to the service
      Then I should get status <code> and <rule>

      Examples:
        | rule  |  | code |
        | Rule1 |  | 200  |
        | Rule2 |  | 200  |