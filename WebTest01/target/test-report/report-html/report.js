$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("magentofeatures/M001CustomerLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Testing Login requirement feature of magento application",
  "description": "As a customer\r\nI want to logon to the application\r\nSo I can do my weekend shopping",
  "id": "testing-login-requirement-feature-of-magento-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login test of magento as a customer",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with \"\u003cUsername\u003e\" \u0026 \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should check \"\u003cFirstName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "various login test data",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "FirstName"
      ],
      "line": 13,
      "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;1"
    },
    {
      "cells": [
        "234dotus@gmail.com",
        "password123",
        "Donald Jonathan"
      ],
      "line": 14,
      "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;2"
    },
    {
      "cells": [
        "234dotus@gmail.com",
        "xxxxxxxxx",
        "Invalid login or password"
      ],
      "line": 15,
      "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;3"
    },
    {
      "cells": [
        "xxxxxxxx@gmail.com",
        "password123",
        "Invalid login or password"
      ],
      "line": 16,
      "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;4"
    },
    {
      "cells": [
        "xxxxxxxx@gmail.com",
        "xxxxxxxxx",
        "Invalid login or password"
      ],
      "line": 17,
      "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1535356,
  "status": "passed"
});
