@B30G4-200
Feature: Default

	Background:
		#@B30G4-193
		Given the user logged in with username and password
		    Given  user inside File page
		    Then user go to Deleted Files page
		

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # {color:#de350b}*User can order the all deleted files by newest to oldest or vice versa*{color}
	# # User can delete any deleted file permanently by using the three dots icon in the file’s line
	# # User can restore any deleted file and see it again under the All Files tab
	@B30G4-198
	Scenario: User can order the all deleted files by newest to oldest or vice versa
		Given there is a deleted file on the top of the list
		When the user selects the option to order files by newest to oldest
		Then the deleted files should be displayed in descending order of deletion timestamp
		When the user selects the option to order files by oldest to newest
		Then the deleted files should be displayed in ascending order of deletion timestamp	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.
	#
	#{color:#de350b}*_Acceptance Criteria:_*{color}
	# # User can order the all deleted files by newest to oldest or vice versa
	# # {color:#de350b}*User can delete any deleted file permanently by using the three dots icon in the file’s line*{color}
	# # User can restore any deleted file and see it again under the All Files tab
	@B30G4-199
	Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
		Given there is a deleted file on the top of the list
		When the user clicks on the three dots icon next to that file
		And selects the Permanently Delete option and click it
		And verify file name "Ali" is permanently deleted