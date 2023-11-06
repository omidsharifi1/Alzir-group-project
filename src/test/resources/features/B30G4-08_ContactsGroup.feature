@wip_k
Feature: Contact Group Functionality under Contacts Module (US-008)

  Background: User is already in the log in page
    Given the user logged in with username and password
    And the user is on the Contacts Page

  @B30G4-203
  Scenario: User creates a new group under Contacts Module
    Given the user is on the Contacts Page
    When user click the plus icon next to Groups
    And the user creates a new group with name "KamGroup"
    Then the group is created successfully with name "KamGroup"


  @B30G4-204
  Scenario: User views available groups under Groups
    Given the user is on the Contacts Page
    When the user opens a contact's info menu
    Then the user can see all available groups
  @B30G4-205
  Scenario: User adds a new property "Anniversary" to a contact's info page
    Given the user is on the Contacts Page
    When the user opens a contact's info page
    And the user selects Choose property type
    And adds Anniversary as a new property
    Then the Anniversary property is added to the contact's info page

