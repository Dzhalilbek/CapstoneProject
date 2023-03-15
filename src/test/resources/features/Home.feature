Feature: Retail Page application

  @smoke @regression
  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for 'Pokemon' item
    Then Product should be displayed
