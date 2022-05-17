package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class);

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_3']/descendant::li/child::label")
    List<WebElement> hddRadioButton;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_4']/descendant::li/child::label")
    List<WebElement> osRadioButton;
    @CacheLookup
    @FindBy(xpath = "//dd[@id='product_attribute_input_5']/descendant::li")
    List<WebElement> softwareCheckBox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addToCartText;

    public String getVerifyBuildYourComputerText() {
        log.info("get the 'BUILD YOUR COMPUTER' text :" + buildYourComputerText.toString());
        return getTextFromElement(buildYourComputerText);
    }

    public void selectProcessorFromDropDown(String processor) {
        log.info("select the 'PROCESSOR' from drop down:" + processorDropDown.toString());
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRamFromDropDown(String ram) {
        log.info("select the 'RAM' from drop down:" + ramDropDown.toString());
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }

    public void clickOnHddFormRadioButton(String hdd) {
        log.info("click on 'HDD' from radio button :" + hdd);
        for (WebElement element : hddRadioButton) {
            if (element.getText().equalsIgnoreCase(hdd)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnOsFormRadioButton(String os) {
        log.info("click on 'OS' from radio button :" + os);
        for (WebElement element : osRadioButton) {
            if (element.getText().equalsIgnoreCase(os)) {
                element.click();
                break;
            }
        }
    }

    public void selectSoftwareCheckBox(String software) {
        for (WebElement element : softwareCheckBox)
            if (element.getText().equalsIgnoreCase(software)) {
                log.info("click on 'SOFTWARE' from check box :" + software);
                element.click();
                break;
            }
    }

    public void clickOnAddToCartButton() {
        log.info("click on 'ADD TO CART' button :" + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }

    public String getVerifyAddToCartText() {
        log.info("get the 'ADD TO CARD' text :" + addToCartText.toString());
        return getTextFromElement(addToCartText);
    }
}

