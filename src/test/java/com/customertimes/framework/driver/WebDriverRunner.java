package com.customertimes.framework.driver;

import com.customertimes.listeners.EventListener;
import com.customertimes.listeners.Highlighter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverRunner {
    private static EventFiringWebDriver driver;

    private WebDriverRunner(){}

    public static WebDriver getWebDriver(){
if (driver == null) {
    switch (TestConfig.CONFIG.browser()) {
        case "firefox": {
            WebDriverManager.firefoxdriver().setup();
            driver = new EventFiringWebDriver(new  FirefoxDriver());
            break;
        }
        default: {
            WebDriverManager.chromedriver().setup();
            driver = new EventFiringWebDriver(new  ChromeDriver());
        }
    }
    driver.manage().window().maximize();
    driver.register(new EventListener());
    driver.register(new Highlighter());
} return driver;
    }
    public static void closeWebDriver(){
        if (driver != null) {
            driver.quit();
        }
    }
}
