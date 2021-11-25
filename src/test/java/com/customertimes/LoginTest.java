package com.customertimes;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @DataProvider (name = "data-provider1")
    public Object[][] ValidData() {
        return new Object[][]{
                {"johndoeseleniumtest1@gmail.com", "johndoepassword"}  };
    }

    @Test (dataProvider= "data-provider1")
    public void positiveLoginOne(String userEmail, String userPassword) {
        driver.get("https://www.linkedin.com/");
        WebElement enterButton = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
        enterButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = driver.findElement(By.xpath("//input[@id='username']"));
        emailField.sendKeys(userEmail);
        WebElement passwordFiel = driver.findElement(By.xpath("//input[@id='password']"));
        passwordFiel.sendKeys(userPassword);
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test(description = "negativeLoginOne")
    public void negativeLoginOne() throws InterruptedException {

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
        boolean isCorrectUrl = driver.getCurrentUrl().contains("https://www.linkedin.com/checkpoint/challenge/");
        Assert.assertTrue(isCorrectUrl, "Negative login test failed");

    }


    @Test (description = "negativeLoginTwo")
    public void negativeLoginTwo() throws InterruptedException {

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
        Thread.sleep(10_000);
        WebElement errorMessageSalesforceLogin = driver.findElement(By.cssSelector("#error"));
        Assert.assertEquals(true, errorMessageSalesforceLogin.isDisplayed());

    }

}
