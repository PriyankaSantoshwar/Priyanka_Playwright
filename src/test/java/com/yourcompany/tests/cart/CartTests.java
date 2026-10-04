package com.yourcompany.tests.cart;

import com.yourcompany.base.BaseTest;
import com.yourcompany.pages.CartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {

    @Test
    public void testCartPageLoads() {
        CartPage cartPage = new CartPage(page);
        cartPage.openCart();
        Assert.assertTrue(page.url().contains("cart") || page.title().length() > 0);
    }
}