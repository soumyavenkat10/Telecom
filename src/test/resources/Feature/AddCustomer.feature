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

  @us2
  Scenario: To test To verify the error message
    Given the user is in add customer page
    When The user blank customer details
      | firstName    |  |
      | lastName     |  |
      | emailAddress |  |
      | address      |  |
      | phNo         |  |
    And the user click the submit button
    Then the user should see the alert box
    
    @us3
  Scenario: To test To verify the error message at phone number
    Given the user is in add customer page
    When The user fill in the invalid customer details
      | firstName    | test           |
      | lastName     | selenium       |
      | emailAddress | test@gmail.com |
      | address      | chennai        |
      | phNo         |     abc |
    And the user click the submit button
    Then the user should see  error message at phone number
