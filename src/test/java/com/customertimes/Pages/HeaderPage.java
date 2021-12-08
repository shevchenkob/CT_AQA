package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BaseTest {

    @FindBy(xpath = "//button[@class='styles_userToolsToggler__imcSl']")
    private WebElement myAccauntButton;

    @FindBy(xpath = "//button[@class='userToolsBtn']")
    private WebElement toEnterButton;


    public HeaderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage preLogin() {
        waitUntilElementIsWisible(myAccauntButton, 3);
        myAccauntButton.click();
        waitUntilElementIsWisible(toEnterButton, 3);
        toEnterButton.click();

        return (GenericPage) new LandingPage(driver);
    }
}
