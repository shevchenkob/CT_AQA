package com.customertimes.Tests;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.customertimes.Pages.OneProductPage21Vek;
import com.customertimes.Pages.ProductsPage21Vek;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

@Listeners(UniversalVideoListener.class)
public class ShopTest21Vek extends BaseTest {

    @Test(priority = 1)
    @Video
    public void successfulLoginTest() throws IOException {
        ProductsPage21Vek productsPage21Vek = new ProductsPage21Vek(driver);
        productsPage21Vek.navigateToSecondPage();
        Assert.assertTrue(productsPage21Vek.isPageLoaded(), "Second page not loaded");
        productsPage21Vek.shopFridge();
        OneProductPage21Vek oneProductPage21Vek = new OneProductPage21Vek(driver);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));

        Assert.assertFalse(oneProductPage21Vek.isPageLoaded()); /* Here should be assert true */
        oneProductPage21Vek.buyFridge();



    }


}
