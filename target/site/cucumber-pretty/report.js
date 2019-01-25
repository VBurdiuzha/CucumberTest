$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/SetSomeStudents.feature");
formatter.feature({
  "name": "API test for setting some students to the service",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Students"
    }
  ]
});
formatter.scenario({
  "name": "Add some students into the list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Students"
    }
  ]
});
formatter.step({
  "name": "I add some students",
  "keyword": "When "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:45"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get success status code",
  "keyword": "Then "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:61"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete first student into the list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Students"
    }
  ]
});
formatter.step({
  "name": "I delete first students",
  "keyword": "When "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:51"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get success status code",
  "keyword": "Then "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:61"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change second students into the list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Students"
    }
  ]
});
formatter.step({
  "name": "I change second students",
  "keyword": "When "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:55"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get success status code",
  "keyword": "Then "
});
formatter.match({
  "location": "SetSomeStudents_Glue.java:61"
});
formatter.result({
  "status": "passed"
});
});