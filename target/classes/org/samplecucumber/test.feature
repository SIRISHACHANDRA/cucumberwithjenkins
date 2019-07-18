Feature: to test add customer functionality

  Scenario: to test the generated customer ID functionality
    Given the user is in add customer page
    When the user fill in valid customer details
      | firstname    | siri            |
      | lastname     | chandra         |
      | emailAddress | siri1@gmail.com |
      | address      | Nellore         |
      | phno         |       234567890 |
    And the user click the submit button
    Then the user should see the generated customer ID

  Scenario: to test the generated customer ID functionality
    Given the user is in add customer page
    When the user fill in invalid customer details
      | firstname    | sirisha         |
      | lastname     | chandra         |
      | emailAddress | siri1@gmail.com |
      | address      | Nellore         |
      | phno         | 234567890*      |
    And the user click the submit button
    Then the user should see the popup message
