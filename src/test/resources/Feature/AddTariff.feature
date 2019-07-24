#Author: soumya
Feature: Add tariff plan functionality

  @tag1
  Scenario Outline: To verify the success message
    Given The user is in add tariff plan page
    When the user fill in the valid tariff plan details "<monthRent>","<freeLocal>","<freeRent>","<freeSms>","<localCharges>","<interCharges>","<smsCharges>"
    And the user clicks the submit button
    Then the user should see the success message

    Examples: 
      | monthRent | freeLocal | freeRent | freeSms | localCharges | interCharges | smsCharges |
      |       500 |       500 |      100 |     501 |          300 |          101 |        400 |
      |       501 |       502 |      101 |     502 |          503 |          102 |        402 |

  @tag2
  Scenario Outline: To verify the error message
    Given The user is in add tariff plan page
    When the user left one field blank of tariff plan details  "<monthRent>","<freeLocal>","<freeRent>","<freeSms>","<localCharges>","<interCharges>","<smsCharges>"
    And the user clicks the submit button
    Then the user should see the error message

    Examples: 
      | monthRent | freeLocal | freeRent | freeSms | localCharges | interCharges | smsCharges |
      |        55 |        44 |       33 |      22 |           11 |              |         88 |

  @us
  Scenario Outline: To verify the success message
    Given The user is in add tariff plan page
    When the user fill in the valid tariff plan details "<tariffplan>"
    And the user clicks the submit button
    Then the user should see the success message

    Examples: 
      | tariffplan |
      |          5 |
      |          4 |
