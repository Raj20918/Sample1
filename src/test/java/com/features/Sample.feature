
Feature: Login Page Validation
Scenario: Validate the correct username and password
    Given Open url
    When Validate the username "Aiite"
    And Validate the password "123456"
    And Click the login button
    Then Open home page

    

 