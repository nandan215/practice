$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Guru99CucumberProlect/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "Add customer",
  "description": "",
  "id": "login-feature;add-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is adding all detail",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user save it",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefination.user_is_adding_all_detail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDefination.user_save_it()"
});
formatter.result({
  "status": "skipped"
});
});