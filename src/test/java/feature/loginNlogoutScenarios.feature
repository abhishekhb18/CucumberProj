Feature: Login and Logout To Application
Scenario: Check if the User is able to login to the application
Given The user is in Login Page
When The user enters the credentials
When Clicks on login
Then Check if the Home page is displayed

Scenario: Check if the user can able to logout succesfully from the application
When The user clicks on logout button
Then Url should return back to login page