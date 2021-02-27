Feature: Order pizza

  @orderPizza
  Scenario: My pizza
    Given the user in on "https://www.mypizza.kg"
    And the user should click small pizza cm
    And the user should choose Italian and Chicken pizza
    When the user should click submit order
    Then the user should fill up all field
    And the user should click order