Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |2|
      | banana      |2|
      | cucumber    |3|
      | orange      |4|
      | mango       |5|
      | grape       |6|
      | pomegranate |7|

    #to beatify the pipes above
    #control+alt+L

  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |