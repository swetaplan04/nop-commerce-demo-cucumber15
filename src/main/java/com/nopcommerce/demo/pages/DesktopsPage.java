package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class);

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement shortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayDorpDown;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-box']/child::div/descendant::h2/child::a")
    List<WebElement> selectProductList;


    public String getVerifyDesktopText() {
        log.info("get the 'DESKTOP' text :" + desktopText.toString());
        return getTextFromElement(desktopText);
    }

    public void selectShortByFilterFromDropDown(String shortby) {
        log.info("select filter 'SHORT BY' :" + shortby);
        selectByVisibleTextFromDropDown(shortByDropDown, shortby);
    }

    public void selectDisplayFilterFromDropDown(String display) {
        log.info("select filter 'DISPLAY' :" + display);
        selectByVisibleTextFromDropDown(displayDorpDown, display);
    }

    public void selectProductBuildYourOwnComputer(String productName) {
        log.info("click on 'PRODUCT' :" + productName);
        for (WebElement element : selectProductList) {
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                break;
            }
        }
    }
}

