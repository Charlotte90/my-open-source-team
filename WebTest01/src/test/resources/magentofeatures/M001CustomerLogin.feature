@wip
Feature: Testing Login requirement feature of magento application
  As a customer
  I want to logon to the application
  So I can do my weekend shopping

    @wip
  Scenario Outline: Login test of magento as a customer
    Given I am on the login page
    When I login with "<Username>" & "<Password>"
    Then I should check "<FirstName>"
    Examples: various login test data
      | Username           | Password    | FirstName                 |
      | 234dotus@gmail.com | password123 | Donald Jonathan           |
      | 234dotus@gmail.com | xxxxxxxxx   | Invalid login or password |
      | xxxxxxxx@gmail.com | password123 | Invalid login or password |
      | xxxxxxxx@gmail.com | xxxxxxxxx   | Invalid login or password |