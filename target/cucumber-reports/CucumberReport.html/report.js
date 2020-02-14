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
  "name": "User has CLICKUP space with ID \"2493404\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user changes Click board name to \"LetsGetTheBread\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "check if board name was updated to \"LetsGetTheBread\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});