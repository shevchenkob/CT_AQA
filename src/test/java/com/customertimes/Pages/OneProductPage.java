package com.customertimes.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneProductPage extends BasePage {

    @FindBy(xpath = "//button[@data-ga_action='add_to_cart']")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@class='j-button-clicked g-basketbtn']")
    private WebElement inBasket;

    @FindBy(xpath = "//a[@class='headerCartBox']")
    private WebElement basketHeader;

    @FindBy(xpath = "//button[@class='g-button cr-button__order j-ga_track']")
    private WebElement createOrder;



    public OneProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage buyFridge() {
        buyButton.click();
        waitUntilElementIsVisible(inBasket, timeOutInSeconds);
        basketHeader.click();
        waitUntilElementIsVisible(createOrder, timeOutInSeconds);
        createOrder.click();
        return (GenericPage) new OneProductPage(driver);
    }

    public boolean isPageLoaded() {
        return buyButton.isDisplayed();
    }
}
