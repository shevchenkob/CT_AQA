package com.customertimes.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    @FindBy(xpath = "//button[@class='styles_userToolsToggler__imcSl']")
    private WebElement myAccauntButton;

    @FindBy(xpath = "//button[@class='userToolsBtn']")
    private WebElement enterButton;

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/']")
    private WebElement fridgesButton;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage openLoginForm() {
        waitUntilElementIsVisible(myAccauntButton, timeOutInSeconds);
        myAccauntButton.click();
        waitUntilElementIsVisible(enterButton, timeOutInSeconds);
        enterButton.click();

        return new LoginPage(driver);
    }

    public HeaderPage beforeIsLoginSuccessfulAction() {
        waitUntilElementIsClickable(myAccauntButton, timeOutInSeconds);
        myAccauntButton.click();
        return this;
    }

    public ProductsPage startOrder() {
        waitUntilElementIsVisible(myAccauntButton, timeOutInSeconds);
        fridgesButton.click();
        waitUntilElementIsVisible(myAccauntButton, timeOutInSeconds);

        return  new ProductsPage(driver);
    }
}
