Feature: Login requirement feature type one
  As a customer
  I want to logon to the application
  So I can do my weekend shopping

  @smoke
  Scenario: 1_Login with valid details
    Given I am on the home page
    When on successful logon
      | Username           | Password    |
      | 234dotus@gmail.com | password123 |
    Then I should see my account details
      | Firstname |
      | Jennifer  |



