package com.customertimes;

import com.customertimes.framework.driver.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Test started");
        driver = WebDriverRunner.getWebDriver();
                //WebDriverManager.chromedriver().create();
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("Test finished");
        WebDriverRunner.closeWebDriver();
        //driver.quit();
    }

}
