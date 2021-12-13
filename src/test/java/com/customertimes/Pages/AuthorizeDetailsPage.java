package com.customertimes.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizeDetailsPage extends BasePage {

    @FindBy(xpath = "//button[@class='userToolsBtn']")
    private WebElement toEnterButton;

    @FindBy(xpath = "//input[@id='login-email']")
    private WebElement userLoginField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement userPasswordField;

    @FindBy(xpath = "//button[@class='styles_reactButton__2olKd style_baseActionButton__2LQYJ styles_submitButton__lmwVK']")
    private WebElement enterButton;

    @FindBy(xpath = "//div[@class='ProfileItem_itemText__Qz7I0']")
    private WebElement exitButton;

    @FindBy(xpath = "//div[@class='style_actions__2mIsz']/button")
    private WebElement submitAuthorizationButton;

    By submitAuthorizationButtonLocator = By.xpath("//div[@class='style_actions__2mIsz']/button");

    WebDriverWait wait;

    public AuthorizeDetailsPage(WebDriver driver) {
        wait = new WebDriverWait(driver, timeOutInSeconds);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage login(String userEmail, String userPassword) {
        waitUntilElementIsVisible(userLoginField, timeOutInSeconds);
        userLoginField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        enterButton.click();
        return (GenericPage) new AuthorizeDetailsPage(driver);

    }

    public AuthorizeDetailsPage waitForSubmitAuthorizationButtonDisappear() {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(submitAuthorizationButtonLocator, 0));
            return new AuthorizeDetailsPage(driver);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("'Submit Authorization' Button was not found");
        }
    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().equals("https://www.21vek.by/")
                && driver.getTitle().equals("Онлайн-гипермаркет 21vek.by");
    }

    public boolean isLoginSuccessfull() {
        waitUntilElementIsClickable(exitButton, timeOutInSeconds);
        return exitButton.isDisplayed();
    }
}