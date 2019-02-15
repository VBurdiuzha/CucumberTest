@PNP
Feature: Translate payload for Juniper (all platforms)

  Scenario Outline: Translate payload for Juniper translation service (all platforms)

    When I post <payload> to translation service !
    Then I get back <response> and HTTP <code> from translation service !

    Examples:
      | payload | response |  | code |
      | payload | tResp    |  | 200  |


  Scenario Outline: Translate payload for Juniper deciphering service (all platforms)

    When I post <payload> to deciphering service !
    Then I get back <response> and HTTP <code> from deciphering service !

    Examples:
      | payload  | response |  | code |
      | commands | dResp    |  | 200  |
