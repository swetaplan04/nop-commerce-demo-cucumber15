package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerTab;

    public boolean logInLinkIsDisplay() {
        log.info("get the 'LOGIN LINK' : " + loginLink.toString());
        return loginLink.isDisplayed();
    }

    public void clickOnLoginLink() {
        log.info("click on 'LOGIN' link :" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        log.info("click on 'REGISTER' link :" + registerLink.toString());
        clickOnElement(registerLink);
    }

    public String clickOnWelcomeText() {
        log.info("get the 'WELCOME' text : " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnComputerPage() {
        log.info("click on 'COMPUTER' tab :" + computerTab.toString());
        clickOnElement(computerTab);
    }
}

