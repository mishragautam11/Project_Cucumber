Feature: Test google for iframe
  Scenario: Iframe check
    When Open Url
    Then switch to iframe
    And click No Thanks
    Then Close the browser