$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/PNP-26237.feature");
formatter.feature({
  "name": "Translate save-rescue-configs for Juniper (all platforms)",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@26237"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Translate save-rescue-configs for Juniper translation service (all platforms)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I post \u003cpayload\u003e to translation service",
  "keyword": "When "
});
formatter.step({
  "name": "I get back \u003cresponse\u003e and HTTP \u003ccode\u003e from translation service",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "payload",
        "response",
        "",
        "code"
      ]
    },
    {
      "cells": [
        "save-rescue-config-t",
        "tResp",
        "",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Translate save-rescue-configs for Juniper translation service (all platforms)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@26237"
    }
  ]
});
formatter.step({
  "name": "I post save-rescue-config-t to translation service",
  "keyword": "When "
});
formatter.match({
  "location": "PNP_26237Glue.java:47"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get back tResp and HTTP 200 from translation service",
  "keyword": "Then "
});
formatter.match({
  "location": "PNP_26237Glue.java:58"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Translate save-rescue-configs for Juniper deciphering service (all platforms)",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I post \u003cpayload\u003e to deciphering service",
  "keyword": "When "
});
formatter.step({
  "name": "I get back \u003cresponse\u003e and HTTP \u003ccode\u003e from deciphering service",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "payload",
        "response",
        "",
        "code"
      ]
    },
    {
      "cells": [
        "save-rescue-config-d",
        "dResp",
        "",
        "200"
      ]
    },
    {
      "cells": [
        "save-rescue-config-d-er",
        "dErResp",
        "",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Translate save-rescue-configs for Juniper deciphering service (all platforms)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@26237"
    }
  ]
});
formatter.step({
  "name": "I post save-rescue-config-d to deciphering service",
  "keyword": "When "
});
formatter.match({
  "location": "PNP_26237Glue.java:52"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get back dResp and HTTP 200 from deciphering service",
  "keyword": "Then "
});
formatter.match({
  "location": "PNP_26237Glue.java:69"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Translate save-rescue-configs for Juniper deciphering service (all platforms)",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@26237"
    }
  ]
});
formatter.step({
  "name": "I post save-rescue-config-d-er to deciphering service",
  "keyword": "When "
});
formatter.match({
  "location": "PNP_26237Glue.java:52"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get back dErResp and HTTP 200 from deciphering service",
  "keyword": "Then "
});
formatter.match({
  "location": "PNP_26237Glue.java:69"
});
formatter.result({
  "status": "passed"
});
});