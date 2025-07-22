Feature: Add User Data
    Scenario: Add User Data
    Given the user open the browser
    When the user is on page "Add User Data"
    When the user fill the data in form
    And then click on Submit Button
    Then User should see a success message