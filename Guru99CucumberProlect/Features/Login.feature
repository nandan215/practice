Feature: Login feature
Scenario: login to the webpage

Given browser is launch
When user enter <"loginid"> and <"password">
And user click the submit button
Then user can view the dashboard webpage
Then a browser is close

@smoke
Scenario: Add customer
Given user is adding all detail
Then user save it



