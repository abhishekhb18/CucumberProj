Feature: Login To Application
Scenario: Check if the User is able to login to the application by passing parametrs from feature file
Given The user is in Login Page
When The user enters the "tomsmith" and "SuperSecretPassword!"
When Clicks on login
Then Check if the Home page is displayed