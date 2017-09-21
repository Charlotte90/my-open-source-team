Feature: This is testing for logout functionality of asos app
  As a customer with asos online
  I want to logout of my account after shopping
  So that nobody has access to my account unlawfully

  @regression
  Scenario: Logout after shopping with asos
    Given I am logged in to the application
      | Username           | Password    |
      | 234dotus@gmail.com | password123 |
    When I logout after shopping
    Then I should see my account is secure
      | LogoutMessage      |
      | Sign In            |