Feature: Login

  Scenario: Login with valid credentials
    When user open link 'https://www.saucedemo.com/'
    And user input valid username
    And user input valid password
    Then user click login button

  Scenario: Login with invalid credentials (invalid password)
    When user open link 'https://www.saucedemo.com/'
    And user input invalid username
    And user input invalid password
    Then user click login button