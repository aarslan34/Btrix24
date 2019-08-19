$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  As user I want to login as a helpdeskuser",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Btrix24_Login"
    }
  ]
});
formatter.scenario({
  "name": "Login as a helpdeskuser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_Login"
    },
    {
      "name": "@helpdeskuser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"help-desk\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a marketinguser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_Login"
    },
    {
      "name": "@marketinguser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"marketing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a hruser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_Login"
    },
    {
      "name": "@hruser"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});