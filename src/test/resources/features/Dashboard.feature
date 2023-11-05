@B30G4-135
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page
    When the user logged in with username and password

  @B30G4-162
  Scenario: Username functionality verification
    When User can see username displayed

  @B30G4-164
  Scenario: Set Status button and Status option functionality verification
    When  User clicks on set status button
    And User clicks Online option
    And User clicks Away option
    And User clicks Do not disturb option
    Then  User clicks Invisible option and sets status

  @B30G4-163
  Scenario: Widgets functionality verification
    When  User clicks on Customize button
    Then User can select any of the Widgets

  @B30G4-189
  Scenario: Module functionality verification
    When user is on the Dashboard page user sees all modules



