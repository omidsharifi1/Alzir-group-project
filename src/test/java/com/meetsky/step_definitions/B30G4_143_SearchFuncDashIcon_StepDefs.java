package com.meetsky.step_definitions;

import com.meetsky.pages.DashboardPage;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class B30G4_143_SearchFuncDashIcon_StepDefs {


    DashboardPage dashboardPage = new DashboardPage();

    @When("User clicks on the search icon")
    public void user_clicks_on_the_search_icon() {
        dashboardPage.searchButton.click();
    }

    @And("User types files name {string} into the search box")
    public void user_types_files_name_into_the_search_box(String fileName) {
        dashboardPage.searchBox.sendKeys(fileName);
    }

    @And("User clicks on the found files name {string}")
    public void user_clicks_on_the_found_files_name(String string) {
        dashboardPage.foundFileBtn.click();
    }

    FilesPage filesPage = new FilesPage();

    @Then("User should see the side page with the details of the file")
    public void user_should_see_the_side_page_with_the_details_of_the_file() {
    Assert.assertTrue(filesPage.sidebar.isDisplayed());

    }

//for the second Scenario:
    @When("User clicks on the MeetSky icon")
    public void user_clicks_on_the_meet_sky_icon() {
        dashboardPage.meetSkylogoBtn.click();
    }

    @Then("User should see the Dashboard page")
    public void user_should_see_the_dashboard_page() {
        String actualURL =  Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.meetsky.net/index.php/apps/dashboard/#/";

        Assert.assertEquals(actualURL, expectedURL);

    }
}
