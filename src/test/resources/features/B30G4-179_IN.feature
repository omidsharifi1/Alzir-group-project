@B30G4-154
Feature: Talk Module Functionality
  AC: User can create a new conversation by adding any selected participant

  Background:
    When the user logged in with username and password
    Then user click on talk functionality from the dashboard
    And User is on the talk page

  @B30G4-153

  Scenario: User creates a new conversation with selected participant
    When user clicks on the plus icon and sees a pop-up message
    And user writes Conversation name in the conversation name box
    And user chooses Allow guests to join via link option
    And user adds participants by searching and selecting their names
    And user clicks on Create conversation
    Then user should see a close button to confirm the conversation is created successfully


  @B30G4-156
  Scenario: Talk Module Functionality Deleting the Conversation

    Then user is able to see available conversation
    When user clicks on the Three Button icon of the created conversation
    And user chooses Delete Conversation option from the list
    Then user sees a pop-up message asking for confirmation: Delete conversation?
    And user clicks on Yes option to confirm to delete the conversation