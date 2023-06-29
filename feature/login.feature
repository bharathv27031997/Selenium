Feature: Login Feature
  Scenario: positive Scenarion
    Given user in login pagee
    When User enter "admin" and "admin123"
    And user clicks login
    Then user is in home page