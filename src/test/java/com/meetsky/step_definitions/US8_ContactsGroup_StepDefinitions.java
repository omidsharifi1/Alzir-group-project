package com.meetsky.step_definitions;

import com.meetsky.pages.ContactsPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US8_ContactsGroup_StepDefinitions {

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

    }

    @Then("the group is created successfully with name {string}")
    public void the_group_is_created_successfully(String groupName) {

    BrowserUtils.waitForVisibility(contactsPage.GroupElement,5);

       String actualGroupName = contactsPage.GroupElement.getText();

       Assert.assertEquals(actualGroupName,groupName);

    }

    @When("the user opens a contact's info menu")
    public void theUserOpensAContactSInfoMenu() {
    }

    @Then("the user can see all available groups in the dropdown menu")
    public void theUserCanSeeAllAvailableGroupsInTheDropdownMenu() {
    }

    @When("the user opens a contact's info page")
    public void theUserOpensAContactSInfoPage() {
    }

    @And("the user selects {string} from the dropdown menu")
    public void theUserSelectsFromTheDropdownMenu(String arg0) {
    }

    @And("adds {string} as a new property")
    public void addsAsANewProperty(String arg0) {
    }

    @Then("the {string} property is added to the contact's info page")
    public void thePropertyIsAddedToTheContactSInfoPage(String arg0) {
    }



}
