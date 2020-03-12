Search

Meta:
@search
@smoke

Narrative:
  In order to find content in an aplication
  As a regular user
  I want to be able to search by search term

Lifecycle:
Before:
Scope: SCENARIO
Given I open Landing page
When I log in with username sslava543@gmail.com and password qwerty12345

Scenario: Search by search term
Given I should see Home page
When I search for hr
Then I should see hr in each search result




