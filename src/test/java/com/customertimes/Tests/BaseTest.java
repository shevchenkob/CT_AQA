package com.customertimes.Tests;

import com.customertimes.framework.driver.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Test started");
        driver = WebDriverRunner.getWebDriver();
        driver.get("https://www.onliner.by/");
                //WebDriverManager.chromedriver().create();
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("Test finished");
        WebDriverRunner.closeWebDriver();

        //driver.quit();
    }

    protected void waitUntilElementIsWisible (WebElement webElement, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));

    }
}
