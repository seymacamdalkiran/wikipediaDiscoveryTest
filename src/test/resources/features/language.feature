Feature:
  Background:
    Given Go to the url

    @language
    Scenario: Choose Language
      Given Click the menu dropdown and Seleck the "Contents" menu
      When Configure "Türkçe" language
      Then Verify that "Yardım" is selected
      