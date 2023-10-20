@SortProduct
Feature: Sorting Product

  @Positive
  Scenario: User can sorting product by price
    Given login page
    Then user input username
    And user input password
    And user tap login button
    Then user in on dashboard page
    Then user click hamburger
    And user click all items
    Then user see all product sale