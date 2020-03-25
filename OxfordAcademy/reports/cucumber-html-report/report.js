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
  "line": 5,
  "name": "Registering into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;registering-into-oxford-academy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc01_Oxford_Academy_register"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "open Oxford Academy website",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "register the valid details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Register_step.launch_Chrome_browser()"
});
formatter.result({
  "duration": 12964822300,
  "status": "passed"
});
formatter.match({
  "location": "Register_step.open_Oxford_Academy_website()"
});
formatter.result({
  "duration": 10042632200,
  "status": "passed"
});
formatter.match({
  "location": "Register_step.register_the_valid_details()"
});
formatter.result({
  "duration": 16223208000,
  "status": "passed"
});
formatter.match({
  "location": "Register_step.close_browser()"
});
formatter.result({
  "duration": 5362899200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Logging into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@tc02_Oxford_Academy_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user opens website",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The user login using \"\u003cemailId\u003e\" and \"\u003cpassword\u003e\" with vaild and invaild deatils",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy;",
  "rows": [
    {
      "cells": [
        "emailId",
        "password"
      ],
      "line": 22,
      "id": "oxford-academy-website;logging-into-oxford-academy;;1"
    },
    {
      "cells": [
        "mahachan@gmail.com",
        "truedream"
      ],
      "line": 23,
      "id": "oxford-academy-website;logging-into-oxford-academy;;2"
    },
    {
      "cells": [
        "koms@gmail.com",
        "komskitty"
      ],
      "line": 24,
      "id": "oxford-academy-website;logging-into-oxford-academy;;3"
    },
    {
      "cells": [
        "mahalakshmi.c98@gmail.com",
        "Maha@12345"
      ],
      "line": 25,
      "id": "oxford-academy-website;logging-into-oxford-academy;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Logging into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    },
    {
      "line": 12,
      "name": "@tc02_Oxford_Academy_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user opens website",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The user login using \"mahachan@gmail.com\" and \"truedream\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step.the_user_launch_chrome()"
});
formatter.result({
  "duration": 3566783200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_opens_website()"
});
formatter.result({
  "duration": 10505382100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mahachan@gmail.com",
      "offset": 22
    },
    {
      "val": "truedream",
      "offset": 47
    }
  ],
  "location": "Login_Step.the_user_enters_the_valid_login_details(String,String)"
});
formatter.result({
  "duration": 5718279600,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_closes_the_browser()"
});
formatter.result({
  "duration": 7249232800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Logging into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    },
    {
      "line": 12,
      "name": "@tc02_Oxford_Academy_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user opens website",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The user login using \"koms@gmail.com\" and \"komskitty\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step.the_user_launch_chrome()"
});
formatter.result({
  "duration": 4101972200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_opens_website()"
});
formatter.result({
  "duration": 7544316400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "koms@gmail.com",
      "offset": 22
    },
    {
      "val": "komskitty",
      "offset": 43
    }
  ],
  "location": "Login_Step.the_user_enters_the_valid_login_details(String,String)"
});
formatter.result({
  "duration": 5727742200,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_closes_the_browser()"
});
formatter.result({
  "duration": 7361086900,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Logging into Oxford Academy",
  "description": "",
  "id": "oxford-academy-website;logging-into-oxford-academy;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Oxford_Academy_feature"
    },
    {
      "line": 12,
      "name": "@tc02_Oxford_Academy_login"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user launch chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user opens website",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "The user login using \"mahalakshmi.c98@gmail.com\" and \"Maha@12345\" with vaild and invaild deatils",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "the user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step.the_user_launch_chrome()"
});
formatter.result({
  "duration": 2498085700,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_opens_website()"
});
formatter.result({
  "duration": 10526815000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mahalakshmi.c98@gmail.com",
      "offset": 22
    },
    {
      "val": "Maha@12345",
      "offset": 54
    }
  ],
  "location": "Login_Step.the_user_enters_the_valid_login_details(String,String)"
});
formatter.result({
  "duration": 5339524400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step.the_user_closes_the_browser()"
});
formatter.result({
  "duration": 3102107200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "download Csv.file from journal",
  "description": "",
  "id": "oxford-academy-website;download-csv.file-from-journal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@tc03_Oxford_Academy_Download_journal"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "I launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I open the oxford website",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I click the journalAtoZ button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I click dispatch date button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I select a journal",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I download the file",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I close the page",
  "keyword": "And "
});
formatter.match({
  "location": "DownloadFile_step.i_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 1907410600,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_open_the_oxford_website()"
});
formatter.result({
  "duration": 8113642400,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_click_the_journalAtoZ_button()"
});
formatter.result({
  "duration": 1090483900,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_click_dispatch_date_button()"
});
formatter.result({
  "duration": 2888205900,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_select_a_journal()"
});
formatter.result({
  "duration": 1165620200,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_download_the_file()"
});
formatter.result({
  "duration": 569241300,
  "status": "passed"
});
formatter.match({
  "location": "DownloadFile_step.i_close_the_page()"
});
formatter.result({
  "duration": 3317916900,
  "status": "passed"
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
  "duration": 2518126200,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_opened_the_website()"
});
formatter.result({
  "duration": 7839175400,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_select_book()"
});
formatter.result({
  "duration": 7320582100,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_select_currency()"
});
formatter.result({
  "duration": 8020292800,
  "status": "passed"
});
formatter.match({
  "location": "ChangeCurrency_step.user_close_the_page()"
});
formatter.result({
  "duration": 167910100,
  "status": "passed"
});
});