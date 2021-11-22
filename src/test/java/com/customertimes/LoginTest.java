package com.customertimes;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "loginOne")
    public void loginOne() throws InterruptedException {

        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        driver.get("https://www.linkedin.com/");
        WebElement loginField = driver.findElement(By.id("session_key"));
        loginField.sendKeys(email);
        WebElement passwordField = driver.findElement(By.id("session_password"));
        passwordField.sendKeys(password);
        WebElement submitButton = driver.findElement(By.className("sign-in-form__submit-button"));
        submitButton.click();
        Thread.sleep(2_000);
        Assert.assertTrue(isLinkedinCheckYouPageLoaded(), "Negative login test failed");

    }

    public boolean isLinkedinCheckYouPageLoaded() {
        return driver.getCurrentUrl().contains("https://www.linkedin.com/checkpoint/challenge/");
    }

    @Test
    public void loginTwo() throws InterruptedException {

        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();

        driver.get("https://test.salesforce.com/");
        WebElement loginFieldSF = driver.findElement(By.cssSelector("#username"));
        loginFieldSF.sendKeys(email);
        WebElement passwordFieldSF = driver.findElement(By.cssSelector("#password"));
        passwordFieldSF.sendKeys(password);
        WebElement submitLoginSF = driver.findElement(By.cssSelector("#Login"));
        submitLoginSF.click();
        Thread.sleep(20_000);
        WebElement errorMessageSalesforceLogin = driver.findElement(By.cssSelector("#error"));
        Assert.assertEquals(true, errorMessageSalesforceLogin.isDisplayed());

    }

    public boolean wrongSfLogin() {
        WebElement errorMessageSalesforceLogin = driver.findElement(By.cssSelector("#error"));
        return driver.equals(errorMessageSalesforceLogin);
    }
}
