package com.yourcompany.pages;

import com.microsoft.playwright.Page;
import com.yourcompany.base.BasePage;

public class HomePage extends BasePage {
    private final String accountButton = "label[for='dpdw-login']";
    private final String signInButton = "a[class='btn _prim -fw _md']";
    private final String searchBar = "#fi-q";
    private final String searchButton = ".btn._prim._md.-mls.-fsh0";

    public HomePage(Page page) {
        super(page);
    }

    public void closePopup() {
        String popup = "button[aria-label='newsletter_popup_close-cta']";
        if (isDisplayed(popup)) {
            click(popup);
        }
    }

    public LoginPage goToLoginPage() {
        click(accountButton);
        click(signInButton);
        return new LoginPage(page);
    }

    public SearchResultsPage search(String keyword) {
        type(searchBar, keyword);
        click(searchButton);
        return new SearchResultsPage(page);
    }
}