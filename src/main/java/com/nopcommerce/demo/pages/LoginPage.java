package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutBtn;

    public void enterEmailId(String email) {
        log.info("enter the 'EMAIL ADDRESS' :" + email + "to email address field");
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("enter the 'PASSWORD' :" + password + "to password field");
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        log.info("click on 'LOGIN' button :" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        log.info("get the 'ERROR MESSAGE' text :" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String getVerifyWelcomeText() {
        log.info("get the 'WELCOME' text :" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public boolean logOutLinkIsDisplay() {
        log.info("get the 'LOGOUT' link :" + logOutBtn.toString());
        return logOutBtn.isDisplayed();
    }

    public void clickOnLogOutLink() {
        log.info("click on 'LOGOUT' button :" + logOutBtn.toString());
        clickOnElement(logOutBtn);
    }


}

