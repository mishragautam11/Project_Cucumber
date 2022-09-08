Feature: Test Login
  Scenario Outline: Validate the valid login

    Given User should have to open the url
    When User should provide <username> and <password>
    Then User need to click login button
    And User will wait till page loads
    And User validate succesfull login
    Then User quit the browser
    Examples:
      | username | password |
      |Admin     |admin123    |

