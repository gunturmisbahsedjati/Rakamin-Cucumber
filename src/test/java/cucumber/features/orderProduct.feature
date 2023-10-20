@OrderProduct
Feature: Order Product

  @Positive
  Scenario: User can order product
    Given login page
    Then user input username
    And user input password
    And user tap login button
    Then user in on dashboard page
    Then user click add to cart
    And user go to shopping cart
    And user click checkout
    And user fill first name
    And user fill last name
    And user fill postal code
    And user click continue
    And user click finish
    Then order success
