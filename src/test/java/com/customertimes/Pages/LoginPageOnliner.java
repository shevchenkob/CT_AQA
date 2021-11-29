package com.customertimes.Pages;

import com.customertimes.Tests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOnliner extends BaseTest {
    public LoginPageOnliner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//
//    public <GenericPage> GenericPage navigateToLogin(){
//       // WebElement loginField =
//
//    }
}
