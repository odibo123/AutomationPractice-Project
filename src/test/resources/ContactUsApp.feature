Feature: Automation Practice App  Test

  Scenario Outline: To check that user can send a message to Customer Service
    Given user opens the browser
    And user is on Home Page
    And user sees a Logo banner
    When user click on Contact us link
    Then user validate Contact us Page
    Then user selects Customer Service from Subject Heading dropdown
    # And user enter "<email>" address
    And user enter email address
    And user enter quantity in   "<orderReference>"
    And user chooses a file
    And user types a "<message>" in the message box
    Then user click the send button
    Then user confirm message was sent
    And user closes the browser

    Examples: 
      | orderReference | message                         |
      |            123 | I want to see my order          |
      |            456 | How soon can I cancel my order? |
