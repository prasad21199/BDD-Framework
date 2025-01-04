Feature: Google search feature
Scenario: Verify Google search 
Given User should be present in google webpage
When User searches for something
Then search page should be displayed