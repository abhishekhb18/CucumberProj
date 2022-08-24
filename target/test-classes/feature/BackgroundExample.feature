Feature: login and search for the product
Background: 
Given user is in homepage

@login
Scenario: verify login is functionsl
When The user  enter the  TestUserid and  TestPassword
|abhishekhb18@gmail.com |Abhidoo9! |
Then check if user has  logged in succesfully

@search
Scenario: Search for a product
When the user is on search page
Then gives the search term as "Shirts"
And clicks on search icon