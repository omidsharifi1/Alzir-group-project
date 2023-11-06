@wip_k
Feature:US-013 Edit/Enter Profile Settings Functionality

  Background: User is already in the log in page
    Given the user is on the login page
    And the user logged in with username and password
    And user clicks on profile
    And user clicks on setting button

  @B30G4-212
  Scenario:Verify user can see at FullName/Email/PhoneNumber under Personal Info in Profile Setting Page
      Then user should see FullName,Email,PhoneNumber

  @B30G4-213
  Scenario: Verify name of the settings filed is same as name in FullName Input Box
        When user click on profile icon on the top right corner
        Then user can see name under settings field should same under FullName input box

  @B30G4-214
  Scenario:Verify user should not be able to pass characters except numbers into the PhoneNumber input box
    When user click on PhoneNumber input box
    Then user should not able to pass characters except numbers
