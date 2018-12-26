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
        "Rule1",
        "",
        "200"
      ]
    },
    {
      "cells": [
        "Rule2",
        "",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Rule1 for service",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I send request with Rule1 to the service",
  "keyword": "When "
});
formatter.match({
  "location": "API_testGlue.java:38"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get status 200 and Rule1",
  "keyword": "Then "
});
formatter.match({
  "location": "API_testGlue.java:44"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c400\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:555)\n\tat org.junit.Assert.assertEquals(Assert.java:542)\n\tat Glue.API_testGlue.lambda$new$1(API_testGlue.java:54)\n\tat ✽.I should get status 200 and Rule1(src/test/java/Features/API_test.feature:6)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Create Rule2 for service",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@API"
    }
  ]
});
formatter.step({
  "name": "I send request with Rule2 to the service",
  "keyword": "When "
});
formatter.match({
  "location": "API_testGlue.java:38"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get status 200 and Rule2",
  "keyword": "Then "
});
formatter.match({
  "location": "API_testGlue.java:44"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c400\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat org.junit.Assert.assertEquals(Assert.java:555)\n\tat org.junit.Assert.assertEquals(Assert.java:542)\n\tat Glue.API_testGlue.lambda$new$1(API_testGlue.java:54)\n\tat ✽.I should get status 200 and Rule2(src/test/java/Features/API_test.feature:6)\n",
  "status": "failed"
});
});