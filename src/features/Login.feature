Feature: Login

  @P2
  Scenario: Enter glip login screen
    When [WelcomePage] Enter Sign In screen
    Then [SignInPage] Sign In screen shows


  @P1
  Scenario: Firstly login via email on XIA-UP
    Given [WelcomePage] Enter Sign In screen
    When [SignInPage] Input Email "rainy.chen11@gmail.com" and Password "Test!123" and login
    Then [NotificationPage] Login successfully


  @P4
  Scenario: Firstly login via email on Production
    Given [WelcomePage] Enter Sign In screen
    When [SignInPage] Input Production Email "rainy.chen11@gmail.com" and Password "Test!123" and login
    Then [NotificationPage] Login successfully



