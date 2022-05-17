package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @Then("^I am successfully navigate to login page$")
    public void iAmSuccessfullyNavigateToLoginPage() {
    }

    @And("^I can see the message \"([^\"]*)\"$")
    public void iCanSeeTheMessage(String expectedWelcomeMessage)  {
        Assert.assertEquals("welcome message is not match ", expectedWelcomeMessage, new LoginPage().getVerifyWelcomeText());
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String expectedErrorMessage)  {
        Assert.assertEquals("error message is not match", expectedErrorMessage, new LoginPage().getErrorMessage());

    }

    @Then("^I am successfully login with valid credentials$")
    public void iAmSuccessfullyLoginWithValidCredentials() {
    }

    @And("^I can see logout link$")
    public void iCanSeeLogoutLink() {
        Assert.assertTrue(new LoginPage().logOutLinkIsDisplay());
    }

    @And("^I click on logout link$")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("^I am successfully logout$")
    public void iAmSuccessfullyLogout() {
    }

    @And("^I can see login link$")
    public void iCanSeeLoginLink() {
        Assert.assertTrue(new HomePage().logInLinkIsDisplay());
    }
}
