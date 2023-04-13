Feature: Validate the functionality of facebook application

Scenario: TC_01 Validate the login page
Given User launch Facebook website URL
Then user verify login page is displayed
When user enters  invalid username and  password
|userName|harry@gmail.com|
|passWord|harry@123|
And user clicks login button
Then user verify error message is displayed


