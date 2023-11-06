package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {

    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@aria-label='Actions'][1]")
    public WebElement rectangleIconButton;

    @FindBy(xpath = "//span[contains(.,'Day')]")
    public WebElement dayButton;

    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement dayView;

    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement weekView;


    @FindBy(xpath = "//span[contains(.,'Week')]")
    public WebElement weekButton;


    @FindBy(xpath = "//span[contains(.,'Month')]")
    public WebElement monthButton;
    @FindBy(xpath = "//a[@id='fc-dom-715']")
    public WebElement monthView;

    @FindBy(xpath = "//button[contains(.,'New event')]")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitle;

    @FindBy(xpath = "(//input[@placeholder='Pick a date and a time'])[1]")
    public WebElement startEventDateAndTime;

    @FindBy(xpath = "(//input[@placeholder='Pick a date and a time'])[2]")
    public WebElement endEventDateAndTime;

    @FindBy(xpath = "//button[contains(.,'OK')]")
    public WebElement okButton;


    @FindBy(xpath = "//textarea[@placeholder='Add a location']")
    public WebElement locationInput;

    @FindBy(xpath = "//textarea[@placeholder='Add a description']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='fc-event-title']")
    public WebElement createdEventTitle;

    public List<WebElement> getWeekViews() {
        List<WebElement> weekViews = Driver.getDriver().findElements(By.xpath("//div[@class='fc-scrollgrid-sync-inner']"));
        return weekViews;
    }

    @FindBy(xpath = "div[class='fc-event-title']")
    public List<WebElement> titleOption;

    public void viewByTitle(String text){
        try {
            for (WebElement title : titleOption) {
                if (title.getAttribute("aria-label").equalsIgnoreCase(text)) {
                    Assert.assertTrue(title.isDisplayed());
                }
            }
        }catch(Exception e){
            System.err.println("No such element found with text: " + text);
            e.printStackTrace();
        }
    }
}
