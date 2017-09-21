Feature: User Sign In Feature Requirement
  As a customer
  I want to signIn to the application
  So I can make a purchase


  @wip
  Scenario Outline: User Valid SignIn
    Given I am on the SignIn Page
    When  I choose to sign in with my "<username>" and "<password>"
    Then I am signed in to the application

    Examples:
    |username              | password  |
    |email address         |password   |
