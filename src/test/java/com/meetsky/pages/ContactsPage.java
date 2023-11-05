package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage extends LoginPage {


    public void ClickContact(){

    }

    public ContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='newgroup']/div/div/button")
    public WebElement AddGroupButton;

    @FindBy(xpath ="//input[@class='action-input__input focusable']")
    public WebElement GroupNameInputBox;

    @FindBy(xpath = "//label[contains(@for, 'action-')]")
    public WebElement GroupNameSubmitButton;

    @FindBy(xpath = "//span[@title='KamGroup']")
    public WebElement GroupElement;

    @FindBy(xpath = "//span[contains(@title,'Kamran')]")
    public WebElement ExpectedGroup1;

    @FindBy(xpath = "//span[@title='whatevero']")
    public WebElement ExpectedGroup2;

    @FindBy(xpath ="//input[@placeholder='Choose property type']" )
    public WebElement ChooseTypeBox;

    @FindBy(xpath ="//div[@title='Anniversary']")
    public WebElement AnniversaryOption;

    @FindBy(xpath = "//div[@class='property property--last property-anniversary']")
    public WebElement AnniversarySetupTitle;
}
