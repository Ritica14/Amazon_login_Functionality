Feature: Check login feature

Background:

  Scenario: Verify the user is able to click on "SignIn" button and it displayed
    Given user navigates in homepage
    When user click on sign in button
    Then signIn page displayed

    Scenario: Verify the user is able to enter valid Username and click next
      Given user is in homepage
      And user click on signIn
      When user enter valid username and click next
      Then password page displayed

