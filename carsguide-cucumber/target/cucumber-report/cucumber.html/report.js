$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("findealer.feature");
formatter.feature({
  "line": 2,
  "name": "Find the dealers and verify",
  "description": "",
  "id": "find-the-dealers-and-verify",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 10233260800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Find the dealers and verify the dealers are in list",
  "description": "",
  "id": "find-the-dealers-and-verify;find-the-dealers-and-verify-the-dealers-are-in-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on \u0027buy+sell\u0027 tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click ‘Find a Dealer’",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I navigate to ‘car-dealers’ page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the dealer names \u003cdealersName\u003e are display on page",
  "rows": [
    {
      "cells": [
        "3 Point Motors Epping"
      ],
      "line": 10
    },
    {
      "cells": [
        "4WD Specialist Group"
      ],
      "line": 11
    },
    {
      "cells": [
        "5 Star Auto"
      ],
      "line": 12
    },
    {
      "cells": [
        "A \u0026 M Car Sales Pty Ltd"
      ],
      "line": 13
    },
    {
      "cells": [
        "A1 MOTORS COMPANY"
      ],
      "line": 14
    },
    {
      "cells": [
        "ANDREA MOTORI SERVICE"
      ],
      "line": 15
    },
    {
      "cells": [
        "Oxford Motors"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BuySteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 127183100,
  "status": "passed"
});
formatter.match({
  "location": "FinddealerSteps.iMouseHoverOnBuySellTab()"
});
formatter.result({
  "duration": 6205077100,
  "status": "passed"
});
formatter.match({
  "location": "FinddealerSteps.iClickFindADealer()"
});
formatter.result({
  "duration": 2032267700,
  "status": "passed"
});
formatter.match({
  "location": "FinddealerSteps.iNavigateToCarDealersPage()"
});
formatter.result({
  "duration": 45000,
  "status": "passed"
});
formatter.match({
  "location": "FinddealerSteps.iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable)"
});
formatter.result({
  "duration": 5479296300,
  "error_message": "java.lang.AssertionError: not displayed dealer name expected:\u003c[3 Point Motors Epping, 4WD Specialist Group, 5 Star Auto, A \u0026 M Car Sales Pty Ltd, A1 MOTORS COMPANY, ANDREA MOTORI SERVICE, Oxford Motors]\u003e but was:\u003cOxford Motors\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:743)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat au.com.carsguide.cucumber.steps.FinddealerSteps.iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(FinddealerSteps.java:41)\r\n\tat ✽.And I should see the dealer names \u003cdealersName\u003e are display on page(findealer.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1987714600,
  "status": "passed"
});
});