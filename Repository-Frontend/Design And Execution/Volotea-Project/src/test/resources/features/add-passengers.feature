Feature: Added or decrease passenger
  AS QA Automation
  I want to open volotea
  To add adult passengers, children and babies

  Scenario Outline: Add adult passengers, children and babies
    Given the user has entered the volotea page
    And accept cookies
    When the user clicks on the passenger field
    And choose number of '<adults>', '<children>' and '<babies>'
    Then he can choose the number of passengers

    Examples:

      | adults | children | babies |
      | 1      | 3        | 2      |
      | 10     | 5        | 2      |
      | 8      | 10       | 3      |


