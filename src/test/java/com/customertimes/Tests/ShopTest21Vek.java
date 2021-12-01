package com.customertimes.Tests;

import com.customertimes.Pages.ProductsPage21Vek;
import org.testng.annotations.Test;

public class ShopTest21Vek extends BaseTest {

    @Test(priority = 1)
    public void successfulLoginTest() {
        ProductsPage21Vek productsPage21Vek = new ProductsPage21Vek(driver);
        productsPage21Vek.shopFridge();

    }


}
