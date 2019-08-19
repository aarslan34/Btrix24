package com.btrix24.pages.activity_stream;

import com.btrix24.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage {

    //@FindBy(xpath = "//span[text()='Task']")
//    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
//    public WebElement taskTab;

    @FindBy(id = "task-edit-title")
    public WebElement titleTask;

    @FindBy(xpath = "//html//body")
    public WebElement bodyTask;

    @FindBy(id = "datepicker-display")
    public WebElement datePicker;

    @FindBy(css = "[class='bx-calendar-right-arrow']")
    public WebElement nextMonthArrow;

    @FindBy(xpath = "//span[text()='Select']")
    public WebElement selectDateButton;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendKey;

    public void pickDeadline(){
        datePicker.click();
        BrowserUtils.waitPlease(1);
        nextMonthArrow.click();
        BrowserUtils.waitPlease(1);
        selectDateButton.click();
        BrowserUtils.waitPlease(1);

    }



}
