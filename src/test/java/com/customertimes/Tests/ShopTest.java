package com.customertimes.Tests;

import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import com.customertimes.Pages.HeaderPage;
import com.customertimes.Pages.OneProductPage;
import com.customertimes.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(UniversalVideoListener.class)
public class ShopTest extends BaseTest {

    @Test(priority = 2)
    @Video
    public void successfulShopTest() throws IOException {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.startOrder();
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.navigateToSecondPage();
        Assert.assertTrue(productsPage.isPageLoaded(), "Second page not loaded.");
        productsPage.shopFridge();
        OneProductPage oneProductPage = new OneProductPage(driver);
        takeScreenshot();
        Assert.assertTrue(oneProductPage.isPageLoaded(), "One fridge page not loaded."); /* Here should be assert false to record video */
        oneProductPage.buyFridge();


    }


}
