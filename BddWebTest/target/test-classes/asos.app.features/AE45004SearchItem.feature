Feature: Search belt requirement
  As a customer
  I want to search for belt on the application
  So I can buy black belt

  @wip
  Scenario: I search for black belt item
    Given I am on the home page of asos application
    When I search for item such as black belt
    Then I should see four sytles of black belts "style"



