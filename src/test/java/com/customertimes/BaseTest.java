package com.customertimes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuit() {
        driver = WebDriverManager.chromedriver().create();
    }

    @AfterSuite
    public void afterSuit() {
        driver.quit();
    }

}
