@all
@simple_test
Feature: SimpleTests
  This test suite should verify...

  Scenario: Test wikipedia
    Given browser should be open in Wikipedia page
    When i write browserstack to search field
      And i press ENTER
    Then i am able to see BrowserStack wikipedia page
