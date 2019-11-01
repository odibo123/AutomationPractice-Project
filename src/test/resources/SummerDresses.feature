Feature: Summer Dresses App Test

  Scenario: As a user I want to change the price of summer dress to $16 - $20
    Given user opens the browser
    And user is on Home Page
    And user mouses hover women  and clicks on summer dress
    And user changes the price range from $16 to $20
    Then user verify search results are updated
   
