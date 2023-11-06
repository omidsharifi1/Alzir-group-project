@done
Feature: Users should be able to login

User Story:
As a user, I should be able to change folder view order by using Name,Size, Modified buttons.

  @done
  Scenario: login as users
    Given the user logged in with username and password
    When user click on Files
    And user click on name
    Then User can change folder view order by Name

  @done
  Scenario: login as users
   Given the user logged in with username and password
    When user click on Files
    And user click on size
    Then User can change folder view order by size

  @done
  Scenario: login as users
   Given the user logged in with username and password
   When user click on Files
   And user click on Modified
   Then User can change folder view order by Modified`

  @done
  Scenario: login as users
    Given the user logged in with username and password
    When user click on Files
    And user click on select all
    Then User can see  all the files at once and see the total values of all files in the first line



