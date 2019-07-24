# add tariff plan to the customer
Feature: To test add tariff plan to the customer functionality

  @us1
  Scenario: To test add tariff plan to the customer
    Given the user is in assigntariffplantocustomer page
    When The user enters customerId
      | CustomerID    | 937430           |
     
    And the user click the submit button
    Then the user should navigate to next page
