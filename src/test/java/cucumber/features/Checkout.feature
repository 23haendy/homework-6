Feature: Checkout

  Background: User login with valid credentials
    When user open link 'https://www.saucedemo.com/'
    And user input valid username
    And user input valid password
    Then user click login button


  Scenario: User want to checkout product with fill the information
    Given user click add to cart button
    Then user click cart icon
    Then user click checkout button
    Then user input personal information
    Then user click continue button
    Then user click finish button

  Scenario: User want to checkout product without fill the information
    Given user click add to cart button
    Then user click cart icon
    Then user click checkout button
    Then user click continue button