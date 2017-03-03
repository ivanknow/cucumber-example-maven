Feature: Send a message

  Scenario: Send a message with all fields
    Given I on message website
    When I write a message
    And I click on the submit button
    Then the confirmation message is displayed
    