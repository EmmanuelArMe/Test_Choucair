# Autor: emmanuel
  @stories
  Feature: Register page Utest
    As a user, I want to automate in screenplay the page Utest

    @scenario1
    Scenario: Create a new user at the Utest
      Given that a user is on the Utest page
      When click on the registration option
      And fill out the form
      Then a new user is created
