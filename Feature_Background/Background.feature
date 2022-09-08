Feature: Testing background

Background: Validate the login
  Given User should be on login page
  When Input username and password
  And CLick signin button

  Scenario: Valiadate Admin is displaying
    When Click on Admin Menu
    Then Validate the System user is displaying

    Scenario: Valiadate Personal deatils
      When Click on the My info
      Then Valiade the page is on that section