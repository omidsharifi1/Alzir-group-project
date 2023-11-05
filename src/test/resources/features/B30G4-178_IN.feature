@B30G4-178
Feature: Deck Module Functionality
  As a user, I should be able to manage my works by creating a new
  board/list/card and modifying them under Deck Module.


  Background: User is already in the log in page
    Given user must login with correct credentials

  @B30G4-173
  Scenario: Board and Card Management Creating new Board
    Given User is on the dashboard and clicks on Deck Module
    When User click on three vertical lines to open board navigation
    And User click on add board button types board name in placeholder to creat new board
    Then User should see the new board on the dashboard

  @B30G4-175
  Scenario: User can create a new list of card/task under any board
    Given User is on the dashboard and clicks on Deck Module
    When User click on three vertical lines to open board navigation
    And user click on board card and clicks on plus button
    And User types list name on the placeholder to creat new list


  @B30G4-176
  Scenario: User can add a new card/task on any list on the current board
    Given User is on a board with a list
    When User adds a new card task to the list
    Then User should see the new card task on the list

  @B30G4-177
  Scenario: User can assign any card/task to himself/herself
    Given User is on a board with a card task
    When User assigns the card task to himself or herself