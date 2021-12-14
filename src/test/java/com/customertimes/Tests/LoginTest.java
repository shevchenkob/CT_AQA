package com.customertimes.Tests;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.customertimes.Pages.HeaderPage;
import com.customertimes.Pages.AuthorizeDetailsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(UniversalVideoListener.class)
public class LoginTest extends BaseTest {

    private String baseUrl = "https://www.21vek.by/";

    @DataProvider
    public Object[][] ValidData() {
        return new Object[][]{
                {"johndoeseleniumtest@gmail.com", "SW99ZQbk"}
        };
    }

    @Test(dataProvider = "ValidData", priority = 1)
    @Video
    public void successfulLoginTest(String userEmail, String userPassword) {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.preLogin();
        AuthorizeDetailsPage authorizeDetailsPage = new AuthorizeDetailsPage(driver);
        Assert.assertTrue(authorizeDetailsPage.isPageLoaded(), "Page " + baseUrl + " is not loaded.");
        authorizeDetailsPage.login(email, password);
        authorizeDetailsPage.waitForSubmitAuthorizationButtonDisappear();
        headerPage.beforeIsLoginSuccessfulAction();
        Assert.assertTrue(authorizeDetailsPage.isLoginSuccessfull(), "Login to " + baseUrl + " not successful");
    }

}