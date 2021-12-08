package com.customertimes.Tests;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.customertimes.Pages.HeaderPage;
import com.customertimes.Pages.OneProductPage;
import com.customertimes.Pages.ProductsPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Listeners(UniversalVideoListener.class)
public class ShopTest extends BaseTest {

    @Test(priority = 1)
    @Video
    public void successfulLoginTest() throws IOException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.preOrder();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.navigateToSecondPage();
        Assert.assertTrue(productsPage.isPageLoaded(), "Second page not loaded");
        productsPage.shopFridge();
        OneProductPage oneProductPage = new OneProductPage(driver);
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        Assert.assertTrue(oneProductPage.isPageLoaded()); /* Here should be assert false to record video */
        oneProductPage.buyFridge();


    }


}
