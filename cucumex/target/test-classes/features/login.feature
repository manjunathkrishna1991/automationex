Feature: Application Login

Scenario Outline: Home page Login
    Given User is on google page
    When User search for <element> in the search box
    Then visit first link

Examples:
|element						|
|Madhusmita meaning |
|Manjunath meaning  |
|Vishalakshi meaning|