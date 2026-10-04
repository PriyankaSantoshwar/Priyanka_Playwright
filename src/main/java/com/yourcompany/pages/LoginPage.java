package com.yourcompany.pages;

import com.microsoft.playwright.Page;
import com.yourcompany.base.BasePage;

public class LoginPage extends BasePage {
    private final String emailField = "#fi-login-email";
    private final String continueButton = "button[type='submit']";
    private final String passwordField = "#fi-login-pass";

    public LoginPage(Page page) {
        super(page);
    }

    public void login(String email, String password) {
        type(emailField, email);
        click(continueButton);
        type(passwordField, password);
        click(continueButton);
    }
}