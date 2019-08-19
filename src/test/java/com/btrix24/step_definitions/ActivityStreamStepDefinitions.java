package com.btrix24.step_definitions;

import com.btrix24.pages.activity_stream.ActivityStreamPage;
import com.btrix24.pages.login_navigation.LoginPage;
import com.btrix24.utilities.BasePage;
import com.btrix24.utilities.BrowserUtils;
import com.btrix24.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivityStreamStepDefinitions extends BasePage {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    Pages pages = new Pages();



    @When("user clicks on Task")
    public void user_clicks_on_Task() {
        BrowserUtils.waitForClickablility(activityStreamPage.taskTab, 5);
        activityStreamPage.taskTab.click();
        //waitUntilLoaderScreenDisappear();
    }

    @And("user fills in the title with {string}  and the body of the message as {string}")
    public void user_fills_in_the_title_with_and_the_body_of_the_message_as(String title, String body) {
        BrowserUtils.waitForClickablility(activityStreamPage.titleTask, 5);
        activityStreamPage.titleTask.sendKeys("title");
        //activityStreamPage.bodyTask.sendKeys("body");
    }


    @Then("user picks a deadline")
    public void user_picks_a_deadline() {

        activityStreamPage.pickDeadline();
        activityStreamPage.sendKey.click();
        BrowserUtils.waitPlease(2);

    }

    @Then("user uploads link to new task")
    public void user_uploads_link_to_new_task() {
        activityStreamPage.linkButton.click();
        activityStreamPage.linkUrlBox.sendKeys("http://www.google.com");
        activityStreamPage.linkSaveButton.click();
        BrowserUtils.waitPlease(2);

    }


}
