package com.customertimes.OldTests;

import com.customertimes.Tests.BaseTest;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RegistrTest extends BaseTest {

    @Test(description = "successRegistr")
    public void successRegistr(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        String username = faker.address().firstName();

        driver.get("https://github.com/");
        WebElement signInButton = driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']"));
        signInButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement registerButton = driver.findElement(By.xpath("//a[@data-ga-click='Sign in, switch to sign up']"));
        registerButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement continueButton = driver.findElement(By.xpath("//button[@type='button']"));
        continueButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        passwordField.sendKeys(password);
        try {
            Thread.sleep(4_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement continuePasswordButton = driver.findElement(By.xpath("//button[@type='button']"));
        continuePasswordButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='login']"));
        usernameField.sendKeys(username);
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement continueUsernameButton = driver.findElement(By.xpath("//button[@type='button']"));
        continueUsernameButton.click();
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
