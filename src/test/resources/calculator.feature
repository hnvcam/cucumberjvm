Feature: Calculator

  Scenario: Addition
    Given I have a super calculator
    When I press 2
    And I press +
    And I press 5
    And I press =
    Then it should show 7

  Scenario: Multiply
    Given I have a super calculator
    When I press 2
    And I press *
    And I press 5
    And I press =
    Then it should show 10