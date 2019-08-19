package com.btrix24.step_definitions;

import com.btrix24.pages.activity_stream.ActivityStreamPage;
import com.btrix24.pages.login_navigation.LoginPage;
import com.btrix24.utilities.BrowserUtils;
import com.btrix24.utilities.ConfigurationReader;
import com.btrix24.utilities.Driver;
import com.btrix24.utilities.Pages;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    Pages pages = new Pages();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @Then("user logs in as a {string}")
    public void user_logs_in_as_a(String user) {

        pages.loginPage().login(user);
        BrowserUtils.waitPlease(1);

    }

//    @When("user clicks on Task")
//    public void user_clicks_on_Task() {
//        BrowserUtils.waitPlease(3);
//        activityStreamPage.taskTab.click();
//        //waitUntilLoaderScreenDisappear();
//    }
//
//    @And("user fills in the title with {string}  and the body of the message as {string}")
//    public void user_fills_in_the_title_with_and_the_body_of_the_message_as(String title, String body) {
//        activityStreamPage.titleTask.sendKeys("title");
//        activityStreamPage.bodyTask.sendKeys("body");
//    }
//
//
//    @Then("user picks a deadline")
//    public void user_picks_a_deadline() {
//
//        activityStreamPage.pickDeadline();
//        activityStreamPage.sendKey.click();
//
//    }
//



//    @Then("user logs in as a store manager")
//    public void user_logs_in_as_a_store_manager() {
//        String username = ConfigurationReader.getProperty("storemanagerusername");
//        String password = ConfigurationReader.getProperty("storemanagerpassword");
//        pages.loginPage().login(username, password);
//    }


//    @Then("user logs in with {string} username and {string} password")
//    public void user_logs_in_with_username_and_password(String string, String string2) {
//       pages.loginPage().login(string, string2);
//    }





//    @When("user logs in as a {string}")
//    public void user_logs_in_as_a(String role) {
//        pages.loginPage().login(role);
//    }

}
