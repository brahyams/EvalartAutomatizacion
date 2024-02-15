#Author Brahyam Sanchez

Feature: Evalart Math Operation Form

  As a Evalart user
  I want to complete the different math operations
  to complete the form and receive the hashcode

  Scenario: Login into Evalart and complete the math operations form
    Given that an user is on Evalart Home Page
    When he logs with correct credentials
    And he completes the math operations form
    Then he retrieve the hashcode
