package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps {
    @Given("^I on home page$")
    public void iOnHomePage() {

    }

    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerPage();
    }

    @Then("^I am on computer page$")
    public void iAmOnComputerPage() {

    }

    @Then("^I am successfully navigate to computer page$")
    public void iAmSuccessfullyNavigateToComputerPage() {
    }

    @And("^I can see the computer message \"([^\"]*)\"$")
    public void iCanSeeTheComputerMessage(String expectedComputerText)  {
       Assert.assertEquals("computer text is not match", expectedComputerText, new ComputerPage().getVerifyComputerText());
    }

    @When("^I click on desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDeskTopLink();
    }

    @Then("^I am successfully navigate to desktop page$")
    public void iAmSuccessfullyNavigateToDesktopPage() {

    }

    @And("^I can see the desktops message \"([^\"]*)\"$")
    public void iCanSeeTheDesktopsMessage(String expectedDesktopMessage)  {
        Assert.assertEquals("desktop text is not match", expectedDesktopMessage, new DesktopsPage().getVerifyDesktopText());

    }

    @And("^I select desktop product \"([^\"]*)\"$")
    public void iSelectDesktopProduct(String desktopProduct)  {
        new DesktopsPage().selectProductBuildYourOwnComputer(desktopProduct);

    }

    @And("^I can see the build your own computer message \"([^\"]*)\"$")
    public void iCanSeeTheBuildYourOwnComputerMessage(String expectedProductNameText)  {
        Assert.assertEquals("product name is not match", expectedProductNameText, new BuildYourOwnComputerPage().getVerifyBuildYourComputerText());

    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().selectProcessorFromDropDown(processor);

    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram)  {
        new BuildYourOwnComputerPage().selectRamFromDropDown(ram);

    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd)  {
        new BuildYourOwnComputerPage().clickOnHddFormRadioButton(hdd);
    }

    @And("^I select os \"([^\"]*)\"$")
    public void iSelectOs(String os)  {
        new BuildYourOwnComputerPage().clickOnOsFormRadioButton(os);

    }

    @And("^I select software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().selectSoftwareCheckBox(software);

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I am successfully select my own build computer$")
    public void iAmSuccessfullySelectMyOwnBuildComputer() {
    }

    @And("^I can see the addtocart message \"([^\"]*)\"$")
    public void iCanSeeTheAddtocartMessage(String expectedAddToCartSuccessText)  {
        Assert.assertEquals("add to cart message is not match", expectedAddToCartSuccessText, new BuildYourOwnComputerPage().getVerifyAddToCartText());

    }
}
