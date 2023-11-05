package com.meetsky.step_definitions;

import com.meetsky.pages.DeckModule_Page_IN;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Deck_Module_StepDefinition_IN {

    DeckModule_Page_IN deckModulePageIn = new DeckModule_Page_IN();
    LoginPage loginPage = new LoginPage();

    @Given("user must login with correct credentials")
    public void user_must_login_with_correct_credentials() {
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


    }

    @Given("User is on the dashboard and clicks on Deck Module")
    public void userIsOnTheDashboard() {
        deckModulePageIn.clickMenuByText("Deck");

    }


    @When("User click on three vertical lines to open board navigation")
    public void userClickOnThreeVerticalLinesToOpenBoardNavigation() {
        deckModulePageIn.threeVerticalLineBtn.click();

    }

    @And("User click on add board button types board name in placeholder to creat new board")
    public void userCreatesANewBoard() {
        deckModulePageIn.addBoardBtn.click();
        deckModulePageIn.boardPlaceHolder.sendKeys("New Project");
        deckModulePageIn.arrowBtn.click();

    }

    @Then("User should see the new board on the dashboard")
    public void userShouldSeeTheNewBoardOnTheDashboard() {
        Assert.assertTrue(deckModulePageIn.newBoradText.isDisplayed());

    }
    @And("user click on board card and clicks on plus button")
    public void userClickOnBoardCard() {

        deckModulePageIn.clickonCard.click();
        deckModulePageIn.creatListBtn.click();
    }

    @And("User types list name on the placeholder to creat new list")
    public void userTypesListNameOnThePlaceholderToCreatNewList() {


        BrowserUtils.sleep(2);
        deckModulePageIn.listCreatingPlaceHolder.sendKeys("My New List" + Keys.ENTER);



    }
    @Then("User should see the new list on the board")
    public void userShouldSeeTheNewListOnTheBoard() {
        Assert.assertTrue(deckModulePageIn.listName.getText().contains("My New List"));
        BrowserUtils.waitFor(5);
    }



    @Given("User is on a board with a list")
    public void userIsOnABoardWithAList() {
        deckModulePageIn.clickMenuByText("Deck");
        deckModulePageIn.threeVerticalLineBtn.click();
    }



    @When("User adds a new card task to the list")
    public void userAddsANewCardTaskToTheList() {
        deckModulePageIn.clickonCard.click();
        deckModulePageIn.addCardToListBtn.click();
        deckModulePageIn.cardNamePlaceHolder.sendKeys("New Project" +Keys.ENTER);

    }

    @Then("User should see the new card task on the list")
    public void userShouldSeeTheNewCardTaskOnTheList() {

        Assert.assertTrue(deckModulePageIn.cardNameOnList.getText().contains("New Project"));


    }






    @Given("User is on a board with a card task")
    public void userIsOnABoardWithACardTask() {
        deckModulePageIn.clickMenuByText("Deck");
        deckModulePageIn.threeVerticalLineBtn.click();
    }


    @When("User assigns the card task to himself or herself")
    public void userAssignsTheCardTaskToHimselfOrHerself() {

        deckModulePageIn.clickonCard.click();

        deckModulePageIn.assignCardToMe.click();
        BrowserUtils.sleep(1);

        deckModulePageIn.hoverOverAssignBtnAndClick("//*[starts-with(@id, 'menu-')]/li[1]/button/span[2]");


    }

    @Then("User should see user's name associated with the card task")
    public void userShouldSeeUserSNameAssociatedWithTheCardTask() {
        Assert.assertTrue(deckModulePageIn.assignCardToMe.getText().contains("Kadir"));
    }



}
