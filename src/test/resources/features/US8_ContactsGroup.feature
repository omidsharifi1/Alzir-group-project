@wip_k
Feature: Contact Group Functionality under Contacts Module (US-008)

  Background: User is already in the log in page
    Given the user logged in with username and password
    Given the user is on the Contacts Page

  Scenario: User creates a new group under Contacts Module
    Given the user is on the Contacts Page
    When user click the plus icon next to Groups
    And the user creates a new group with name "KamGroup"
    Then the group is created successfully with name "KamGroup"

  #Scenario: User views available groups in the contact's info menu
    #Given the user is on the Contacts Page
    #When the user opens a contact's info menu
    #Then the user can see all available groups in the dropdown menu

  #Scenario: User adds a new property "Anniversary" to a contact's info page
    #Given the user is on the Contacts Page
    #When the user opens a contact's info page
    #And the user selects "Add new property" from the dropdown menu
    #And adds "Anniversary" as a new property
    #Then the "Anniversary" property is added to the contact's info page

