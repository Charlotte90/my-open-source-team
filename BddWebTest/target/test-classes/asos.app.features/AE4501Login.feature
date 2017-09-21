Feature: Login requirement feature type three
  As a customer vv2
  I want to logon to the application vv2
  So I can do my weekend shopping vv2


  Background: This is a pre-condition for all test in this feature file
    Given I want to login to asos app


  @regression @wip
  Scenario: 1_Login with valid details
    When I login with "234dotus@gmail.com" & "password123"
    Then I should see "Jennifer"

  Scenario: 2_Login with valid username and invalid password
    When I login with "234dotus@gmail.com" & "xxxxxxxxx"
    Then I should see "Looks like either your email address or password were incorrect"

  Scenario: 3_Login with invalid username and invalid password
    When I login with "xxxxxxxxx@gmail.com" & "xxxxxxxxx"
    Then I should see "Looks like either your email address or password were incorrect"
