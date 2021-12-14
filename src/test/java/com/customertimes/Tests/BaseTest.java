package com.customertimes.Tests;

import com.customertimes.framework.driver.TestConfig;
import com.customertimes.framework.driver.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;
    protected String email = TestConfig.CONFIG.email();
    protected String password = TestConfig.CONFIG.password();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuit() {
        System.out.println("Test started");
       driver = WebDriverRunner.getWebDriver();
        driver.get("https://www.21vek.by/");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuit() {
        System.out.println("Test finished");
        WebDriverRunner.closeWebDriver();
    }

}