Feature: User Registration

Scenario: User registration with different data
Given  User is on registration page
When User enters following user details
  | naveen | automation | nav@gmail.com | 99999 | Bangalore |
  | tom | peter | tom1@gmail.com | 888888 | London |
 Then user registration should be successful