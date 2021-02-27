$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pizzakg/pizza.feature");
formatter.feature({
  "line": 1,
  "name": "Order pizza",
  "description": "",
  "id": "order-pizza",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4587160681,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "My pizza",
  "description": "",
  "id": "order-pizza;my-pizza",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@orderPizza"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user in on \"https://www.mypizza.kg\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user should click small pizza cm",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "the user should choose Italian and Chicken pizza",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user should click submit order",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user should fill up all field",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user should click order",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.mypizza.kg",
      "offset": 16
    }
  ],
  "location": "PizzaSteps.the_user_in_on(String)"
});
formatter.result({
  "duration": 3195285155,
  "status": "passed"
});
formatter.match({
  "location": "PizzaSteps.the_user_should_click_small_pizza_cm()"
});
formatter.result({
  "duration": 1288383566,
  "status": "passed"
});
formatter.match({
  "location": "PizzaSteps.the_user_should_choose_Italian_and_Chicken_pizza()"
});
formatter.result({
  "duration": 142228115,
  "status": "passed"
});
formatter.match({
  "location": "PizzaSteps.the_user_should_click_submit_order()"
});
formatter.result({
  "duration": 1983845318,
  "status": "passed"
});
formatter.match({
  "location": "PizzaSteps.the_user_should_fill_up_all_field()"
});
formatter.result({
  "duration": 590567534,
  "status": "passed"
});
formatter.match({
  "location": "PizzaSteps.the_user_should_click_order()"
});
formatter.result({
  "duration": 8360324561,
  "status": "passed"
});
formatter.after({
  "duration": 46127724,
  "status": "passed"
});
});