Feature: Login requirement feature type two
  As a customer v1
  I want to logon to the application v1
  So I can do my weekend shopping v1

# Kelvin and Danny asked questions on VC

  @sanity
  Scenario Outline: Login test using data driven concept in bdd
    Given I want to login to asos application
    When I login with a "<Username>" & a "<Password>"
    Then I should check "<FirstName>"
    Examples: various login test data
      | Username           | Password    | FirstName                            |
      | 234dotus@gmail.com | password123 | Jennifer                             |
      | 234dotus@gmail.com | xxxxxxxxx   | Looks like either your email address |
      | xxxxxxxx@gmail.com | password123 | Looks like either your email address |
      | xxxxxxxx@gmail.com | xxxxxxxxx   | Looks like either your email address |


