package com.btrix24.pages.login_navigation;

import com.btrix24.utilities.BrowserUtils;
import com.btrix24.utilities.ConfigurationReader;
import com.btrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[name='USER_LOGIN']")
    @CacheLookup
    public WebElement userNameElement;

    @FindBy(css = "[name='USER_PASSWORD']")
    @CacheLookup
    public WebElement passwordElement;

    @FindBy(css = "[class='login-btn']")
    public WebElement loginButtonElement;

    @FindBy(css = "[value='Log In']")
    public WebElement rememberMeElement;

    @FindBy(partialLinkText = "Forgot your password?")
    public WebElement forgotPasswordElement;

    @FindBy(css = "[title='Bitrix24']")
    public WebElement titleElement;

    @FindBy(xpath = "//div[(text()='Incorrect login or password')]")
    public WebElement errorMessageElement;


//    public void login(String username, String password) {
//        userNameElement.sendKeys(username);
//        passwordElement.sendKeys(password);
//        loginButtonElement.click();
//    }
//
//    public void login() {
//        String username = ConfigurationReader.getProperty("storemanagerusername");
//        String password = ConfigurationReader.getProperty("storemanagerpassword");
//        userNameElement.sendKeys(username);
//        passwordElement.sendKeys(password);
//        loginButtonElement.click();
//    }


    public void login(String role) {
        String username = "";
        String password = "";
        if (role.replaceAll("-", "").equalsIgnoreCase("Helpdesk")) {
            username = ConfigurationReader.getProperty("helpdeskusername");
            password = ConfigurationReader.getProperty("helpdeskpassword");
        } else if (role.equalsIgnoreCase("Marketing")) {
            username = ConfigurationReader.getProperty("marketingusername");
            password = ConfigurationReader.getProperty("marketingpassword");
        } else if (role.equalsIgnoreCase("Hr")) {
            username = ConfigurationReader.getProperty("hrusername");
            password = ConfigurationReader.getProperty("hrpassword");
        }
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();

    }

//    public String getErrorMessage() {
//        return errorMessageElement.getText();
//    }
//
//    public void clickRememberMe() {
//        BrowserUtils.waitForClickablility(rememberMeElement, Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
//        if (!rememberMeElement.isSelected()) {
//            rememberMeElement.click();
//        }
//    }


    public void goToLandingPage() {
        //Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
}
