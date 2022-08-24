Feature: Login To Application with Different Scenarios
Scenario Outline: Check if the User is able to login to the application with Different Scenarios
Given The user is in Login Page
When The user tries to enter the user name as <usernaming> and password as <passwording>
Then The user should able to see the appropriate message <message>

Examples:

|usernaming|passwording|message|
|tomsmith|wrongpassword|flash error|
|wrongid|SuperSecretPassword!|flash error|
|tomsmith|SuperSecretPassword!|flash success|
