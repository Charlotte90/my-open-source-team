<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("asos.app.features/AAUS01.UKtoUSCurrency.feature");
formatter.feature({
  "line": 1,
  "name": "Currency conversion functionality",
  "description": "As a tourist\r\nI want to conversion my GB pound to US dollar.\r\nSo that i can pay for my hotel bill.",
  "id": "currency-conversion-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4572106749,
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("asos.app.features/AE45004SearchItem.feature");
formatter.feature({
  "line": 1,
  "name": "Search belt requirement",
  "description": "As a customer\r\nI want to search for belt on the application\r\nSo I can buy black belt",
  "id": "search-belt-requirement",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10800515320,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "I search for black belt item",
  "description": "",
  "id": "search-belt-requirement;i-search-for-black-belt-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on the home page of asos application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for item such as black belt",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see four sytles of black belts \"style\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchItemSteps.i_am_on_the_home_page_of_asos_application()"
});
formatter.result({
  "duration": 17430420656,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemSteps.i_search_for_item_such_as_black_belt()"
});
formatter.result({
  "duration": 11726066872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "style",
      "offset": 41
    }
  ],
  "location": "SearchItemSteps.i_should_see_four_sytles_of_black_belts(String)"
});
formatter.result({
  "duration": 1096643520,
  "error_message": "java.lang.AssertionError: Four Black Belts\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.asos.portal.steps.SearchItemSteps.i_should_see_four_sytles_of_black_belts(SearchItemSteps.java:39)\r\n\tat ✽.Then I should see four sytles of black belts \"style\"(asos.app.features/AE45004SearchItem.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 959247317,
  "status": "passed"
});
formatter.uri("asos.app.features/AE4501Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login requirement feature type three",
  "description": "As a customer vv2\r\nI want to logon to the application vv2\r\nSo I can do my weekend shopping vv2",
  "id": "login-requirement-feature-type-three",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3349478152,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "This is a pre-condition for all test in this feature file",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I want to login to asos app",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.iWantToLoginToAsosApp()"
});
formatter.result({
  "duration": 19508152260,
>>>>>>> master
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "1_Change UK Currency to US currency",
  "description": "",
  "id": "currency-conversion-functionality;1-change-uk-currency-to-us-currency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@unit"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I Am on The HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I Change UK currency to US Currency",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should see United State Flag",
  "keyword": "Then "
});
formatter.match({
  "location": "UKtoUSCurrencyTest.i_Am_on_The_HomePage()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 26475585370,
=======
  "duration": 17428020590,
>>>>>>> master
  "status": "passed"
});
formatter.match({
  "location": "UKtoUSCurrencyTest.i_Change_UK_currency_to_US_Currency()"
});
formatter.result({
<<<<<<< HEAD
  "duration": 1169586898,
  "status": "passed"
});
formatter.match({
  "location": "UKtoUSCurrencyTest.i_should_see_United_State_Flag()"
});
formatter.result({
  "duration": 72653767,
=======
  "duration": 79795432,
  "status": "passed"
});
formatter.after({
  "duration": 885010301,
>>>>>>> master
  "status": "passed"
});
formatter.after({
  "duration": 832101569,
  "error_message": "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating with the remote browser. It may have died.\nBuild info: version: \u00273.0.0\u0027, revision: \u0027350cf60\u0027, time: \u00272016-10-13 10:48:57 -0700\u0027\nSystem info: host: \u0027Ayobami\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: driver.version: RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.28.455520 (cc17746adff54984afff480136733114c6b3704b), userDataDir\u003dC:\\Users\\ASUS\\AppData\\Local\\Temp\\scoped_dir8480_1353}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: d211379cfa36194ac554fea5f7953b63\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:622)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:658)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:497)\r\n\tat com.asos.portal.Infrastructure.BrowserConfig.BrowserFactory.tearDownBrowser(BrowserFactory.java:75)\r\n\tat com.asos.portal.asoshooks.ScenarioHooks.testCleanUp(ScenarioHooks.java:28)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\r\nCaused by: java.lang.RuntimeException: Process refused to die after 10 seconds, and couldn\u0027t taskkill it: Unable to find executable for: taskkill\r\n\tat org.openqa.selenium.os.ProcessUtils.killWinProcess(ProcessUtils.java:133)\r\n\tat org.openqa.selenium.os.ProcessUtils.killProcess(ProcessUtils.java:81)\r\n\tat org.openqa.selenium.os.UnixProcess$SeleniumWatchDog.destroyHarder(UnixProcess.java:254)\r\n\tat org.openqa.selenium.os.UnixProcess$SeleniumWatchDog.access$200(UnixProcess.java:208)\r\n\tat org.openqa.selenium.os.UnixProcess.destroy(UnixProcess.java:125)\r\n\tat org.openqa.selenium.os.CommandLine.destroy(CommandLine.java:155)\r\n\tat org.openqa.selenium.remote.service.DriverService.stop(DriverService.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:94)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\t... 45 more\r\nCaused by: java.lang.NullPointerException: Unable to find executable for: taskkill\r\n\tat com.google.common.base.Preconditions.checkNotNull(Preconditions.java:251)\r\n\tat org.openqa.selenium.os.UnixProcess.\u003cinit\u003e(UnixProcess.java:62)\r\n\tat org.openqa.selenium.os.CommandLine.\u003cinit\u003e(CommandLine.java:38)\r\n\tat org.openqa.selenium.os.WindowsUtils.killPID(WindowsUtils.java:178)\r\n\tat org.openqa.selenium.os.ProcessUtils.killWinProcess(ProcessUtils.java:128)\r\n\t... 53 more\r\n",
  "status": "failed"
});
});