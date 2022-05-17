package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class);

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Desktops')]")
    WebElement deskTopLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Notebooks')]")
    WebElement noteBooksLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class=\"inactive\"]/child::a[contains(text(),'Software')]")
    WebElement softwareLink;


    public String getVerifyComputerText() {
        log.info("get the 'COMPUTER' text :" + computersText.toString());
        return getTextFromElement(computersText);
    }

    public void clickOnDeskTopLink() {
        log.info("click on 'DESKTOP' button :" + deskTopLink.toString());
        clickOnElement(deskTopLink);
    }

    public void clickOnNoteBookLink() {
        log.info("click on 'NOTEBOOKS' button :" + noteBooksLink.toString());
        clickOnElement(noteBooksLink);
    }

    public void clickOnSoftwareLink() {
        log.info("click on 'SOFTWARE' button :" + softwareLink.toString());
        clickOnElement(softwareLink);
    }
}

