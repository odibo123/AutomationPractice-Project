Feature: Item App Test

  Scenario Outline: To test that user can add an item to the cart and remove the same
    Given user opens the browser
    And user is on Home Page
    And user sees a Logo banner
    When user click on search input box
    And user search for "<clothing>" in the search input box
    When user clicks on Search on search box
    Then user chooses an item displaying image and title and price
    And user click on the item
    And user is taken to my item page
    And user confirm details of purchased item
    And user click on Add To Cart button
    Then user confirm seeing a message saying product is successfully added to cart
    Then user click on proceed To Checkout
    And user confirms seeing shopping cart summary
    And user clicks on the negative button under the quantity section
    Then user verify a message displaying shopping cart is empty
    And user closes the browser

    Examples: 
      | clothing |
      | women    |
      | dresses  |
      | T-Shirt  |
