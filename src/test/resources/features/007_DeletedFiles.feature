@wip
Feature: Manage Deleted Files
  User Story :

  As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Acceptance Criteria:

  User can order the all deleted files by newest to oldest or vice versa
  User can delete any deleted file permanently by using the three dots icon in the file’s line
  User can restore any deleted file and see it again under the All Files tab

  Background:
    Given the user logged in with username and password
    Given  user inside File page
    Then user go to Deleted Files page


#    And there are deleted files in the system

  Scenario: Order Deleted Files by Newest to Oldest or Vice Versa
    Given there is a deleted file on the top of the list
    When the user selects the option to order files by newest to oldest
    Then the deleted files should be displayed in descending order of deletion timestamp
    When the user selects the option to order files by oldest to newest
    Then the deleted files should be displayed in ascending order of deletion timestamp

  Scenario: Permanently Delete a File
    Given there is a deleted file on the top of the list
    When the user clicks on the three dots icon next to that file
    And selects the Permanently Delete option and click it
  And verify file name "Ali" is permanently deleted

#
#  Scenario: Restore a Deleted File
#    Given there is a deleted file named "family_photo.jpg"
#    When the user clicks on the three dots icon next to that file
#    And selects the "Restore" option
#    Then that file should be visible again under the "All Files" tab