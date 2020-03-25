@Oxford_Academy_feature
Feature: Oxford Academy Website

@tc01_Oxford_Academy_register 
Scenario: Registering into Oxford Academy

Given Launch Chrome browser
Then open Oxford Academy website
Then register the valid details
Then close browser

@tc02_Oxford_Academy_login
Scenario Outline: Logging into Oxford Academy

Given the user launch chrome
Then the user opens website
Then The user login using "<emailId>" and "<password>" with vaild and invaild deatils
Then the user closes the browser

Examples:

|emailId                          |password     |
|mahachan@gmail.com		          |truedream	|
|koms@gmail.com	                  |komskitty	|
|mahalakshmi.c98@gmail.com	      |Maha@12345	|

@tc03_Oxford_Academy_Download_journal
Scenario: download Csv.file from journal
	
Given I launch the chrome browser 
When I open the oxford website
Then I click the journalAtoZ button
Then I click dispatch date button
Then I select a journal
Then I download the file
And I close the page

@tc04_Oxford_Academy_Print_UserId
Scenario: Printing the UserId

Given I launched the chrome browser
When I opened the website
Then I print the email id
And I closed the page

@tc5_Oxford_Academy_Currency_change
Scenario: Changing the currency

Given user launched the chrome browser
When user opened the website
Then user select book
Then user select currency
And user close the page