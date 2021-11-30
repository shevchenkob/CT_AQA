package com.customertimes.Tests;

import com.customertimes.Pages.LandingPage21Vek;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest21Vek extends BaseTest {

    @DataProvider
    public Object[][] ValidData() {
        return new Object[][]{
                {"johndoeseleniumtest@gmail.com", "SW99ZQbk"}
        };
    }

    @Test(dataProvider = "ValidData", priority = 1)
    public void successfulLoginTest(String userEmail, String userPassword) {
        LandingPage21Vek landingPage21Vek = new LandingPage21Vek(driver);
        Assert.assertTrue(landingPage21Vek.isPageLoaded(), "Page https://www.21vek.by/ is not loaded.");
        landingPage21Vek.login(userEmail, userPassword);
        Assert.assertTrue(landingPage21Vek.isLoginSuccessfull(), "Login to https://www.21vek.by/ not successful");
    }

}
