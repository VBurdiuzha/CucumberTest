@TD24115
Feature: Translate/Decipher BFD on Cisco

  Scenario Outline: Translate payload for BFD on Cisco translation service

    When I post <payload> to translation service!
    Then I get back <response> and HTTP <code> from translation service!

    Examples:
      | payload | response |  | code |
      | payload | TR24115    |  | 200  |


  Scenario Outline: Translate payload for BFD on Cisco deciphering service

    When I post <payload> to deciphering service!
    Then I get back <response> and HTTP <code> from deciphering service!

    Examples:
      | payload  | response |  | code |
      | commands | DR24115    |  | 200  |
