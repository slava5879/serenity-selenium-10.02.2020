Login

Meta:
@login

Narrative:
  In order to access the appication
  As a regular user
  I want to be able to log in via email

Lifecycle:
Before:
Scope: SCENARIO
Given I open Landing page

Scenario: Successful log in
When I log in with username $user and password $password
Then I should see Home page

Examples:
|user|password|
|sslava543@gmail.com|qwerty12345|
|SSLAVA543@gmail.com|qwerty12345|