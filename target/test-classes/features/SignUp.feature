@SignUp
Feature: SignUp on the Accenture web site

  Scenario Outline: SignUp on the Accenture web site

    Given I have url "<url>" which I would like to test
    And I type the username "<username>", password "<password>" on the page to login

    Examples:
      | url                | username   | password     |
      | https://kalif24.ru | walenberg6 | hVl7l1vx47CL |