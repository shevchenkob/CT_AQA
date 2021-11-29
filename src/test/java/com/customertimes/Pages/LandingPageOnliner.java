package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LandingPageOnliner extends BaseTest {

    public LandingPageOnliner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//div[@class='auth-bar__item auth-bar__item--text']")
//    private WebElement enterButton;



    public <GenericPage> GenericPage navigateToLogin(){

        WebElement enterButton = driver.findElement(By.xpath("//div[@class='auth-bar__item auth-bar__item--text']"));
        waitUntilElementIsWisible(enterButton, 3);
        enterButton.click();

        WebElement enterString = driver.findElement(By.xpath("//div[@class='auth-form__title auth-form__title_big auth-form__title_condensed-default']"));
        waitUntilElementIsWisible(enterButton, 3);
        enterString.isDisplayed();
        if (enterString.isDisplayed()) {
            return (GenericPage) new LoginPageOnliner(driver);
        }
        else {
            return (GenericPage) new LandingPageOnliner(driver);
        }

    }

    public boolean isPageLoaded() {
//        WebElement enterButton = driver.findElement(By.xpath("//div[@class='auth-bar__item auth-bar__item--text']"));
//        waitUntilElementIsWisible(enterButton, 3);
        return  driver.getCurrentUrl().equals("https://www.onliner.by/")
                && driver.getTitle().equals("Onliner");
    }

    }


