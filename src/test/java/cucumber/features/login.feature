@LoginTest
Feature: Login saucedemo

  @Positive
  Scenario: User login using standard user
    Given login page
    Then user input username
    And user input password
    And user tap login button
    Then user in on dashboard page

  @Negative
  Scenario: User login using locked out user
    Given login page
    Then user input locked username
    And user input password
    And user tap login button
    Then user get alert text