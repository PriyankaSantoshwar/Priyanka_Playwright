package com.yourcompany.pages;

import com.microsoft.playwright.Page;
import com.yourcompany.base.BasePage;

public class CartPage extends BasePage {
    public CartPage(Page page) {
        super(page);
    }

    public String getPageTitle() {
        return page.title();
    }

    public void openCart() {
        String cartButton = "#ci";
        click(cartButton);
    }
}