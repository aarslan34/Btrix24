package com.btrix24.utilities;


import com.btrix24.pages.activity_stream.ActivityStreamPage;
import com.btrix24.pages.login_navigation.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private ActivityStreamPage activityStreamPage;




    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public ActivityStreamPage activityStreamPage() {
        if (activityStreamPage == null) {
            activityStreamPage = new ActivityStreamPage();
        }
        return activityStreamPage;
    }



}
