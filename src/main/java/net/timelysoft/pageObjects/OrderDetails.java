package net.timelysoft.pageObjects;

import net.timelysoft.helper.WaitHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderDetails {

    WebDriver driver;
    WaitHelper waitHelper;
    JavascriptExecutor js;

    public OrderDetails(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        waitHelper = new WaitHelper(driver);
    }

    @FindBy(xpath = "//*[@id='cartOrderId']/form/div[2]/input" )
    public WebElement name;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='tab-delivery']/div[3]/div[1]/input")
    public WebElement dom;

    @FindBy(xpath = "//*[@id='tab-delivery']/div[4]/div[1]/input")
    public WebElement office;

    @FindBy(id = "order-agreement-agree")
    public WebElement conditions;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement orderNow;


    public void clickConditionButton() {

         js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,1000)");
         js.executeScript("arguments[0].click();",conditions);


    }
}
