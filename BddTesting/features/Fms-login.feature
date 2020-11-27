Feature: User should login successfully
To do Automation testing on Flight Management System


# This is comment
Scenario: User Should login with valid credentials
    Given user launches FMS webapp
    When user provides valid username and password
    And clicks on login
    Then user should logout successfully