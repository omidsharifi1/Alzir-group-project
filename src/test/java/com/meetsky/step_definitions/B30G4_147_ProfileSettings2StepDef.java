package com.meetsky.step_definitions;

import com.meetsky.pages.ProfileSettingPage2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hpsf.WritingNotSupportedException;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B30G4_147_ProfileSettings2StepDef {

    ProfileSettingPage2 profileSettingPage2 = new ProfileSettingPage2();

    @Then("user should see FullName,Email,PhoneNumber" )
    public void userShouldSeeFullNameEmailPhoneNumber() {
        List<String> ExpectedTitles = new ArrayList<>(Arrays.asList("Full name", "Email", "Phone number" ));
        List<String> ActualTitles = new ArrayList<>(Arrays.asList(profileSettingPage2.FullNameTag.getText(), profileSettingPage2.EmailTag.getText(), profileSettingPage2.PhoneNumberTag.getText()));

        Assert.assertTrue(ActualTitles.containsAll(ExpectedTitles));

    }

    @When("user click on profile icon on the top right corner")
    public void user_click_on_profile_icon_on_the_top_right_corner() {

        profileSettingPage2.expandButton.click();

    }
    @Then("user can see name under settings field should same under FullName input box")
    public void user_can_see_name_under_settings_field_should_same_under_full_name_input_box() {
        
        String nameUnderSetting = profileSettingPage2.NameUnderSettingFiled.getText();
        String nameUnderFullNameInput = profileSettingPage2.fullNameInput.getAttribute("value");
        Assert.assertTrue(nameUnderFullNameInput.equals(nameUnderSetting));
        

    }
    @When("user click on PhoneNumber input box")
    public void user_click_on_phone_number_input_box() {

        profileSettingPage2.phoneNumberInputBox.click();

    }

    @Then("user should not able to pass characters except numbers")
    public void phone_number_input_box_should_not_accept_characters() {

       try {
           profileSettingPage2.phoneNumberInputBox.sendKeys("!@#$%^&*qwe" );

           Assert.fail("You can pass any character, but it shouldn't be" );
       }catch (Exception e){
           //if the phone number input box can't accept characters, the assertion passes

       }

    }
}
