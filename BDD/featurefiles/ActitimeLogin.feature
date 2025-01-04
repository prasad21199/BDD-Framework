@actitime
Feature: Login feature
@Valid
Scenario: Valid login to actitime
Given User should enter "http://localhost/login.do" as url
When He enters "admin" as username
And He enters "manager" as password
And He clicks on login button 
Then User should be present in home page

@invalid
Scenario Outline: Invalid Login using examples
Given User should enter "http://localhost/login.do" as url
When He enters "<username>" as username
And He enters "<password>" as password
And He clicks on login button
Then Print the title of the webpage

Examples:
|username|password|
|admin|manager|
#|Virat|Anushka|
#|Admin|Admin123|