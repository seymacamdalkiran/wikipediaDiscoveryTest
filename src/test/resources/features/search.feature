Feature: Search Button

  Background:
    Given Go to the url

  @wip
  Scenario Outline: Is the search button working correctly?
    Given Select advanced search
    When Write "<theseWords>" in these words box
    And Write "<notTheseWords>" in not these words box
    And Click the search button
    Then Check the results "<theseWords>" "<notTheseWords>"
    Examples:
      | theseWords   | notTheseWords |
      | bread        | breakfast     |
      | bread cheese | breakfast     |
      | cheese bread | breakfast     |


    Scenario:
      Given Select advanced search
      When Write "bread cheese" in these words box
      And Write "breakfast" in not these words box
      And Click the search button
      Then Results should include "bread" but not include "breakfast"