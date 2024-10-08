Feature: Search and place the orders

  Scenario: Searching Experience for the product search in both office and home page
    Given user is on greencard landing page
    When user searched with shortname "tom" and extracted actual name of product
    Then user searched for "tom" shortname in offer page to check the product exist
