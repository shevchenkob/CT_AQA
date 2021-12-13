package com.customertimes.Tests;

import com.customertimes.framework.driver.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Test started");
        driver = WebDriverRunner.getWebDriver();
        driver.get("https://www.21vek.by/");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("Test finished");
        WebDriverRunner.closeWebDriver();
    }

}