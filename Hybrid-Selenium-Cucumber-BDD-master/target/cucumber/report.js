$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Creditcard.feature");
formatter.feature({
  "line": 1,
  "name": "Check Credit Card Eligibility",
  "description": "",
  "id": "check-credit-card-eligibility",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Navigate to Credit Card Eligibility Screen from Homepage",
  "description": "",
  "id": "check-credit-card-eligibility;navigate-to-credit-card-eligibility-screen-from-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Creditcards_llyods"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Products and Services section",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on \"See all our credit cards\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the credit card screen",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the \"Check your eligibility\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I will enter fields Title \"\u003cTitle\u003e\", FirstName \"\u003cFirstName\u003e\", MiddleName \"\u003cMiddleName\u003e\", LastName \"\u003cLastName\u003e\", Gender \"\u003cGender\u003e\", MaritalStatus \"\u003cMaritalStatus\u003e\" in the credit card eligibility screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "check-credit-card-eligibility;navigate-to-credit-card-eligibility-screen-from-homepage;",
  "rows": [
    {
      "cells": [
        "Title",
        "FirstName",
        "MiddleName",
        "LastName",
        "Gender",
        "MaritalStatus"
      ],
      "line": 15,
      "id": "check-credit-card-eligibility;navigate-to-credit-card-eligibility-screen-from-homepage;;1"
    },
    {
      "cells": [
        "MR",
        "Dinesh",
        "Babu",
        "Ganesan",
        "Male",
        "Single"
      ],
      "line": 16,
      "id": "check-credit-card-eligibility;navigate-to-credit-card-eligibility-screen-from-homepage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Navigate to Credit Card Eligibility Screen from Homepage",
  "description": "",
  "id": "check-credit-card-eligibility;navigate-to-credit-card-eligibility-screen-from-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Creditcards_llyods"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to the Products and Services section",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on \"See all our credit cards\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I navigate to the credit card screen",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the \"Check your eligibility\" button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I will enter fields Title \"MR\", FirstName \"Dinesh\", MiddleName \"Babu\", LastName \"Ganesan\", Gender \"Male\", MaritalStatus \"Single\" in the credit card eligibility screen",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Creditcards_llyods.i_navigate_to_the_Products_and_Services_section()"
});
formatter.result({
  "duration": 674784100,
  "error_message": "java.lang.NullPointerException\r\n\tat com.google.common.base.Preconditions.checkNotNull(Preconditions.java:787)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:96)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:72)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:46)\r\n\tat com.cucumber.test.Creditcards_llyods.i_navigate_to_the_Products_and_Services_section(Creditcards_llyods.java:101)\r\n\tat ✽.When I navigate to the Products and Services section(src/test/resources/features/Creditcard.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Creditcards_llyods.iNavigateToTheCreditCardScreen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Creditcards_llyods.iClickTheCheckYourEligibilityButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "MR",
      "offset": 27
    },
    {
      "val": "Dinesh",
      "offset": 43
    },
    {
      "val": "Babu",
      "offset": 64
    },
    {
      "val": "Ganesan",
      "offset": 81
    },
    {
      "val": "Male",
      "offset": 99
    },
    {
      "val": "Single",
      "offset": 121
    }
  ],
  "location": "Creditcards_llyods.i_will_enter_fields_in_the_credit_card_eligibility_screen(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
});