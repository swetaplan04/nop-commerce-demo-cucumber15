Feature: Computer Page Functionality
  As user, I would like to shopping on Computer category

  Background: I am on computer page of nopcommerce
    Given     I on home page
    When      I click on computer tab
    Then      I am on computer page

  @sanity
  Scenario: I should able to navigate to computer page successfully
    When    I am on computer page
    Then    I am successfully navigate to computer page
    And     I can see the computer message "Computers"

  @smoke
  Scenario: I should able to navigate to desktops page successfully
    When    I click on desktops link
    Then    I am successfully navigate to desktop page
    And     I can see the desktops message "Desktops"

  @regression
  Scenario Outline: I should able to select my own build computer
    When            I click on desktops link
    And             I select desktop product "Build your own computer"
    And             I can see the build your own computer message "Build your own computer"
    And             I select processor "<Processor>"
    And             I select ram "<RAM>"
    And             I select hdd "<HDD>"
    And             I select os "<OS>"
    And             I select software "<Software>"
    And             I click on add to cart button
    Then            I am successfully select my own build computer
    And             I can see the addtocart message "The product has been added to your shopping cart"

    Examples:
      | Processor                                       | RAM           | HDD               | OS                      | Software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |