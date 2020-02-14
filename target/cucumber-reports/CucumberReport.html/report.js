$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/clickup.feature");
formatter.feature({
  "name": "Clickup board",
  "description": "  This is very explaining description",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Update Board name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User creates new folder in Clickup with id \"2493404\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Then he check is folder is created",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Delete folder that has been created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Add folder and list in Clickup",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreatNewFolder"
    }
  ]
});
formatter.step({
  "name": "User creates new folder in Clickup with id \"2572551\" and name \"Helo\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User creates a lsit with a name of \"List name\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User verifys that lsit has been made",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Update space name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreatNewFolder"
    },
    {
      "name": "@ClickUPNameChanged"
    }
  ]
});
formatter.step({
  "name": "User updates Clickup with id \"2572551\" and name of it \"New king\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User check if folder has been made \"New king\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "And creates a task \"nee\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User check if every thing has been changed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});