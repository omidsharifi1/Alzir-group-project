package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProfileSettingPage {

    public ProfileSettingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "expand")
    public WebElement expandButton;

    @FindBy(css = "li[data-id='settings']")
    public WebElement settingButton;

    @FindBy(id = "displayname")
    public WebElement fullNameInput;

    @FindBy(xpath = "//div[@class='user-status-menu-item__header-content-displayname']")
    public WebElement username;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Your email address']")
    public WebElement displayEmail;

    @FindBy(id = "oc-dialog-1-content-input")
    public WebElement authenticationInput;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement confirmButton;

    @FindBy(xpath = "//select[@placeholder='Language']")
    public WebElement languageDropDown;

    @FindBy(id = "language")
    public WebElement dropDownMenu;

    @FindBy(xpath = "(//option[@value='tr'])[1]")
    public WebElement turkeyDropDown;

    @FindBy(xpath = "(//option[@value='en'])[1]")
    public WebElement englishDropDown;


    public static void selectOptionByText(WebDriver driver, String selectLocator, String optionText) {
        // Locate the select element by its locator (e.g., ID, name, XPath, etc.)
        WebElement selectElement = driver.findElement(By.id(selectLocator));

        // Create a Select object to work with the select element
        Select dropdown = new Select(selectElement);

        // Get all options within the dropdown
        List<WebElement> options = dropdown.getOptions();

        // Iterate through the options to find the desired text
        for (WebElement option : options) {
            if (option.getText().equals(optionText)) {
                // Click on the option with the desired text
                option.click();
                break; // Exit the loop after clicking the option
            }
        }
    }







}
