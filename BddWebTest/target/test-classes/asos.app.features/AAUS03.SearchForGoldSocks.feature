Feature: search for Gold socks
  As a customer
  I want to check for gold socks
  So that i can check for types of styles of Gold socks
  @integration
  Scenario: 1_Search for Gold socks
    Given I Am on the asos HomePage
    When I search for the Gold socks
    Then I should see types and styles of Gold socks