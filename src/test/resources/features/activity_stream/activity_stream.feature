##UserstoryandAC:As a user I should be able to create a task from activity stream.Ø
## Verify that user can create new task by clicking on tasks onactivity stream.
## Verify that user can upload a file and image or link or add checklist regarding to new task.
## Verify that user should be able to set up a deadline for new task.
@Btrix24_activity_stream
  Feature: activity_stream
    As a user I should be able to create a task from activity stream

    Scenario: Verify that user can create new task by clicking on tasks onactivity stream.

      Given user logs in as a "help-desk"
      When user clicks on Task
      And user fills in the title with "Sample Title"  and the body of the message as "Body of the message"
      Then user picks a deadline

