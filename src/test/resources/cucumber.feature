@test_Test_to_21vek
Feature: Test login 21vek

  Scenario: Login to 21vek shop
    Given User navigate to login page
    When User enter email and password
    And User click on login button
    Then User should be logged in
