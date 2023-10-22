Feature: Filter

  Scenario: User want to filter price (Low to high) with standard user
  When user open link 'https://www.saucedemo.com/'
  And user input valid username
  And user input valid password
  Then user click login button
  Then user choose price low to high

  Scenario: User want to filter price (Low to high) with problem user
  When user open link 'https://www.saucedemo.com/'
  And user input valid username
  And user input valid password
  Then user click login button
  Then user choose price low to high