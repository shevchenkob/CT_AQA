package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPageOnliner extends BaseTest {

    @FindBy(xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
    private WebElement enterButton;

    @FindBy(xpath = "//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']")
    private WebElement enterString;

    public LandingPageOnliner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage navigateToLogin() {

        waitUntilElementIsWisible(enterButton, 3);
        enterButton.click();
        waitUntilElementIsWisible(enterString, 3);
        enterString.isDisplayed();
        if (enterString.isDisplayed()) {
            return (GenericPage) new LoginPageOnliner(driver);
        } else {
            return (GenericPage) new LandingPageOnliner(driver);
        }

    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().equals("https://www.onliner.by/")
                && driver.getTitle().equals("Onliner");
    }

}


