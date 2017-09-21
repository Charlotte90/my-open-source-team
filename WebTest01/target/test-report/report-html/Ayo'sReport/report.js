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
  "duration": 1417126,
  "status": "passed"
});
formatter.before({
  "duration": 9400543204,
  "status": "passed"
});
formatter.before({
  "duration": 84978,
  "status": "passed"
});
formatter.before({
  "duration": 2350245,
  "status": "passed"
});
formatter.before({
  "duration": 55831,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login test of magento as a customer",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
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
  "name": "I login with \"234dotus@gmail.com\" \u0026 \"password123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should check \"Donald Jonathan\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 4942576450,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234dotus@gmail.com",
      "offset": 14
    },
    {
      "val": "password123",
      "offset": 37
    }
  ],
  "location": "CustomerLoginSteps.iLoginWith(String,String)"
});
formatter.result({
  "duration": 1830392004,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald Jonathan",
      "offset": 16
    }
  ],
  "location": "CustomerLoginSteps.iShouldCheck(String)"
});
formatter.result({
  "duration": 74673316,
  "status": "passed"
});
formatter.after({
  "duration": 85389,
  "status": "passed"
});
formatter.after({
  "duration": 82515,
  "status": "passed"
});
formatter.after({
  "duration": 81283,
  "status": "passed"
});
formatter.after({
  "duration": 75437300,
  "status": "passed"
});
formatter.before({
  "duration": 171188,
  "status": "passed"
});
formatter.before({
  "duration": 5601102172,
  "status": "passed"
});
formatter.before({
  "duration": 66505,
  "status": "passed"
});
formatter.before({
  "duration": 446239,
  "status": "passed"
});
formatter.before({
  "duration": 88673,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login test of magento as a customer",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
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
  "name": "I login with \"234dotus@gmail.com\" \u0026 \"xxxxxxxxx\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should check \"Invalid login or password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 2083269257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234dotus@gmail.com",
      "offset": 14
    },
    {
      "val": "xxxxxxxxx",
      "offset": 37
    }
  ],
  "location": "CustomerLoginSteps.iLoginWith(String,String)"
});
formatter.result({
  "duration": 2100218932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid login or password",
      "offset": 16
    }
  ],
  "location": "CustomerLoginSteps.iShouldCheck(String)"
});
formatter.result({
  "duration": 28083059,
  "status": "passed"
});
formatter.after({
  "duration": 40642,
  "status": "passed"
});
formatter.after({
  "duration": 91136,
  "status": "passed"
});
formatter.after({
  "duration": 83336,
  "status": "passed"
});
formatter.after({
  "duration": 2660143593,
  "status": "passed"
});
formatter.before({
  "duration": 101810,
  "status": "passed"
});
formatter.before({
  "duration": 5952711854,
  "status": "passed"
});
formatter.before({
  "duration": 88673,
  "status": "passed"
});
formatter.before({
  "duration": 690499,
  "status": "passed"
});
formatter.before({
  "duration": 173651,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login test of magento as a customer",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
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
  "name": "I login with \"xxxxxxxx@gmail.com\" \u0026 \"password123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should check \"Invalid login or password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 2374244689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxxxxxx@gmail.com",
      "offset": 14
    },
    {
      "val": "password123",
      "offset": 37
    }
  ],
  "location": "CustomerLoginSteps.iLoginWith(String,String)"
});
formatter.result({
  "duration": 1369250266,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid login or password",
      "offset": 16
    }
  ],
  "location": "CustomerLoginSteps.iShouldCheck(String)"
});
formatter.result({
  "duration": 41273163,
  "status": "passed"
});
formatter.after({
  "duration": 63631,
  "status": "passed"
});
formatter.after({
  "duration": 53368,
  "status": "passed"
});
formatter.after({
  "duration": 45979,
  "status": "passed"
});
formatter.after({
  "duration": 141235518,
  "status": "passed"
});
formatter.before({
  "duration": 149431,
  "status": "passed"
});
formatter.before({
  "duration": 6788626213,
  "status": "passed"
});
formatter.before({
  "duration": 48031,
  "status": "passed"
});
formatter.before({
  "duration": 665048,
  "status": "passed"
});
formatter.before({
  "duration": 67326,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login test of magento as a customer",
  "description": "",
  "id": "testing-login-requirement-feature-of-magento-application;login-test-of-magento-as-a-customer;various-login-test-data;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
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
  "name": "I login with \"xxxxxxxx@gmail.com\" \u0026 \"xxxxxxxxx\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I should check \"Invalid login or password\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerLoginSteps.iAmOnTheLoginPage()"
});
formatter.result({
  "duration": 2460095316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xxxxxxxx@gmail.com",
      "offset": 14
    },
    {
      "val": "xxxxxxxxx",
      "offset": 37
    }
  ],
  "location": "CustomerLoginSteps.iLoginWith(String,String)"
});
formatter.result({
  "duration": 1320774066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid login or password",
      "offset": 16
    }
  ],
  "location": "CustomerLoginSteps.iShouldCheck(String)"
});
formatter.result({
  "duration": 21508532,
  "status": "passed"
});
formatter.after({
  "duration": 53368,
  "status": "passed"
});
formatter.after({
  "duration": 102631,
  "status": "passed"
});
formatter.after({
  "duration": 101810,
  "status": "passed"
});
formatter.after({
  "duration": 2354161081,
  "status": "passed"
});
formatter.uri("magentofeatures/M002CustStoreSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Customer searching for item on the magento application",
  "description": "As a customer\r\nI want to search for item\r\nSo I can know the price",
  "id": "customer-searching-for-item-on-the-magento-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip2"
    }
  ]
});
formatter.before({
  "duration": 137936,
  "status": "passed"
});
formatter.before({
  "duration": 6568235289,
  "status": "passed"
});
formatter.before({
  "duration": 69379,
  "status": "passed"
});
formatter.before({
  "duration": 406417,
  "status": "passed"
});
formatter.before({
  "duration": 50084,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "Customer searching for tv",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 9,
  "name": "I have logged on to the application",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10
    },
    {
      "cells": [
        "234dotus@gmail.com",
        "password123"
      ],
      "line": 11
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "CustStoreSearchSteps.iHaveLoggedOnToTheApplication(DataTable)"
});
formatter.result({
  "duration": 4534022301,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Customer searching for phone",
  "description": "",
  "id": "customer-searching-for-item-on-the-magento-application;customer-searching-for-phone",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I search for \"LG\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "the price of TV would be \"615\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "LG",
      "offset": 14
    }
  ],
  "location": "CustStoreSearchSteps.iSearchFor(String)"
});
formatter.result({
  "duration": 1277051312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "615",
      "offset": 26
    }
  ],
  "location": "CustStoreSearchSteps.thePriceOfTVWouldBe(String)"
});
formatter.result({
  "duration": 207994771,
  "status": "passed"
});
formatter.after({
  "duration": 43926,
  "status": "passed"
});
formatter.after({
  "duration": 46389,
  "status": "passed"
});
formatter.after({
  "duration": 41052,
  "status": "passed"
});
formatter.after({
  "duration": 70054932,
  "status": "passed"
});
});