# Add Customer
Feature: To test add customer functionality

  @us1
  Scenario: To test the generate customer id functionality
    Given the user is in add customer page
    When The user fill in the valid customer details
      | firstName    | test           |
      | lastName     | selenium       |
      | emailAddress | test@gmail.com |
      | address      | chennai        |
      | phNo         |     7894561230 |
    And the user click the submit button
    Then the user should see the customer id generated
