Feature: Amazon test with graduates

  Scenario Outline: I want to buy an amazon echo from amazon.co.uk
    Given I have visited amazon.co.uk
    When I search for "<search>"
    And I select the link "<link>"
    Then I can add it to my basket
    And my basket contains "1" item with a subtotal "<subtotal>"

  Examples:
    | search        | link                            | subtotal |
    | amazon echo   | Amazon Echo, Black              | £149.99  |
    | fire tv stick | Fire TV Stick                   | £32.99   |
    | fire tv stick | Fire TV Stick with Voice Remote | £42.70   |
