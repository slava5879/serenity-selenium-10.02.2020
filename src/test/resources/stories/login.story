Login

Meta:
@login

Narrative:
  In order to access the appication
  As a regular user
  I want to be able to log in via email

Scenario: Successful log in
Given I open Landing page
When I log in with username <user> and password <password>
Then I should see Home page

Examples:
|user|password|
|sslava543@gmail.com|qwerty12345|