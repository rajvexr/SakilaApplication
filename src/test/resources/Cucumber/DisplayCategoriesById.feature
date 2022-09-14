Feature: Displays a categories data on load
  Scenario: verify a category content loads
    Given the category has an id
    And the database finds an id for the category
    When the category api connects
    Then display a categories