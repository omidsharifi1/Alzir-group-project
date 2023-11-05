package com.meetsky.step_definitions;

import com.meetsky.pages.Talk_Module_conversationIN;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Talk_Module_conversation_IN {

Talk_Module_conversationIN talkModuleConversationIn = new Talk_Module_conversationIN();

    @Then("user click on talk functionality from the dashboard")
    public void user_click_on_talk_functionality_from_the_dashboard() {
        talkModuleConversationIn.clickMenuByText("Talk");

    }
    @And("User is on the talk page")
    public void user_is_on_the_talk_page() {

        String expectedPageText ="Join a conversation or start a new one";
        String actualPageText= talkModuleConversationIn.pageText.getText();
        Assert.assertTrue(expectedPageText.contains(actualPageText));

    }
    @When("user clicks on the plus icon and sees a pop-up message")
    public void user_clicks_on_the_plus_icon_and_sees_a_pop_up_message() {
        talkModuleConversationIn.creatConversation.click();

    }

    @And("user writes Conversation name in the conversation name box")
    public void userWritesConversationNameInTheConversationNameBox() {



        talkModuleConversationIn.conversationPlaceholder.sendKeys("NewConversation");




    }

    @And("user chooses Allow guests to join via link option")
    public void userChoosesAllowGuestsToJoinViaLinkOption() {
        talkModuleConversationIn.allowGuestToJoin.click();

        talkModuleConversationIn.addPraticipantsBtn.click();



    }

    @When("user adds participants by searching and selecting their names")
    public void user_adds_participants_by_searching_and_selecting_their_names() {
        talkModuleConversationIn.searchParticipant.click();

    }
    @And("user clicks on Create conversation")
    public void userClicksOnCreateConversation() {
        talkModuleConversationIn.creatConversationbtn.click();

        BrowserUtils.waitFor(5);

    }

    @Then("user should see a close button to confirm the conversation is created successfully")
    public void user_should_see_a_close_button_to_confirm_the_conversation_is_created_successfully() {

        talkModuleConversationIn.closeBtn.click();




    }





    @When("user is able to see available conversation")
    public void user_is_able_to_see_available_conversation() {

        Assert.assertTrue(talkModuleConversationIn.avilableConversation.isDisplayed());


    }




    @When("user clicks on the Three Button icon of the created conversation")
    public void user_clicks_on_the_three_button_icon_of_the_created_conversation() {
        // JavascriptExecutor js=((JavascriptExecutor)Driver.getDriver());
        //  js.executeScript("arguments[0].scrollIntoView(true)",talkModuleConversationIn.conversationBox);
        talkModuleConversationIn.hoverOverElementAndClick("//*[@id=\"app-navigation-vue\"]/ul/div/li/ul/li[1]");
        BrowserUtils.sleep(5);

        talkModuleConversationIn.threeDotButton.click();


    }


    @And("user chooses Delete Conversation option from the list")
    public void userChoosesDeleteConversationOptionFromTheList() {

        //  talkModuleConversationIn.DeleteButton.click();
//talkModuleConversationIn.DeleteButton.click();
        //  talkModuleConversationIn.clickByText("Delete conversation");

        talkModuleConversationIn.hoverOverDeleteBtnAndClick("//*[starts-with(@id, 'menu-')]/li[6]/button/span[2]");
        ;
    }

    @Then("user sees a pop-up message asking for confirmation: Delete conversation?")
    public void userSeesAPopUpMessageAskingForConfirmationDeleteConversation() {

        Assert.assertTrue(talkModuleConversationIn.popUpDeleteConversation.isDisplayed());


    }


    @And("user clicks on Yes option to confirm to delete the conversation")
    public void userClicksOnYesOptionToConfirmToDeleteTheConversation() {
        talkModuleConversationIn.yesButton.click();

    }




}
