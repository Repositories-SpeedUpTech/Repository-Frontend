Feature: Enter cities in the source field
  AS QA Automation
  I want to enter cities of origin
  To find the source city and see the number of destinations

  Scenario Outline: Enter cityOrigin and cityDestination
    Given the user has entered the volotea page
    And accept cookies
    When the user enter <Origen> and the user enter <Destination>
    Then the user should see the name <Country>
    Examples:
    |Origen|Destination|Country|
    |Ajaccio|Burdeos|FRANCIA|
    |Alguer|Verona|ITALIA|





