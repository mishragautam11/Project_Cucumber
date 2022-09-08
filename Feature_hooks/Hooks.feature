
#This is a Hook Testing Purpose Implementation
Feature: Test google

  Scenario: Verify available logo
    Given Open up google url
    When Validate logo
    Then shutdown browser



    Scenario: Verify Buttons
      Given Open the google Url
      When Validate all buttons
      Then Close browser



      Scenario: Search Testing
        Given Opens google url
        When Input testing in search box
        Then Hit Enter
        And Close browser1