package com.yourcompany.pages;

import com.microsoft.playwright.Page;
import com.yourcompany.base.BasePage;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(Page page) {
        super(page);
    }

    public boolean resultContains(String keyword) {
        String result = "//*[contains(translate(normalize-space(string(.)), 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'),'" + keyword.toLowerCase() + "')]";
        return page.locator(result).count() > 0;
    }
}