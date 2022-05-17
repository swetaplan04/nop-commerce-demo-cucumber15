Feature: Registration Functionality
  As user , I would like to register with valid information

  Background: I am on register page of nopcommerce
    Given     I on home page
    When      I click on register link
    Then      I am on register page

  @sanity
  Scenario: I should navigate to register page successfully
    When    I am on register page
    Then    I am successfully navigate to register page
    And     I can see the register message "Register"

  @regression
  Scenario Outline: I should display message of all mandatory fields
    When            I click on register button
    And             I should get error message for firstname field"<firstNameErrorMessage>"
    And             I should get error message for lastname field "<lastNameErrorMessage>"
    And             I should get error message for email field"<emailErrorMessage>"
    And             I should get error message for password field"<passwordErrorMessage>"
    And             I should get error message for confirm password field"<confirmPasswordErrorMessage>"

    Examples:
      | firstNameErrorMessage   | lastNameErrorMessage   | emailErrorMessage  | passwordErrorMessage  | confirmPasswordErrorMessage |
      | First name is required. | Last name is required. | Email is required. | Password is required. | Password is required.       |

  @regression
  Scenario: I should create new account successfully with valid information
    When    I enter gender "F"
    And     I enter firstname "Lalita"
    And     I enter lastname "Patel"
    And     I enter date of birthday "26"
    And     I enter date of birthmonth "July"
    And     I enter date of birthyear "1997"
    And     I enter emailaddress "Lalita1237@gmail.com"
    And     I enter password for register "Lalita123"
    And     I enter confirm password "Lalita123"
    And     I click on register button
    Then    I am successfully register with valid information
    And     I can see the register text message "Your registration completed"