Feature: Currency conversion functionality
  As a tourist
  I want to conversion my GB pound to US dollar.
  So that i can pay for my hotel bill.
  @unit
  Scenario: 1_Change UK Currency to US currency
    Given I Am on The HomePage
    When I Change UK currency to US Currency
    Then I should see United State Flag