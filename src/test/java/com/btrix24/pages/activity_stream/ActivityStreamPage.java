package com.btrix24.pages.activity_stream;

import com.btrix24.utilities.BrowserUtils;
import com.btrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {

    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //@FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-tasks']//span[contains(text(),'Task')]")
    public WebElement taskTab;

    @FindBy(css = "input[data-bx-id='task-edit-title']")
    public WebElement titleTask;
// can't find element???
//    @FindBy(xpath = "/html[1]/body[1][@style='min-height: 84px;']")
//    public WebElement bodyTask;

    @FindBy(xpath = "//span[@class='task-options-destination-wrap date']//input[@class='task-options-inp']")
    public WebElement datePicker;

    @FindBy(css = "[class='bx-calendar-right-arrow']")
    public WebElement nextMonthArrow;

    @FindBy(xpath = "//span[text()='Select']")
    public WebElement selectDateButton;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendKey;

    @FindBy(xpath = "//span[@id='bx-b-link-task-form-lifefeed_task_form']//i")
    public WebElement linkButton;

    @FindBy(xpath = "//td//input[@id='linklifefeed_task_form-href']")
    public WebElement  linkUrlBox;

    @FindBy(css = "input[class='adm-btn-save']")
    public WebElement linkSaveButton;

    @FindBy(css = "span[class='feed-task-info-text-title'] >a")
    public List<WebElement> createdTaskList;

    public void a(){

        for (WebElement el: createdTaskList
             ) {
            System.out.println(el.getText());
        }

    }

//    public Boolean isCreated (){
//        for(WebElement element : createdTaskList ){
//            if (element.getAttribute().contains())
//        }
//
//        return true;
//    }

//    @FindBy(xpath = "//a[contains(text(),'rdd')]")
//    public WebElement createdTask1;



    public void pickDeadline(){
        datePicker.click();
        BrowserUtils.waitPlease(1);
        nextMonthArrow.click();
        BrowserUtils.waitPlease(1);
        selectDateButton.click();
        BrowserUtils.waitPlease(1);

    }



}
