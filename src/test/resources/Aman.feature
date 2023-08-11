Feature: To validate the login functionality of application
Background: 
Given To launch the chrome browser and maximise window
Scenario: to validate login with empty username
When To launch the url of the amazon application
And To click the signin button
And To pass valid username in email field
And To click the login button
Then To close the browser 

 
