Feature: validate for all user
Scenario: to access reqres.in and perform basic api test to fetch users
Given I access api request end point to get users 
Then Verify below response for the user
    | email                        | firstname  | lastname    | avatar                                                            |
    | lindsay.ferguson@reqres.in   | lindsay    | ferguson    | https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg |
