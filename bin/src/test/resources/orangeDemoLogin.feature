Feature: Check the login functionality with orange hrm demo page

Scenario: Login check with valid credentials

Given User should be on orange hrm login page
When User enters the username as "Admin" and passsword as "admin123"
And user clicks the login button for orange hrm page
Then User should see the dashboard text in the homepage

