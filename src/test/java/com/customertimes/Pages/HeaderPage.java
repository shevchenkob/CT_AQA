package com.customertimes.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//button[@class='styles_userToolsToggler__imcSl']")
    private WebElement myAccauntButton;

    @FindBy(xpath = "//button[@class='userToolsBtn']")
    private WebElement toEnterButton;

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/']")
    private WebElement fridgesButton;


    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage preLogin() {
        waitUntilElementIsVisible(myAccauntButton, timeOutInSeconds);
        myAccauntButton.click();
        waitUntilElementIsVisible(toEnterButton, timeOutInSeconds);
        toEnterButton.click();

        return (GenericPage) new AuthorizeDetailsPage(driver);
    }

    public <GenericPage> GenericPage beforeIsLoginSuccessfulAction() {
        waitUntilElementIsClickable(myAccauntButton, 5);
        myAccauntButton.click();
        return (GenericPage) new AuthorizeDetailsPage(driver);
    }

    public <GenericPage> GenericPage preOrder() {
        waitUntilElementIsVisible(myAccauntButton, 3);
        fridgesButton.click();
        waitUntilElementIsVisible(myAccauntButton, 5);

        return (GenericPage) new ProductsPage(driver);
    }
}
