package com.meetsky.step_definitions;

import com.meetsky.pages.DashboardPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;


public class DashboardStepDefs {


    DashboardPage dashboardPage = new DashboardPage();


    @When("User can see username displayed")
    public void userCanSeeUsernameDisplayed() {

        dashboardPage.usernameExpression.click();
        BrowserUtils.sleep(3);
        BrowserUtils.verifyElementDisplayed(dashboardPage.username);
    }

    @When("user is on the Dashboard page user sees all modules")
    public void userIsOnTheDashboardPageUserSeesAllModules() {

        List<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboard", "Files", "Photos", "Activity", "Talk", "Mail", "Contacts", "Calendar", "Notes", "Deck", "Tasks"));

        List<String> actualModules = new ArrayList<>();
        for (WebElement module : dashboardPage.modulesOptions) {
            actualModules.add(module.getAttribute("aria-label"));
        }

        Set<String> expected = new TreeSet<>(expectedModules);
        Set<String> actual = new TreeSet<>(actualModules);

        Assert.assertEquals(expected, actual);


}

    @When("User clicks on Customize button")
    public void userClicksOnCustomizeButton() {
        dashboardPage.customizeButton.click();
    }


    @Then("User can select any of the Widgets")
    public void userCanSelectAnyOfTheWidgets() {
        for (WebElement widget :dashboardPage.widgetsOptions) {
            dashboardPage.checkIfClickable(widget);
        }

    }


    @When("User clicks on set status button")
    public void user_clicks_on_set_status_button() {
        dashboardPage.statusButton.click();

        }




    @And("User clicks Online option")
    public void userClicksOnlineOption() {
        dashboardPage.onlineStatus.click();
    }

    @And("User clicks Away option")
    public void userClicksAwayOption() {
        dashboardPage.awayStatus.click();
    }

    @And("User clicks Do not disturb option")
    public void userClicksDoNotDisturbOption() {
       dashboardPage.dndStatus.click();
    }

    @Then("User clicks Invisible option and sets status")
    public void userClicksInvisibleOptionAndSetStatus() {

        dashboardPage.invisibleStatus.click();
        dashboardPage.setStatusButton.click();
        BrowserUtils.sleep(5);
        dashboardPage.homeStatus.isDisplayed();
    }
    }

