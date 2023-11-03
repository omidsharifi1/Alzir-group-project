package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//*[@id='menu-twxrl']/li[2]/span/form/label")
    public WebElement GroupNameSubmitButton;

    @FindBy(xpath = "//span[@title='']")
    public WebElement GroupElement;
}
