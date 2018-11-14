Feature: Login
  As a User
  I want to be able to sign up / login
  to use specific services

  Scenario: If I use incorrect credentials when logging in I receive an error
    Given I am able to access the sign in page
    When I use incorrect credentials to log in
    Then I receive a viable error
