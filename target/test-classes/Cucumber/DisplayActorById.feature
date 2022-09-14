Feature: Displays a actors data on load
  Scenario: verify a actor content loads
    Given the actor has an id
    And the database finds an id for the actor
    When the actor api connects
    Then display a actor