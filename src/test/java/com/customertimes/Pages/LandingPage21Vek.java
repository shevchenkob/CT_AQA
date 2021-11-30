package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage21Vek extends BaseTest {

    @FindBy(xpath = "//button[@class='styles_userToolsToggler__imcSl']")
    private WebElement myAccauntButton;

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

    public LandingPage21Vek(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage login(String userEmail, String userPassword) {
        waitUntilElementIsWisible(myAccauntButton, 3);
        myAccauntButton.click();
        waitUntilElementIsWisible(toEnterButton, 3);
        toEnterButton.click();
        waitUntilElementIsWisible(userLoginField, 3);
        userLoginField.sendKeys(userEmail);
        userPasswordField.sendKeys(userPassword);
        enterButton.click();
        return (GenericPage) new LandingPage21Vek(driver);

    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().equals("https://www.21vek.by/")
                && driver.getTitle().equals("Онлайн-гипермаркет 21vek.by");
    }

    public boolean isLoginSuccessfull(){
        waitUntilElementIsWisible(myAccauntButton, 3);
        myAccauntButton.click();
        return exitButton.isDisplayed();
    }
}
