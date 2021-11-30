package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOnliner extends BaseTest {
    @FindBy(xpath = "//input[@placeholder='Ник или e-mail']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='b-top-profile__image js-header-user-avatar']")
    private WebElement profileButton;


    public LoginPageOnliner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage login(String userEmail, String userPassword){
        waitUntilElementIsWisible(loginField, 3);
        loginField.sendKeys(userEmail);
        passwordField.sendKeys(userPassword);
        submitButton.click();
        return (GenericPage) new LoginPageOnliner(driver);
    }

    public boolean isPageLoaded() {
        waitUntilElementIsWisible(profileButton, 3);
        return profileButton.isDisplayed();
    }
}
