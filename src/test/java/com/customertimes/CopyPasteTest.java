package com.customertimes;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class CopyPasteTest extends BaseTest {
    @Test(description = "successRegistr")
    public void successRegistr() {
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();


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

        Actions act = new Actions(driver);
        act.moveToElement(emailField).doubleClick().build().perform();
        emailField.sendKeys(Keys.chord(Keys.CONTROL, "c"));
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
        passwordField.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}