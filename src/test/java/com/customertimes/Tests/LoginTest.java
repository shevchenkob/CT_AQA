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

    @DataProvider
    @Video
    public Object[][] ValidData() {
        return new Object[][]{
                {"johndoeseleniumtest@gmail.com", "SW99ZQbk"}
        };
    }

    @Test(dataProvider = "ValidData", priority = 1)
    public void successfulLoginTest(String userEmail, String userPassword) {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.preLogin();
        AuthorizeDetailsPage authorizeDetailsPage = new AuthorizeDetailsPage(driver);
        Assert.assertTrue(authorizeDetailsPage.isPageLoaded(), "Page https://www.21vek.by/ is not loaded.");
        authorizeDetailsPage.login(userEmail, userPassword);
        authorizeDetailsPage.waitForSubmitAuthorizationButtonDisappear();
        headerPage.beforeIsLoginSuccessfulAction();
        Assert.assertTrue(authorizeDetailsPage.isLoginSuccessfull(), "Login to https://www.21vek.by/ not successful");
    }

}