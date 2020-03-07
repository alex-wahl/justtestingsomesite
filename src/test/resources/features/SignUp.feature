@SignUp
Feature: SignUp on the Accenture web site

  Scenario Outline: SignUp on the Accenture web site
    Given I am using the browser Chrome
    #And I go to the main "<Web Page>"
    #Then I generate fake details and make a Sign up using "<Email>", password "<Password>"
    And I close the browser Chrome

    Examples:
      | Web Page           | Email          | Password     |
      | https://kalif24.ru | walenbeg@ya.ru | hVl7l1vx47CL |