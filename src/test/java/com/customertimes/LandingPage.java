package com.customertimes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    @FindBy (xpath = "/html/body/div[1]/hgf-globalnavigation")
    public WebElement landingLogin;


    public LandingPage(WebDriverManager driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }
}
