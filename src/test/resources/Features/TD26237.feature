@PNP_26237
Feature: Translate save-rescue-configs for Juniper (all platforms)

  Scenario Outline: Translate save-rescue-configs for Juniper translation service (all platforms)

    When I post <payload> to translation service
    Then I get back <response> and HTTP <code> from translation service

    Examples:
      | payload                 | response |  | code |
      | save-rescue-config-t    | tResp    |  | 200  |


  Scenario Outline: Translate save-rescue-configs for Juniper deciphering service (all platforms)

    When I post <payload> to deciphering service
    Then I get back <response> and HTTP <code> from deciphering service

    Examples:
      | payload                 | response |  | code |
      | save-rescue-config-d    | dResp    |  | 200  |
      | save-rescue-config-d-er | dErResp  |  | 200  |