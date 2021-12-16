package com.customertimes.Tests;

import com.customertimes.framework.driver.TestConfig;
import com.customertimes.framework.driver.WebDriverRunner;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

import static com.customertimes.framework.driver.WebDriverRunner.getWebDriver;

public class BaseTest {
    protected WebDriver driver;
    protected String email = TestConfig.CONFIG.email();
    protected String password = TestConfig.CONFIG.password();

    @BeforeSuite(alwaysRun = true)
    public void beforeSuit() {
        System.out.println("Test started");
       driver = getWebDriver();
        driver.get("https://www.21vek.by/");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuit() {
        System.out.println("Test finished");
        WebDriverRunner.closeWebDriver();
    }

    public void takeScreenshot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected WebDriver getDriver(){
        return WebDriverRunner.getWebDriver();
    }

}