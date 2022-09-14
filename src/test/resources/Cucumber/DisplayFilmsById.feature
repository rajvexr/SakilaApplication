Feature: Displays a films data on load with an id
  Scenario: verify the film content loads
    Given the application is running
    And there is an id
    When the film page loads
    And the api connects
    Then display a film
