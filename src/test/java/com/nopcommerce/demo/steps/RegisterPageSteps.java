package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterPageSteps {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I am on register page$")
    public void iAmOnRegisterPage() {
    }

    @Then("^I am successfully navigate to register page$")
    public void iAmSuccessfullyNavigateToRegisterPage() {
    }

    @And("^I can see the register message \"([^\"]*)\"$")
    public void iCanSeeTheRegisterMessage(String expectedRegisterMessage)  {
        Assert.assertEquals("register text is not match", expectedRegisterMessage, new RegisterPage().getVerfiyRegisterText());

    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegistrationButton();
    }

    @And("^I should get error message for firstname field\"([^\"]*)\"$")
    public void iShouldGetErrorMessageForFirstnameField(String expectedFirstNameErrorMessage)  {
        Assert.assertEquals("firstname error message is not match", expectedFirstNameErrorMessage, new RegisterPage().getVerifyFirstNameIsRequiredText());

    }

    @And("^I should get error message for lastname field \"([^\"]*)\"$")
    public void iShouldGetErrorMessageForLastnameField(String expectedLastNameErrorMessage)  {
        Assert.assertEquals("lastname error message is not match", expectedLastNameErrorMessage, new RegisterPage().getVerifyLastNameIsRequiredText());

    }

    @And("^I should get error message for email field\"([^\"]*)\"$")
    public void iShouldGetErrorMessageForEmailField(String expectedEmailErrorMessage)  {
        Assert.assertEquals("email error message is not match", expectedEmailErrorMessage, new RegisterPage().getVerifyEmailIsRequiredText());
    }

    @And("^I should get error message for password field\"([^\"]*)\"$")
    public void iShouldGetErrorMessageForPasswordField(String expectedPasswordErrorMessage)  {
        Assert.assertEquals("password error message is not match", expectedPasswordErrorMessage, new RegisterPage().getVerifyPasswordIsRequiredText());
    }

    @And("^I should get error message for confirm password field\"([^\"]*)\"$")
    public void iShouldGetErrorMessageForConfirmPasswordField(String  expectedConfirmPasswordErrorMessage)  {
        Assert.assertEquals("confirm password error message is not match", expectedConfirmPasswordErrorMessage, new RegisterPage().getVerifyConfirmPasswordIsRequiredText());

    }

    @When("^I enter gender \"([^\"]*)\"$")
    public void iEnterGender(String gender)  {
        new RegisterPage().clickOnMaleOrFemaleRadioButton(gender);

    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname)  {
        new RegisterPage().enterFirstName(firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname)  {
        new RegisterPage().enterLastName(lastname);

    }

    @And("^I enter date of birthday \"([^\"]*)\"$")
    public void iEnterDateOfBirthday(String day)  {
        new RegisterPage().selectDateOfBirthDay(day);
    }

    @And("^I enter date of birthmonth \"([^\"]*)\"$")
    public void iEnterDateOfBirthmonth(String month)  {
        new RegisterPage().selectDateOfBirthMonth(month);

    }

    @And("^I enter date of birthyear \"([^\"]*)\"$")
    public void iEnterDateOfBirthyear(String year)  {
        new RegisterPage().selectDateOfBirthYear(year);
    }

    @And("^I enter emailaddress \"([^\"]*)\"$")
    public void iEnterEmailaddress(String email)  {
        new RegisterPage().enterEmailAddress(Utility.getRandomString(3) + email);


    }

    @And("^I enter password for register \"([^\"]*)\"$")
    public void iEnterPasswordForRegister(String password)  {
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)  {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("^I am successfully register with valid information$")
    public void iAmSuccessfullyRegisterWithValidInformation() {
    }

    @And("^I can see the register text message \"([^\"]*)\"$")
    public void iCanSeeTheRegisterTextMessage(String expectedRegisterSuccessText)  {
        Assert.assertEquals("register successful text is not match", expectedRegisterSuccessText, new RegisterPage().getVerifyRegisterCompletedText());
    }
}
