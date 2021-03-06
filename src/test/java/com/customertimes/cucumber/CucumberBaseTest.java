package com.customertimes.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "smoke",
        glue = {"LoginToShop"},
        features = "src/test/resources/cucumber.feature"
)
public class CucumberBaseTest extends AbstractTestNGCucumberTests {

}
