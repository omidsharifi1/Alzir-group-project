package com.meetsky.step_definitions;

import com.meetsky.pages.CalendarPage;
import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class B30G4_139_CalendarViewStepDefs {


    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();

    @When("User clicks on calendar option")
    public void user_clicks_on_calendar_option() {
        loginPage.clickMenuByText("Calendar");
    }

    @When("User clicks on rectangle shape icon")
    public void user_clicks_on_rectangle_shape_icon() {
        calendarPage.rectangleIconButton.click();
    }

    @When("User clicks on Day")
    public void user_clicks_on_day() {
        calendarPage.dayButton.click();
    }

    @Then("User sees day view in the calendar")
    public void user_sees_day_view_in_the_calendar() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E M/d/yyyy");
        String currentDateString = currentDate.format(formatter);
        String expectedDay = calendarPage.dayView.getText();
        Assert.assertEquals("Calendar date doesn't match the current date", expectedDay, currentDateString);
    }


    @When("User clicks on Week")
    public void user_clicks_on_week() {
        calendarPage.weekButton.click();
    }

    @Then("User sees week view in the calendar")
    public void user_sees_week_view_in_the_calendar() {
/*
List<WebElement> weekViews = calendarPage.getWeekViews(); // Assuming getWeekViews() retrieves a list of week view elements.
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E M/d/yyyy");
        String currentDateString = currentDate.format(formatter);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // Adjust the timeout as needed.
        for (WebElement each : weekViews) {
            wait.until(ExpectedConditions.visibilityOf(each));
            String expectedWeek = each.getText();
            Assert.assertTrue("Calendar week doesn't match the current date", currentDateString.contains(expectedWeek));
        }
 */
        calendarPage.viewByTitle("Week");
    }


    @When("User clicks on Month")
    public void user_clicks_on_month() {
        calendarPage.monthButton.click();
    }

    @Then("User sees month view in the calendar")
    public void user_sees_month_view_in_the_calendar() {
       calendarPage.viewByTitle("Month");
    }


    @When("User clicks on new event button")
    public void user_clicks_on_new_event_button() {
        calendarPage.newEventButton.click();
    }

    @When("User types {string}")
    public void user_types(String eventTitle) {
        calendarPage.eventTitle.sendKeys(eventTitle);

    }

    @And("User types start {string}")
    public void userTypesStart(String startDateAndTime) {
        calendarPage.startEventDateAndTime.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        calendarPage.startEventDateAndTime.sendKeys(startDateAndTime);
    }

    @And("User types end {string}")
    public void userTypesEnd(String endDateAndTime) {
        calendarPage.endEventDateAndTime.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        calendarPage.endEventDateAndTime.sendKeys(endDateAndTime);
    }

    @And("User types location {string}")
    public void userTypesLocation(String location) {
        calendarPage.locationInput.sendKeys(location);
    }

    @And("User types inside {string}")
    public void userTypesInside(String description) {
        calendarPage.descriptionInput.sendKeys(description);
    }


    @When("User clicks on save button")
    public void user_clicks_on_save_button() {
        calendarPage.saveButton.click();
    }

    @Then("User sees {string} on related day on month view calendar")
    public void user_sees_on_related_day_on_month_view_calendar(String expectedEvent) {

        calendarPage.viewByTitle(expectedEvent);
    }



}
