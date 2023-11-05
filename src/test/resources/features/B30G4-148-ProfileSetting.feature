@B30G4-187
Feature: Default

  Background: User is already in the log in page
    Given the user is on the login page
    When the user logged in with username and password
    When user clicks on profile
    When user clicks on setting button

  @B30G4-184
  Scenario: Verify user can see full name and username are matching
    Then user sees fullName and username are the same


  @B30G4-185
  Scenario: Scenario: Verify user can enter correct email address
    And user clicks on email input box
    When user enters a proper email into the Email input box
    Then user should see correct email address is displayed


  @B30G4-186
  Scenario: Verify user can change language
    And user selects a language "Türkçe"
    And the user's preferred language is updated to "Türkçe"


  @B30G4-188
  Scenario: Changing back to the default language
    And user selects a language "English (US)"
    And the user's preferred language is updated to default "English (US)"