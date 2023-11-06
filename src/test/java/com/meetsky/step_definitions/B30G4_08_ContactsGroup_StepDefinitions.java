package com.meetsky.step_definitions;

import com.meetsky.pages.ContactsPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B30G4_08_ContactsGroup_StepDefinitions {

    ContactsPage contactsPage = new ContactsPage();
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the Contacts Page")
    public void theUserIsOnTheContactsPage() {
        contactsPage.clickMenuByText("Contacts");
    }

    @When("user click the plus icon next to Groups")
    public void userClickThePlusIconNextToGroups() {

        contactsPage.AddGroupButton.click();

    }

    @And("the user creates a new group with name {string}")
    public void theUserCreatesANewGroupWithName(String groupName) {

        BrowserUtils.waitForVisibility(contactsPage.GroupNameInputBox,5);

        contactsPage.GroupNameInputBox.sendKeys(groupName);

        contactsPage.GroupNameSubmitButton.click();

    }

    @Then("the group is created successfully with name {string}")
    public void the_group_is_created_successfully(String groupName) {

    BrowserUtils.waitForVisibility(contactsPage.GroupElement,5);

       String actualGroupName = contactsPage.GroupElement.getText();


       Assert.assertEquals(groupName,actualGroupName);

    }

    @When("the user opens a contact's info menu")
    public void theUserOpensAContactSInfoMenu() {
    }

    @Then("the user can see all available groups")
    public void theUserCanSeeAllAvailableGroups() {

        List<String>expectedGroups = new ArrayList<>();
        expectedGroups.addAll(Arrays.asList("Kamran'sGroup","whatevero"));
        List<String>ActualGroups = new ArrayList<>();
        ActualGroups.addAll(Arrays.asList(contactsPage.ExpectedGroup1.getText(),contactsPage.ExpectedGroup2.getText()));
        Assert.assertTrue(expectedGroups.containsAll(ActualGroups));

    }

    @When("the user opens a contact's info page")
    public void theUserOpensAContactSInfoPage() {
    }

    @And("the user selects Choose property type")
    public void theUserSelectsFromTheDropdownMenu() {

        contactsPage.ChooseTypeBox.click();
    }

    @And("adds Anniversary as a new property")
    public void addsAsANewProperty() {
        contactsPage.AnniversaryOption.click();
    }

    @Then("the Anniversary property is added to the contact's info page")
    public void thePropertyIsAddedToTheContactSInfoPage() {
        BrowserUtils.waitForVisibility(contactsPage.AnniversarySetupTitle,3);

        Assert.assertTrue(contactsPage.AnniversarySetupTitle.isDisplayed());
    }



}
