$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Projects/java-16b-practice-repo/WebTest01/src/test/resources/magentofeatures/M001CustomerLogin.feature");
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
      "name": "@nightly"
    },
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
  "duration": 1653586,
  "status": "passed"
});
formatter.before({
  "duration": 31072898,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 284492,
  "status": "passed"
});
formatter.before({
  "duration": 2181108,
  "status": "passed"
});
formatter.before({
  "duration": 215114,
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
    },
    {
      "line": 7,
      "name": "@nightly"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 237283,
  "status": "passed"
});
formatter.after({
  "duration": 166673,
  "status": "passed"
});
formatter.after({
  "duration": 151893,
  "status": "passed"
});
formatter.after({
  "duration": 44337,
  "status": "passed"
});
formatter.before({
  "duration": 155999,
  "status": "passed"
});
formatter.before({
  "duration": 729910,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 527111,
  "status": "passed"
});
formatter.before({
  "duration": 684342,
  "status": "passed"
});
formatter.before({
  "duration": 106736,
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
    },
    {
      "line": 7,
      "name": "@nightly"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 90726,
  "status": "passed"
});
formatter.after({
  "duration": 58294,
  "status": "passed"
});
formatter.after({
  "duration": 55010,
  "status": "passed"
});
formatter.after({
  "duration": 154357,
  "status": "passed"
});
formatter.before({
  "duration": 168314,
  "status": "passed"
});
formatter.before({
  "duration": 727857,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 212241,
  "status": "passed"
});
formatter.before({
  "duration": 577606,
  "status": "passed"
});
formatter.before({
  "duration": 211419,
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
    },
    {
      "line": 7,
      "name": "@nightly"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 557490,
  "status": "passed"
});
formatter.after({
  "duration": 157231,
  "status": "passed"
});
formatter.after({
  "duration": 209778,
  "status": "passed"
});
formatter.after({
  "duration": 34894,
  "status": "passed"
});
formatter.before({
  "duration": 126852,
  "status": "passed"
});
formatter.before({
  "duration": 688857,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 199925,
  "status": "passed"
});
formatter.before({
  "duration": 437618,
  "status": "passed"
});
formatter.before({
  "duration": 70610,
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
    },
    {
      "line": 7,
      "name": "@nightly"
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 91136,
  "status": "passed"
});
formatter.after({
  "duration": 59116,
  "status": "passed"
});
formatter.after({
  "duration": 112483,
  "status": "passed"
});
formatter.after({
  "duration": 182682,
  "status": "passed"
});
});