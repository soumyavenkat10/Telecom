$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selenium-cucumber/Telecom/src/test/resources/Feature/AddCustomer.feature");
formatter.feature({
  "name": "To test add customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test To verify the error message at phone number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@us3"
    }
  ]
});
formatter.step({
  "name": "the user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerStep.the_user_is_in_add_customer_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.click(Unknown Source)\r\n\tat objectrepo.TelecomBase.btnClick(TelecomBase.java:61)\r\n\tat stepdefinition.AddCustomerStep.the_user_is_in_add_customer_page(AddCustomerStep.java:22)\r\n\tat ✽.the user is in add customer page(F:/Selenium-cucumber/Telecom/src/test/resources/Feature/AddCustomer.feature:30)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user fill in the invalid customer details",
  "rows": [
    {
      "cells": [
        "firstName",
        "test"
      ]
    },
    {
      "cells": [
        "lastName",
        "selenium"
      ]
    },
    {
      "cells": [
        "emailAddress",
        "test@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phNo",
        "abc"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerStep.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see  error message at phone number",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});