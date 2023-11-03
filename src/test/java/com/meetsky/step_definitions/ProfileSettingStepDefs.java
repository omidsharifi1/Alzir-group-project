package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.ProfileSettingPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ProfileSettingStepDefs {

    ProfileSettingPage settingPage = new ProfileSettingPage();

    @When("user clicks on profile")
    public void user_clicks_on_profile() {
       settingPage.expandButton.click();
    }
    @When("user clicks on setting button")
    public void user_clicks_on_setting_button() {
        settingPage.settingButton.click();
    }
    @Then("user sees fullName and username are the same")
    public void user_sees_full_name_and_username_are_the_same() {
        Assert.assertTrue(settingPage.fullNameInput.getText().equals(settingPage.username.getText()));
    }

    @When("user clicks on email input box")
    public void user_clicks_on_email_input_box() {
        settingPage.emailInput.click();

    }

    @When("user enters a proper email into the Email input box")
    public void user_enters_a_proper_email_into_the_email_input_box() {
        Faker faker = new Faker();
        settingPage.emailInput.sendKeys(faker.internet().safeEmailAddress());

    }

    @Then("user should see correct email address is displayed")
    public void user_should_see_correct_email_address_is_displayed() {
        String correctEmail = settingPage.emailInput.getText();
        Assert.assertTrue(correctEmail.equals(settingPage.displayEmail.getText()));
    }

    @When("user selects a language {string}")
    public void user_selects_a_language(String desiredLanguage) {

        Select dropdown = new Select(settingPage.dropDownMenu);

        // Get all options within the dropdown
        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {

            if (option.getText().equals(desiredLanguage)){
                option.click();
                break;
            }
        }
    }
    @Then("the user's preferred language is updated to {string}")
    public void the_user_s_preferred_language_is_updated_to(String expectedLanguage) {
        Assert.assertTrue(settingPage.turkeyDropDown.getText().equals(expectedLanguage));
    }

    @And("the user's preferred language is updated to default {string}")
    public void theUserSPreferredLanguageIsUpdatedToDefault(String defaultLanguage) {
        Assert.assertTrue(settingPage.englishDropDown.getText().equals(defaultLanguage));
    }
}
