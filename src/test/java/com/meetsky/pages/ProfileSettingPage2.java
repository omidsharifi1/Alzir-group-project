package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingPage2 extends ProfileSettingPage{
    public ProfileSettingPage2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[@for='displayname' and contains(text(), 'Full name')]")
    public WebElement FullNameTag;

    @FindBy(xpath = "//label[@for='email' and contains(text(), 'Email')]")
    public WebElement EmailTag;

    @FindBy(xpath = "//label[@for='phone' and contains(text(), 'Phone number')]")
    public WebElement PhoneNumberTag;

    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
    public WebElement NameUnderSettingFiled;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberInputBox;

}
