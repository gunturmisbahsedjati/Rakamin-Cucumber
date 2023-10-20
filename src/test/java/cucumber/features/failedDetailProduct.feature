@FailedDetailProduct
Feature: Failed Show Detail Product

  @Negative
  Scenario: Product does not match the details
    Given login page
    Then user input problem username
    And user input password
    And user tap login button
    Then user in on dashboard page
    And user click one of the products
    Then user see product is not the same as the details