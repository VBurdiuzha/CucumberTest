$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/CreditCard.feature");
formatter.feature({
  "name": "Operations with my credit card",
  "description": "  Some description for this feature",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "I want withdraw money from my card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I have card balance",
  "rows": [
    {
      "cells": [
        "balance",
        "withdraw",
        "current",
        "operation"
      ]
    },
    {
      "cells": [
        "900",
        "300",
        "600",
        "success"
      ]
    },
    {
      "cells": [
        "900",
        "500",
        "400",
        "success"
      ]
    },
    {
      "cells": [
        "900",
        "999",
        "error",
        "failed"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "CreditCardGlue.iHaveCardBalance(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want withdraw withdraw money from my balance",
  "keyword": "When "
});
formatter.match({
  "location": "CreditCardGlue.iWantGetInformationAboutCurrentMoneyOnCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want get information about current money on card",
  "keyword": "When "
});
formatter.match({
  "location": "CreditCardGlue.iWantWithdrawMoneyFromMyBalance()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to get message about operation",
  "keyword": "Then "
});
formatter.match({
  "location": "CreditCardGlue.iWantToGetMessageAboutOperation()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/java/Features/LogIn.feature");
formatter.feature({
  "name": "LoginFeature",
  "description": "  Some description for this feature",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Login with correct username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGlue.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the data of person",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Bil",
        "1234567"
      ]
    },
    {
      "cells": [
        "Bob",
        "7654321"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iEnterTheDataOfPerson(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with correct username and password using scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Bili",
        "1234567"
      ]
    },
    {
      "cells": [
        "Bobi",
        "7654321"
      ]
    },
    {
      "cells": [
        "Addi",
        "8888888"
      ]
    },
    {
      "cells": [
        "Puma",
        "7777777"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with correct username and password using scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGlue.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Bili and 1234567",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iEnterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with correct username and password using scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGlue.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Bobi and 7654321",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iEnterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with correct username and password using scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGlue.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Addi and 8888888",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iEnterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with correct username and password using scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreditCard"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginGlue.iNavigateToTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Puma and 7777777",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iEnterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginGlue.iClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the form page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginGlue.iShouldSeeTheUserformPage()"
});
formatter.result({
  "status": "passed"
});
});