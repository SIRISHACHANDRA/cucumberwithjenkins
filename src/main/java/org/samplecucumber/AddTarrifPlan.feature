 #Author: your.email@your.domain.com
@tag
Feature: to test add tarrif plan functionality

  @tag1
  Scenario Outline: the user fill in valid tarrif plan details
    Given The user is in add add tarrif plan page
    When the user fill in valid tariff plan details "<MonthRent>","<FreeLocal>","<FreeInt>","<FreeSMS>","<LocalCharges>","<InterCharges>","<SMSCharges>"
    And the user  click submit button in add tarrif plan
    Then the user should set the success message

    Examples: 
      | MonthRent | FreeLocal | FreeInt | FreeSMS | LocalCharges | InterCharges | SMSCharges |
      |       500 |       200 |     100 |     300 |          400 |            5 |          7 |
     |       50 |       200 |      |     300 |          400 |            5 |          7 |
     