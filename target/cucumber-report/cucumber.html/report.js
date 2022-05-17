$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "As user, I would like to login with valid credentials",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.before({
  "duration": 3555089700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 104995200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 472988400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 30100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "I should navigate to login page successfully",
  "description": "",
  "id": "login-functionality;i-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on login page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I am successfully navigate to login page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I can see the message \"Welcome, Please Sign In!\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 40900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmSuccessfullyNavigateToLoginPage()"
});
formatter.result({
  "duration": 18800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 23
    }
  ],
  "location": "LoginSteps.iCanSeeTheMessage(String)"
});
formatter.result({
  "duration": 35395100,
  "status": "passed"
});
formatter.after({
  "duration": 94500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "I should not login with invalid invalid credentials",
  "description": "",
  "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "I enter email \"\u003cemailAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message \"\u003cerror message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "emailAddress",
        "password",
        "error message"
      ],
      "line": 24,
      "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;1"
    },
    {
      "cells": [
        "abcd123@gmail.com",
        "xyz1234",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 25,
      "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;2"
    },
    {
      "cells": [
        "xyz123@gmail.com",
        "abc123",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 26,
      "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;3"
    },
    {
      "cells": [
        "adfafasd@gmail.com",
        "xyz123",
        "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"
      ],
      "line": 27,
      "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2648494100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 22200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 499315500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 18500,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "I should not login with invalid invalid credentials",
  "description": "",
  "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I enter email \"abcd123@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I enter password \"xyz1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abcd123@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 118918100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz1234",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 84580500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 398795200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 27611500,
  "status": "passed"
});
formatter.after({
  "duration": 42700,
  "status": "passed"
});
formatter.before({
  "duration": 2944416600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 32700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 568987600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 19300,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "I should not login with invalid invalid credentials",
  "description": "",
  "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I enter email \"xyz123@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I enter password \"abc123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 105041400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 118632500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 511952100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 47870000,
  "status": "passed"
});
formatter.after({
  "duration": 65600,
  "status": "passed"
});
formatter.before({
  "duration": 3346203400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 77100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 613092400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 19400,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "I should not login with invalid invalid credentials",
  "description": "",
  "id": "login-functionality;i-should-not-login-with-invalid-invalid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I enter email \"adfafasd@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I enter password \"xyz123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the error message \"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "adfafasd@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 105000700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 135627500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 474095000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found",
      "offset": 32
    }
  ],
  "location": "LoginSteps.iShouldSeeTheErrorMessage(String)"
});
formatter.result({
  "duration": 36537600,
  "status": "passed"
});
formatter.after({
  "duration": 22700,
  "status": "passed"
});
formatter.before({
  "duration": 2350132000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 27400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 550213800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 20500,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "I should login successfully with valid credentials",
  "description": "",
  "id": "login-functionality;i-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I enter email \"xyp3@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I enter password \"Abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I am successfully login with valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I can see logout link",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "xyp3@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 122774200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 107637900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 729159800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmSuccessfullyLoginWithValidCredentials()"
});
formatter.result({
  "duration": 54500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iCanSeeLogoutLink()"
});
formatter.result({
  "duration": 76540500,
  "status": "passed"
});
formatter.after({
  "duration": 32000,
  "status": "passed"
});
formatter.before({
  "duration": 3114632300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "I am on Login page of nopcommerce",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerPageSteps.iOnHomePage()"
});
formatter.result({
  "duration": 37900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginLink()"
});
formatter.result({
  "duration": 629270900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnLoginPage()"
});
formatter.result({
  "duration": 14200,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "I should logout successfully after login with valid credentials",
  "description": "",
  "id": "login-functionality;i-should-logout-successfully-after-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "I enter email \"xyp3@gmail.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "I enter password \"Abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on logout link",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I am successfully logout",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I can see login link",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "xyp3@gmail.com",
      "offset": 15
    }
  ],
  "location": "LoginSteps.iEnterEmail(String)"
});
formatter.result({
  "duration": 120059800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abc123",
      "offset": 18
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 110809300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 730966500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickOnLogoutLink()"
});
formatter.result({
  "duration": 817781400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmSuccessfullyLogout()"
});
formatter.result({
  "duration": 23600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iCanSeeLoginLink()"
});
formatter.result({
  "duration": 46359300,
  "status": "passed"
});
formatter.after({
  "duration": 82000,
  "status": "passed"
});
});