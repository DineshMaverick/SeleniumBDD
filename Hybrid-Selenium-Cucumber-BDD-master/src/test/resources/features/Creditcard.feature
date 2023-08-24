Feature: Check Credit Card Eligibility
@Creditcards_llyods
 


  Scenario Outline: Navigate to Credit Card Eligibility Screen from Homepage
    When I navigate to the Products and Services section
    And I click on "See all our credit cards"
    And I navigate to the credit card screen
    And I click the "Check your eligibility" button
    Then I will enter fields Title "<Title>", FirstName "<FirstName>", MiddleName "<MiddleName>", LastName "<LastName>", Gender "<Gender>", MaritalStatus "<MaritalStatus>" in the credit card eligibility screen


    Examples:
      | Title | FirstName | MiddleName | LastName | Gender | MaritalStatus |
      | MR    | Dinesh    | Babu       | Ganesan  | Male   | Single        |


