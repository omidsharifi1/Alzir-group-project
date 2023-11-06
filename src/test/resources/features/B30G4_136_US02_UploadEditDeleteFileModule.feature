@B30G4-183
Feature: Default

  Background:
    Given the user is on the login page
    Given the user logged in with username and password
    Given User click on the "Files" link and be on the files page

  @B30G4-172
  Scenario: US02AC1TC1 Verify user can upload a file

    When User clicks on the + icon
    And User clicks on "Upload file" and choose file from their computer
    Then User should see the successful uploaded file displayed in Files page


  @B30G4-174
  Scenario: US02AC2TC2 Verify user can create a new folder

    When User clicks on the + icon
    And User clicks on "New folder"
    And User clicks on the arrow icon
    Then User should see "New folder" folder displayed in Files page

  @B30G4-180
  Scenario: US02AC2TC3 Verify user can create a new folder that the same name is already exist

    When User clicks on the + icon
    And User clicks on "New folder"
    And User clicks on the arrow icon and see the error message
    And User enters "NancyFolder" as the new name and Enter
    Then user should see the "NancyFolder" folder displayed in Files page


  @B30G4-181
  Scenario: US02AC3TC4 Verify user can delete any selected item from its three dots menu

    When user hover to "nancy_file1_plsNotDelete" folder
    When User clicks on the three dots icon on nancy_file file
    And User clicks on Delete folder option
    When user is on Delete files page
    Then User should see nancy_file in Delete files page


  @B30G4-182
  Scenario: US02AC4TC5 Verify user can see the total number of files and folders under the files list table

    When User scroll down to the end of the page
    Then User should see the total number of files and folders