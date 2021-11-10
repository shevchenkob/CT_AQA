package com.customertimes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class AppTest extends BaseTest {

    @Test(description = "testOne")
    public void testOne() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3_000);
        String googleTitle = driver.getTitle();
        Assert.assertEquals(googleTitle, "Google");
    }

    @Test(description = "testTwo")
    public void testTwo() throws InterruptedException {
        driver.get("https://github.com/");
        Thread.sleep(3_000);
        String gitHubTitle = driver.getTitle();
        Assert.assertEquals(gitHubTitle, "GitHub: Where the world builds software · GitHub");
    }

    @Test(description = "testThree")
    public void testThree() throws InterruptedException {
        driver.get("https://www.salesforce.com/");
        Thread.sleep(3_000);
        String SFtitle = driver.getTitle();
        Assert.assertEquals(SFtitle, "Salesforce: We Bring Companies and Customers Together");
    }

    @Test(description = "Random generation one")
    public void testRandomOne() {
        Random rand = new Random();
        int upperbound = 10000;
        int int_rand = rand.nextInt(upperbound);
        int length = String.valueOf(int_rand).length();
        Assert.assertEquals(length, 4);
        System.out.println(int_rand);
    }

    @DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"https://www.google.com/"}, {"https://www.google.com.ua/"}, {"https://www.google.ru/"}};
    }

    @Test(dataProvider = "data-provider")
    public void testDataProvider(String site) throws InterruptedException {
        driver.get(site);
        Thread.sleep(3_000);
        String googleTitle = driver.getTitle();
        Assert.assertEquals(googleTitle, "Google");
    }
}
