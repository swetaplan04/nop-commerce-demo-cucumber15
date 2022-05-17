@Test
Feature: Login Functionality
  As user, I would like to login with valid credentials

  Background: I am on Login page of nopcommerce
    Given     I on home page
    When      I click on login link
    Then      I am on login page


  Scenario: I should navigate to login page successfully
    When    I am on login page
    Then    I am successfully navigate to login page
    And     I can see the message "Welcome, Please Sign In!"


  Scenario Outline: I should not login with invalid invalid credentials
    When            I enter email "<emailAddress>"
    And             I enter password "<password>"
    And             I click on login button
    Then            I should see the error message "<error message>"

    Examples:
      | emailAddress       | password | error message                                                                               |
      | abcd123@gmail.com  | xyz1234   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |


  Scenario: I should login successfully with valid credentials
    When    I enter email "xyp3@gmail.com"
    And     I enter password "Abc123"
    And     I click on login button
    Then    I am successfully login with valid credentials
    And     I can see logout link


  Scenario: I should logout successfully after login with valid credentials
    When    I enter email "xyp3@gmail.com"
    And     I enter password "Abc123"
    And     I click on login button
    And     I click on logout link
    Then    I am successfully logout
    And     I can see login link