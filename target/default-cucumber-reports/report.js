$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/activity_stream/Activity_Stream.feature");
formatter.feature({
  "name": "activity_stream",
  "description": "    As a user I should be able to create a task from activity stream",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Btrix24_activity_stream"
    }
  ]
});
formatter.scenario({
  "name": "Verify that user can create new task by clicking on tasks onactivity stream.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_activity_stream"
    },
    {
      "name": "@create_task"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Task",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_on_Task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the title with \"Sample Title\"  and the body of the message as \"Body of the message\"",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_fills_in_the_title_with_and_the_body_of_the_message_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user picks a deadline",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_picks_a_deadline()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can upload a file and image or link or add checklist regarding to new task.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Btrix24_activity_stream"
    },
    {
      "name": "@upload_file"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Task",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_on_Task()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills in the title with \"Sample Title\"  and the body of the message as \"Body of the message\"",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_fills_in_the_title_with_and_the_body_of_the_message_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user uploads link to new task",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_uploads_link_to_new_task()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});