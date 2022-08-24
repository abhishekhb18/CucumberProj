Feature: Login To Application to demonstrate hook 
Scenario: Check if the User is able to login to the application
Given The user is on login page of Test Appln
When The user tries to  enter the credentialss  "Test" and "Test"
When Clicks on that login button 
Then Check if the user is able to login sucessfully to the appln


Scenario: Check if the page title is correct for Login page
Given The user is on the login page
Then Check if the page title is "The Internet"

