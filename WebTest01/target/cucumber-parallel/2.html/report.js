$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Projects/java-16b-practice-repo/WebTest01/src/test/resources/magentofeatures/M002CustStoreSearch.feature");
formatter.feature({
  "line": 2,
  "name": "Customer searching for item on the magento application",
  "description": "As a customer\r\nI want to search for item\r\nSo I can know the price",
  "id": "customer-searching-for-item-on-the-magento-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@wip"
    }
  ]
});
formatter.before({
  "duration": 1536998,
  "status": "passed"
});
formatter.before({
  "duration": 49301351,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 256576,
  "status": "passed"
});
formatter.before({
  "duration": 23169919,
  "status": "passed"
});
formatter.before({
  "duration": 120694,
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
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Customer searching for phone",
  "description": "",
  "id": "customer-searching-for-item-on-the-magento-application;customer-searching-for-phone",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I search for \"iPhone\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the price would be \"500\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone",
      "offset": 14
    }
  ],
  "location": "CustStoreSearchSteps.iSearchFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 20
    }
  ],
  "location": "CustStoreSearchSteps.thePriceWouldBe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 102220,
  "status": "passed"
});
formatter.after({
  "duration": 258219,
  "status": "passed"
});
formatter.after({
  "duration": 248366,
  "status": "passed"
});
formatter.after({
  "duration": 52547,
  "status": "passed"
});
formatter.before({
  "duration": 137525,
  "status": "passed"
});
formatter.before({
  "duration": 784099,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Projects\\java-16b-practice-repo\\WebTest01\\drivers-package\\windows\\phantomjs\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.findPhantomJS(PhantomJSDriverService.java:245)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriverService.createDefaultService(PhantomJSDriverService.java:181)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSDriver.\u003cinit\u003e(PhantomJSDriver.java:105)\r\n\tat com.magento.browserLib.LocalCustomCapabilities.getPhantonJsDriver(LocalCustomCapabilities.java:66)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowserOnLocalMachine(BrowserFactory.java:67)\r\n\tat com.magento.browserLib.BrowserFactory.setUpBrowser(BrowserFactory.java:22)\r\n\tat com.magento.hooks.ScenarioHooks.setUpTestScenario(ScenarioHooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:344)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:269)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:240)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:184)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:286)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:240)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 87852,
  "status": "passed"
});
formatter.before({
  "duration": 13476240,
  "status": "passed"
});
formatter.before({
  "duration": 94420,
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
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "duration": 100168,
  "status": "passed"
});
formatter.after({
  "duration": 91546,
  "status": "passed"
});
formatter.after({
  "duration": 65273,
  "status": "passed"
});
formatter.after({
  "duration": 34074,
  "status": "passed"
});
});