Feature: Login To Application
Scenario: Check if the User is able to login to the application
Given The user is in Login Page
When The user enters the credentials
When Clicks on login
Then Check if the Home page is displayed