Feature: Login
  As a User
  I want to be able to sign up / login
  to use specific services

#  Scenario: If I use incorrect credentials when logging in I receive an error
#    Given I am able to access the sign in page
#    When I use incorrect credentials to log in
#    Then I receive a viable error
    @FunctionalTest
    Scenario Outline:  If I use incorrect credentials when loggin in I receive an error
      Given I am able to access the sign in page
      When I use <incorrect_credentials> to log in
      Then I receive a <viable_error>

      Examples:
      |incorrect_credentials|viable_error|
      |"123456789"            |Sorry, that password isn't valid. Please include a letter.|
      |abcdefghk              |Sorry, that password isn't valid. Please include something that isn't a letter.|
      |1efgh                |Sorry, that password is too short. It needs to be eight characters or more.    |
      |abcd1234             |Sorry, that password isn't valid. Make sure it's hard to guess.                 |
