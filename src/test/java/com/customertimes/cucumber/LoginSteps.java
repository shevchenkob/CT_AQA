package com.customertimes.cucumber;

import com.customertimes.Pages.HeaderPage;
import com.customertimes.Pages.LoginPage;
import com.customertimes.Tests.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.customertimes.framework.driver.WebDriverRunner.getWebDriver;

public class LoginSteps extends BaseTest {
    private String baseUrl = "https://www.21vek.by/";

    private HeaderPage headerPage = new HeaderPage(getWebDriver());
    private LoginPage loginPage = new LoginPage(getWebDriver());

    @Given("User navigate to login page")
    public void userNavigateToLogin () {
        headerPage.openLoginForm();
        Assert.assertTrue(loginPage.isPageLoaded(), "Page " + baseUrl + " is not loaded.");
    }

    @When("User enter email and password")
    public void userEnterCredentials (){
        loginPage.login(email, password);

    }

    @Then("User click on login button")
    public void clickOnLogin (){
        loginPage.waitForSubmitAuthorizationButtonDisappear();
    }

    @Then("User should be logged in")
    public void userShouldBeLoggedInCheck(){
        headerPage.beforeIsLoginSuccessfulAction();
        Assert.assertTrue(loginPage.isLoginSuccessfull(), "Login to " + baseUrl + " not successful");
    }
}
