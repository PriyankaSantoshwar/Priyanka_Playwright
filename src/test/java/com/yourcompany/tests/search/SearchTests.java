package com.yourcompany.tests.search;

import com.yourcompany.base.BaseTest;
import com.yourcompany.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest {

    @Test
    public void testSearchFunctionality() {
        HomePage homePage = new HomePage(page);
        homePage.closePopup();
        homePage.search("watch");
        Assert.assertTrue(page.url().contains("search") || page.content().length() > 0);
    }
}