package com.customertimes.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/page:2/']")
    private WebElement page2Button;

    @FindBy(xpath = "//a[@href='https://www.21vek.by/refrigerators/atlant_4423080n.html']")
    private WebElement fridgeButton;

//    @FindBy(xpath = "//span[@name='2']")
//    private WebElement selectedPageTwoButton;




    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public <GenericPage> GenericPage navigateToSecondPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(page2Button);
        actions.perform();
        waitUntilElementIsClickable(page2Button, timeOutInSeconds);
        page2Button.click();
        waitUntilElementIsClickable(fridgeButton, timeOutInSeconds);
        return (GenericPage) new ProductsPage(driver);
    }

    public <GenericPage> GenericPage shopFridge() {
        fridgeButton.click();
        return (GenericPage) new OneProductPage(driver);
    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().equals("https://www.21vek.by/refrigerators/page:2/");
       // return selectedPageTwoButton.isDisplayed();
    }
}