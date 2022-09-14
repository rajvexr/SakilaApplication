Feature: Displays all categories data on load
  Scenario: verify all categories content loads
    Given the application is running
    When the category page loads
    And the category api connects
    Then display all categories