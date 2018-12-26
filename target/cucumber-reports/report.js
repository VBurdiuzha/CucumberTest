$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/API_test.feature");
formatter.feature({
  "name": "API test for creating a few rules for redirect service",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Create \u003crule\u003e for service",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I send request with \u003crule\u003e to the service",
  "keyword": "When "
});
formatter.step({
  "name": "I should get status \u003ccode\u003e and \u003crule\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "rule",
        "",
        "code"
      ]
    },
    {
      "cells": [
        "request1",
        "",
        "200"
      ]
    },
    {
      "cells": [
        "request2",
        "",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create request1 for service",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I send request with request1 to the service",
  "keyword": "When "
});
formatter.match({
  "location": "API_testGlue.java:38"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Cannot find file by path: null\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat util.UtilMethods.getFile(UtilMethods.java:15)\n\tat Glue.API_testGlue.lambda$new$0(API_testGlue.java:40)\n\tat ✽.I send request with request1 to the service(src/test/java/Features/API_test.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "I should get status 200 and request1",
  "keyword": "Then "
});
formatter.match({
  "location": "API_testGlue.java:44"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create request2 for service",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I send request with request2 to the service",
  "keyword": "When "
});
formatter.match({
  "location": "API_testGlue.java:38"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Cannot find file by path: null\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat util.UtilMethods.getFile(UtilMethods.java:15)\n\tat Glue.API_testGlue.lambda$new$0(API_testGlue.java:40)\n\tat ✽.I send request with request2 to the service(src/test/java/Features/API_test.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "I should get status 200 and request2",
  "keyword": "Then "
});
formatter.match({
  "location": "API_testGlue.java:44"
});
formatter.result({
  "status": "skipped"
});
});