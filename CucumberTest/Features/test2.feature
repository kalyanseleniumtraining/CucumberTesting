Feature: Verify Google Page

  @sanity
  Scenario Outline: Search with seleniumhq
    Given I am in Google page
    When I enter "<Search Value>" in the searchbox
    Then I see "<Expected Result>" page

    Examples: 
      | Search Value | Expected Result       |
      | India        | India - Google Search |
      | USA          | USA - Google Search   |
