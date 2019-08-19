@Btrix24_Login
Feature: Login
  As user I want to login as a helpdeskuser

  #Background:



  @helpdeskuser
  Scenario: Login as a helpdeskuser

    Then user logs in as a "help-desk"

  @marketinguser
  Scenario: Login as a marketinguser

    Then user logs in as a "marketing"

  @hruser
  Scenario: Login as a hruser

    Then user logs in as a "hr"

