#Author: Fabian

@Stories

Feature: Create new Business Unit in serenity site

  @newBusinessUnit
  Scenario: Sign Up a new Business Unit
    Given I'am in the serenity site
    And log in with my credentials
    When click the organization module
    And click in New Business Unit
    Then The new business unit is created "Save success"
