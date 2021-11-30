package com.customertimes.Tests;

import com.customertimes.Pages.LandingPageOnliner;
import com.customertimes.Pages.LoginPageOnliner;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTestOnliner extends BaseTest {

    @DataProvider
    public Object[][] ValidData() {
        return new Object[][]{
                {"johndoeseleniumtest@gmail.com", "johndoepassword"}
        };
    }

    @Test(dataProvider = "ValidData", priority = 1)
    public void successfulLoginTest(String userEmail, String userPassword) {
        LandingPageOnliner landingPageOnliner = new LandingPageOnliner(driver);
        Assert.assertTrue(landingPageOnliner.isPageLoaded(), "Landing page is not loaded.");

        LoginPageOnliner loginPageOnliner = landingPageOnliner.navigateToLogin();
        //Assert.assertEquals(loginPageOnliner, "");
    }
}
