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

//    @And("user clicks on Task")
//    public void user_clicks_on_Task() {
//        BrowserUtils.waitPlease(3);
//        //activityStreamPage.taskTab.click();
//        waitUntilLoaderScreenDisappear();
//    }

    @Then("user fills in the title with {string}  and the body of the message as {string}")
    public void user_fills_in_the_title_with_and_the_body_of_the_message_as(String title, String body) {
        activityStreamPage.titleTask.sendKeys("title");
        activityStreamPage.bodyTask.sendKeys("body");
    }


    @Then("user picks a deadline")
    public void user_picks_a_deadline() {

        activityStreamPage.pickDeadline();
        activityStreamPage.sendKey.click();

    }


}
