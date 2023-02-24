Feature: Check login feature
  User want to login in Amazon Account

  Background: Verify the user is in website
    Given user navigates in homepage
   When user click on sign in button
   Then signIn page displayed

    Scenario: Verify the user is able to enter valid Username and click next
      Given user is in homepage
      And user click on signIn
      When user enter valid username and click next
      Then password page displayed


    Scenario: Error in empty field
      When user click on enter
      Then field email should be with error


    Scenario: User enter Invalid username and click next
      When user enter Invalid username and click next
      Then Error message appear


Scenario Outline: Login successfully
  When User type "<username>" in email
  And User type "<password>" in password
  And User click on enter key
  Then User logIn successfully in amazon
    Examples:

      | username      | password   |
      | 8446791287    | 15141829ps  |



  Scenario: User enter Valid username and Invalid password
    When user enter valid username
    And user enter Invalid password
    Then Error Box popUp