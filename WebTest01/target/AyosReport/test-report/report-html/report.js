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
  "duration": 1446683,
  "status": "passed"
});
formatter.before({
  "duration": 7824310927,
  "status": "passed"
});
formatter.before({
  "duration": 116588,
  "status": "passed"
});
formatter.before({
  "duration": 2894187,
  "status": "passed"
});
formatter.before({
  "duration": 53368,
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
  "duration": 3143723288,
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
  "duration": 1812626211,
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
  "duration": 60361663,
  "status": "passed"
});
formatter.after({
  "duration": 57063,
  "status": "passed"
});
formatter.after({
  "duration": 110431,
  "status": "passed"
});
formatter.after({
  "duration": 117410,
  "status": "passed"
});
formatter.after({
  "duration": 77994036,
  "status": "passed"
});
formatter.before({
  "duration": 188020,
  "status": "passed"
});
formatter.before({
  "duration": 4581638044,
  "status": "passed"
});
formatter.before({
  "duration": 76768,
  "status": "passed"
});
formatter.before({
  "duration": 959803,
  "status": "passed"
});
formatter.before({
  "duration": 54189,
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
  "duration": 4894380638,
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
  "duration": 1665341636,
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
  "duration": 26628986,
  "status": "passed"
});
formatter.after({
  "duration": 77588,
  "status": "passed"
});
formatter.after({
  "duration": 59116,
  "status": "passed"
});
formatter.after({
  "duration": 60347,
  "status": "passed"
});
formatter.after({
  "duration": 2098702049,
  "status": "passed"
});
formatter.before({
  "duration": 211009,
  "status": "passed"
});
formatter.before({
  "duration": 4845366242,
  "status": "passed"
});
formatter.before({
  "duration": 114125,
  "status": "passed"
});
formatter.before({
  "duration": 752489,
  "status": "passed"
});
formatter.before({
  "duration": 328829,
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
  "duration": 2397856741,
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
  "duration": 1427374167,
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
  "duration": 25743077,
  "status": "passed"
});
formatter.after({
  "duration": 40641,
  "status": "passed"
});
formatter.after({
  "duration": 44337,
  "status": "passed"
});
formatter.after({
  "duration": 60347,
  "status": "passed"
});
formatter.after({
  "duration": 78986682,
  "status": "passed"
});
formatter.before({
  "duration": 123978,
  "status": "passed"
});
formatter.before({
  "duration": 4776670962,
  "status": "passed"
});
formatter.before({
  "duration": 133420,
  "status": "passed"
});
formatter.before({
  "duration": 464712,
  "status": "passed"
});
formatter.before({
  "duration": 53368,
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
  "duration": 2690372866,
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
  "duration": 1343283864,
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
  "duration": 18037150,
  "status": "passed"
});
formatter.after({
  "duration": 37768,
  "status": "passed"
});
formatter.after({
  "duration": 123157,
  "status": "passed"
});
formatter.after({
  "duration": 66094,
  "status": "passed"
});
formatter.after({
  "duration": 134826844,
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
  "duration": 139167,
  "status": "passed"
});
formatter.before({
  "duration": 4915371501,
  "status": "passed"
});
formatter.before({
  "duration": 90726,
  "status": "passed"
});
formatter.before({
  "duration": 561596,
  "status": "passed"
});
formatter.before({
  "duration": 96883,
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
  "duration": 4153198159,
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
  "duration": 1350082946,
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
  "duration": 227073008,
  "status": "passed"
});
formatter.after({
  "duration": 37768,
  "status": "passed"
});
formatter.after({
  "duration": 25863,
  "status": "passed"
});
formatter.after({
  "duration": 23811,
  "status": "passed"
});
formatter.after({
  "duration": 78631169,
  "status": "passed"
});
});