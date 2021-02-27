package net.timelysoft.stepdefinitions;

import net.timelysoft.pageObjects.MyPizzaMainPage;
import net.timelysoft.pageObjects.OrderDetails;
import net.timelysoft.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PizzaSteps extends TestBase {

    MyPizzaMainPage myPizzaMainPage = new MyPizzaMainPage(driver);
    OrderDetails orderDetails = new OrderDetails(driver);

    @Given("^the user in on \"([^\"]*)\"$")
    public void the_user_in_on(String link) {
        driver.get(link);
    }

    @Given("^the user should click small pizza cm$")
    public void the_user_should_click_small_pizza_cm() {
        myPizzaMainPage.pizza30cm.click();
    }

    @Given("^the user should choose Italian and Chicken pizza$")
    public void the_user_should_choose_Italian_and_Chicken_pizza() {
        myPizzaMainPage.chickenPizza.click();
        myPizzaMainPage.italianPizza.click();
    }

    @When("^the user should click submit order$")
    public void the_user_should_click_submit_order() {
        myPizzaMainPage.submitButton.click();
    }

    @Then("^the user should fill up all field$")
    public void the_user_should_fill_up_all_field() {
        orderDetails.name.sendKeys("Jonh Doe");
        orderDetails.phoneNumber.sendKeys("553112233");
        orderDetails.dom.sendKeys("123");
        orderDetails.office.sendKeys("12");
        orderDetails.clickConditionButton();
    }
    @Then("^the user should click order$")
    public void the_user_should_click_order() {
        orderDetails.orderNow.click();

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
