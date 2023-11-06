@B30G4-158
Feature: Default

	Background: User is already in the log in page
		Given the user is on the login page
		When the user logged in with username and password
		When User clicks on calendar option
		When User clicks on rectangle shape icon

	# 
	#
	# 
	@B30G4-149
	Scenario: Verify user can display day calendar view
		    And User clicks on Day
		    Then User sees day view in the calendar	

	
	@B30G4-150
	Scenario: Verify user can display week calendar view
		    When User clicks on Week
		    Then User sees week view in the calendar	

	
	@B30G4-151
	Scenario: Verify user can display month calendar view
		    When User clicks on Month
		    Then User sees month view in the calendar	

	
	@B30G4-152
	Scenario Outline: Verify user can create a new event under the Calendar module and see it on Month Calendar view
		    When User clicks on new event button
		    And User types "<eventTitle>"
		    And User types start "<startDateAndTime>"
		    And User types end "<endDateAndTime>"
		    And User types location "<location>"
		    And User types inside "<description>"
		    And User clicks on save button
		    And User clicks on rectangle shape icon
		    When User clicks on Month
		    Then User sees "<expectedEvent>" on related day on month view calendar
		
		    Examples: Event values that are going to be used in the scenario outline
		
		      | eventTitle        | startDateAndTime       | endDateAndTime        | location    | description                       | expectedEvent     |
		      | Thanks Giving Day | 11/03/2023 at 10:00 AM | 11/03/2023 at 8:00 PM | San Diego   | Family ThanksGiving dinner        | Thanks Giving Day |
		      | Boxing Day        | 11/05/2023 at 9:00 AM  | 11/05/2023 at 3:00 PM | Los Angeles | Boxing match with LA and SD teams | Boxing Day        |
		      | Cydeo Day         | 11/08/2023 at 8:00 AM  | 11/08/2023 at 1:00 PM | New York    | Anniversary of Cydeo company      | Cydeo Day         |