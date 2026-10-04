package com.yourcompany.base;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import java.util.regex.Pattern;

public class BasePage {
    protected Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    protected Locator find(String selector) {
        return page.locator(selector);
    }

    protected void click(String selector) {
        page.click(selector);
    }

    protected void type(String selector, String value) {
        page.fill(selector, value);
    }

    protected String getText(String selector) {
        return page.textContent(selector);
    }

    protected boolean isDisplayed(String selector) {
        return page.isVisible(selector);
    }

    protected void waitForNavigation() {
        page.waitForLoadState();
    }

    protected String getPageTitle() {
        return page.title();
    }
}