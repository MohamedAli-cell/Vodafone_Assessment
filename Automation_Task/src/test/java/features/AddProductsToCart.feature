Feature: Add products to cart
  Validating that the user can add products from Vodafone eshop to cart

  Scenario: Adding two products from the store page and one product from search bar
    Given Browser open on home page
    When Choose English language and accept the cookies
    And Login with your account using "<mobileNumber>" , "<password>"
    And Filter the products to show only TVs
    And Choose the required TV and open it's page
    And add it to card
    And Filter the products to show only Smartphones
    And Choose the required smartphone and open it's page
    And add it to card
    And Search about "<productName>" you want
    And Choose the required product and open it's page
    And add this product to card
    Then you have added three products to cart


    Examples:
      | mobileNumber | password   |  | productName                                         |  |
      | 01021870254  | Seeing@1st |  | JBL Partybox club 120 Portable Party Speaker -Black |  |