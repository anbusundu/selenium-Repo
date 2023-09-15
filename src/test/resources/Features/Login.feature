Feature: Check the Login function for Fb page

Scenario: Login page check with valid credentials

Given User is on facebook page
When User enters the username
And User enters the password
And User clicks the Login button

Then User should see the homepage
