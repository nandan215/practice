Feature: Registeration

Background:
Given  browser is open
And Application is launched

Scenario: To fill up the form

Given nandn enter the name
When nandan enter the game

Scenario: I am the boss

Given the msessage show
When the user below enter

Scenario Outline: i am Verifying details

Given the details are shown
And i Enter the <"user id"> and <"password">

Examples:
|user id|password|
|ram|rahim|
|ganga|jamuna|

Scenario: doing the stuff of form

When  user signup with following details
|deny|col|annd@gmail.com|




