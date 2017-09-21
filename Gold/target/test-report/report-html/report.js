$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sprint_01/PH201701Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search requirement for customer",
  "description": "As a customer\r\nI want to search for flight\r\nSo I can book a flight",
  "id": "search-requirement-for-customer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10901186686,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Searching PHP travel for flight booking",
  "description": "",
  "id": "search-requirement-for-customer;searching-php-travel-for-flight-booking",
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
  "name": ": I am on the home page of hotels",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": ": I enter a destination details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": ": I list of prices of hotels",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.iAmOnTheHomePageOfHotels()"
});
formatter.result({
  "duration": 6174445915,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iEnterADestinationDetails()"
});
formatter.result({
  "duration": 60303194260,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.iListOfPricesOfHotels()"
});
formatter.result({
  "duration": 45546489,
  "status": "passed"
});
formatter.after({
  "duration": 872248052,
  "status": "passed"
});
});