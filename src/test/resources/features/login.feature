Business Need:
  Authentication

  Scenario: Login successfully
    Given there is an account "abc" with password "password"
    When login with username "abc" and password "password"
    Then I can see the home
