Feature: Login To Application using datatable w/o header and with header
@woheader
Scenario: login to amazon app without header
When The user starts to enter the valid amazon uderid and amazon password
|test@test.com |SuperSecretPassword! |
Then user has logged into amazon app succesfully

@header
Scenario: login to amazon appln for header
When The user progress to enter the valid amazon useridn and amazon passcode
|userid       |Password    |
|user@test.com|password123 |
|test@abc.com |pass456     |
Then user has finally logged into amazon app succesfully