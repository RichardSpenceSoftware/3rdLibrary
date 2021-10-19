Feature: Is it 2012?
  Want to know if the book came out in 2012

  Scenario: 2010 is not 2012
    Given it came out in 2010
    When I ask what year it came out
    Then I should be be told "Yes"

