Feature: Login To Application
Scenario: Check if the User is able to login to the application by passing parametrs from Datatable of feature file
Given The user is in Login Page
When The user enters the <username> and <passcode>
When Clicks on login
Then Check if the Home page is displayed

Examples:
|username|passcode|
|tomsmith|SuperSecretPassword!|
|abhishek|abhid009|


Scenario: Check if the user can able to logout succesfully from the application
When The user clicks on logout button
Then Url should return back to login page