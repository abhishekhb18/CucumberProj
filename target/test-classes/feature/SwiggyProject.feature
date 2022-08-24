Feature: To test the location feature of swiggy application
Background: 
Given user is in  swiggy homepage

@Location
Scenario: Check if user is able to enter location and navigate 
When The user enters the location as "bangalore" in search bar
Then Selects the first option
Then User is in restaurant list page


@Restaurant
Scenario: Check if user is able to enter to desired Restaurant page
When The user starts to  enter the "bangalore" location and navigates to restaurant list page
Then Selects and clicks on  the first restaurant from the restaurant list
Then User is in restaurant homepage

