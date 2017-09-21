Feature: Product Search and Add to bag requirement
  As a customer
  I want to perform a product search using a product number
  So I can add the product to my shopping bag



  @kkk
  Scenario: Search and add the product to bag
    Given I search for a product using a "979721"
    When I choose to add the product to my shopping bag
    Then the product is added to the shopping bag "£4.00"


