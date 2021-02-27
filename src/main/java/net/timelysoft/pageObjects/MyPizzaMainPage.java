package net.timelysoft.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyPizzaMainPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[text()='Пицца 30см']" )
    public WebElement pizza30cm;

    @FindBy(xpath = "//*[@id='CategoryItems_AB']/div[2]/div[1]/div/div[2]/div[4]/span[3]")
    public WebElement chickenPizza;

    @FindBy(xpath = "//*[@id='CategoryItems_AB']/div[2]/div[3]/div/div[2]/div[4]/span[3]")
    public WebElement italianPizza;

    @FindBy(xpath = "//*[@id= 'basket']/div[2]/a")
    public WebElement submitButton;


    public MyPizzaMainPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }





}
