#Author: Fabian

@Stories

Feature: Create new Meeting in serenity site

  @newMeeting
  Scenario: Schedule a new meeting
    Given I'am in the serenity site
    And log in with my credentials
    When click the Regions
    And Fill the form
    Then The new Region is created "Save success"
