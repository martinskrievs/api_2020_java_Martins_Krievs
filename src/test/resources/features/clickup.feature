Feature: Clickup board
  This is very explaining description

  Scenario: Update Board name
    Given User has CLICKUP space with ID "2493404"
    When user changes Click board name to "LetsGetTheBread"
    Then check if board name was updated to "LetsGetTheBread"