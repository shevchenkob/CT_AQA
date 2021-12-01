package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class ProductsPage21Vek extends BaseTest {

    @FindBy(xpath = "//button[@class='styles_userToolsToggler__imcSl']")
    private WebElement myAccauntButton;

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/']")
    private WebElement fridgesButton;

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/page:2/']")
    private WebElement page2Button;


    public ProductsPage21Vek(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage shopFridge() {
        waitUntilElementIsWisible(myAccauntButton, 3);
        fridgesButton.click();
        waitUntilElementIsWisible(myAccauntButton, 5);
        Actions actions = new Actions(driver);
        actions.moveToElement(page2Button);
        actions.perform();
        waitUntilElementIsClickable(page2Button, 5);
        page2Button.click();

        try {
            Thread.sleep(7_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return (GenericPage) new ProductsPage21Vek(driver);
    }
}
