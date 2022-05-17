package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@type='radio']")
    List<WebElement> maleFemaleRadioBtn;
    @CacheLookup
    @FindBy(name = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement selectDateOfDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement selectDateOfMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement selectDateOfYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameIsRequired;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameIsRequired;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailIsRequired;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordIsRequired;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordIsRequired;
    @CacheLookup
    @FindBy(css = "div.result")
    WebElement yourRegisterCompletedTest;
    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/child::a")
    WebElement continueButton;

    public String getVerfiyRegisterText() {
        log.info("get the 'REGISTER' text :" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void clickOnMaleOrFemaleRadioButton(String maleOrFemale) {
        log.info("click on 'MALE OR FEMALE' radio button :" + maleOrFemale);
        for (WebElement element : maleFemaleRadioBtn) {
            if (element.getAttribute("value").equalsIgnoreCase(maleOrFemale)) {
                element.click();
                break;
            }
        }
    }


    public void enterFirstName(String firstname) {
        log.info("enter the 'FIRST NAME' :" + firstname + "to first name field");
        sendTextToElement(firstNameField, firstname);
    }


    public void enterLastName(String lastname) {
        log.info("enter the 'LAST NAME' :" + lastname + "to last name field");
        sendTextToElement(lastNameField, lastname);
    }

    public void selectDateOfBirthDay(String text) {
        log.info("select the 'DATE OF BIRTHDAY' from drop down:" + selectDateOfDay.toString());
        selectByVisibleTextFromDropDown(selectDateOfDay, text);
    }

    public void selectDateOfBirthMonth(String text) {
        log.info("select the 'DATE OF BIRTHMONTH' from drop down:" + selectDateOfMonth.toString());
        selectByVisibleTextFromDropDown(selectDateOfMonth, text);
    }

    public void selectDateOfBirthYear(String text) {
        log.info("select the 'DATE OF BIRTHYEAR' from drop down:" + selectDateOfYear.toString());
        selectByVisibleTextFromDropDown(selectDateOfYear, text);
    }

    public void enterEmailAddress(String email) {
        log.info("enter the 'EMAIL' :" + email + "to email field");
        sendTextToElement(emailAddressField, email);
    }

    public void enterPassword(String password) {
        log.info("enter the 'PASSWORD' :" + password + "to password field");
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("enter the 'CONFIRM PASSWORD' :" + confirmPassword + "to confirm password field");
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegistrationButton() {
        log.info("click on 'REGISTER' button :" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getVerifyFirstNameIsRequiredText() {
        log.info("get the 'FIRST NAME' text :" + firstNameIsRequired.toString());
        return getTextFromElement(firstNameIsRequired);
    }

    public String getVerifyLastNameIsRequiredText() {
        log.info("get the 'LAST NAME' text :" + lastNameIsRequired.toString());
        return getTextFromElement(lastNameIsRequired);
    }

    public String getVerifyEmailIsRequiredText() {
        log.info("get the 'EMAIL ADDRESS' text :" + emailIsRequired.toString());
        return getTextFromElement(emailIsRequired);
    }

    public String getVerifyPasswordIsRequiredText() {
        log.info("get the 'PASSWORD' text :" + passwordIsRequired.toString());
        return getTextFromElement(passwordIsRequired);
    }

    public String getVerifyConfirmPasswordIsRequiredText() {
        log.info("get the 'CONFIRM PASSWORD' text :" + confirmPasswordIsRequired.toString());
        return getTextFromElement(confirmPasswordIsRequired);
    }

    public String getVerifyRegisterCompletedText() {
        log.info("get the 'ERROR MESSAGE' text :" + yourRegisterCompletedTest.toString());
        return getTextFromElement(yourRegisterCompletedTest);
    }

    public void clickOnContinueButton() {
        log.info("click on 'CONTINUE' button :" + continueButton.toString());
        clickOnElement(continueButton);
    }
}

