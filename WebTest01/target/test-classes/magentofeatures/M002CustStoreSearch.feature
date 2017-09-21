@wip2
Feature: Customer searching for item on the magento application
  As a customer
  I want to search for item
  So I can know the price


  Background: Customer searching for tv
    Given I have logged on to the application
      | Username           | Password    |
      | 234dotus@gmail.com | password123 |


  @wip2
  Scenario: Customer searching for phone
    When I search for "iPhone"
    Then the price would be "500"

  @wip
  Scenario: Customer searching for phone
    When I search for "LG"
    Then the price of TV would be "615"
