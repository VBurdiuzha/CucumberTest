$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/API_git.feature");
formatter.feature({
  "name": "Get status form github",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Git"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Send request and get status",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I Send \u003crequest\u003e to the github service",
  "keyword": "When "
});
formatter.step({
  "name": "I should get \u003ccode\u003e and response from \u003crequest\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "request",
        "",
        "code"
      ]
    },
    {
      "cells": [
        "repos",
        "",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Send request and get status",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Git"
    }
  ]
});
formatter.step({
  "name": "I Send repos to the github service",
  "keyword": "When "
});
formatter.match({
  "location": "API_GitGlue.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get 200 and response from repos",
  "keyword": "Then "
});
formatter.match({
  "location": "API_GitGlue.java:39"
});
formatter.result({
  "status": "passed"
});
});