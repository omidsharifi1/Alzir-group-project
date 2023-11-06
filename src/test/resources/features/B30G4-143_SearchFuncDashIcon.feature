@B30G4-210
Feature: Search functionalities and Dashboard Icon

	@B30G4-208
	Scenario: User should be able to search file inside any Module and see the details of the file
		Given the user logged in with username and password
		When User clicks on the search icon
		And User types files name "Readme.md" into the search box
		And User clicks on the found files name "Readme.md"
		Then User should see the side page with the details of the file

	
	@B30G4-209
	Scenario: User should navigate to the Dashboard page after clicking on MeetSky icon in the top left corner
		Given the user logged in with username and password
		When User clicks on the MeetSky icon
		Then User should see the Dashboard page