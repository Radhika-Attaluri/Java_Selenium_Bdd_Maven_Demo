Feature: Login Scenario

  Scenario: Validating Login Process

    Given User launch browser

    When User enter username and password


    Then User should be able to login successfully


  Scenario: Invalid Login Process

    Given  User launch browser

    When User enters valid username and invalid password

    Then User should not be able to login successfully
