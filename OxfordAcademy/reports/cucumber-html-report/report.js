$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/oxford.Feature");
formatter.feature({
  "line": 2,
  "name": "Oxford Academy Website",
  "description": "",
  "id": "oxford-academy-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    }
  ]
});
formatter.scenario({
  "line": 47,
  "name": "Changing the currency",
  "description": "",
  "id": "oxford-academy-website;changing-the-currency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@tc5_Oxford_Academy_Currency_change"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "user launched the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "user opened the website",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user select book",
  "keyword": "Then "
});
formatter.step({
  "line": 52,
  "name": "user select currency",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "user close the page",
  "keyword": "And "
});
formatter.match({
  "location": "ChangeCurrency_step.user_launched_the_chrome_browser()"
});
formatter.result({
  "duration": 11385396100,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_opened_the_website()"
});
formatter.result({
  "duration": 7802577000,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_select_book()"
});
formatter.result({
  "duration": 5784081700,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_select_currency()"
});
formatter.result({
  "duration": 7666342100,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_close_the_page()"
});
formatter.result({
  "duration": 166139600,
  "status": "passed"
});
});