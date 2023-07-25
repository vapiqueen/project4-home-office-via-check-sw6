
Feature: Visa Confirmation  Test
  As user I should be able to apply for visa

  @smoke
  Scenario:An Australian coming to Uk For Tourism
    Given I am on homepage
    When I click on start button
    And I select a Nationality "Australia"
    And I click on continue button
    And I  select reason "Tourism or visiting family and friends"
    And I will click on continue button again
    Then I should be able to see the result You will not need a visa to come to the UK
    
    @sanity
    Scenario:A chilean Coming To The Uk For Work And Plans On Staying For Longer Than SixMonths
      Given I am on homepage
      When I click on start button
      And I select a Nationality "Chile"
      And I click on continue button
      And I  select reason "Work, academic visit or business"
      And I click on continue button
      And I select the intendent to stay for "longer than 6 months"
      And I click on continue button
      And I select having  plannning to work for "Health and care professional"
      And I click on continue button
      Then I should be able to see the result You need a visa to work in health and care

      @regression
      Scenario: A Coloumbian National Coming To The Uk To Join a Partner For A Long Stay And They Do Have An Article 10 or 20card
        Given I am on homepage
        When I click on start button
        And I select a Nationality "Colombia"
        And I click on continue button
        And I  select reason "Join partner or family for a long stay"
        And I click on continue button
        Then I should be able to see the result You'll need a visa to join your family or partner in the UK


