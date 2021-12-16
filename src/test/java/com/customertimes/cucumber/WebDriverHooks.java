package com.customertimes.cucumber;

import com.customertimes.framework.driver.TestConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.customertimes.framework.driver.WebDriverRunner.closeWebDriver;
import static com.customertimes.framework.driver.WebDriverRunner.getWebDriver;

public class WebDriverHooks {
    @Before
    public void setUp() {
        getWebDriver().get(TestConfig.CONFIG.baseUrl());
    }

    @After
    public void tearDown() {
        closeWebDriver();
    }
}
