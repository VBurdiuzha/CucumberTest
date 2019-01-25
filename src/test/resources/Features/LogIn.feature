@CreditCard @Login @Git

Feature: LoginFeature
  Some description for this feature

  Scenario: Login with correct username and password (DataTable implementation)
    Given I navigate to the login page
    And I enter the data of person
    |username|password|
    |Bil     |1234567 |
    |Bob     |7654321 |

    And I click login button
    Then I should see the form page

  Scenario Outline: Login with correct username and password using scenario outline  (Outline implementation)
    Given I navigate to the login page
    And I enter the <username> and <password>
    And I click login button
    Then I should see the form page

    Examples:
      |username |password|
      |Bili     |1234567 |
      |Bobi     |7654321 |
      |Addi     |8888888 |
      |Puma     |7777777 |