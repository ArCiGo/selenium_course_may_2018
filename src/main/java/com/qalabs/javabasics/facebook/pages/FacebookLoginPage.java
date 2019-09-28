package com.qalabs.javabasics.facebook.pages;

import com.qalabs.javabasics.facebook.components.login.LoginBodyComponent;
import com.qalabs.javabasics.facebook.components.login.LoginFooterComponent;
import com.qalabs.javabasics.facebook.components.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage extends BasePage {

    private WebDriverWait wait = new WebDriverWait(driver, 5);
    private LoginHeaderComponent loginHeaderComponent;
    private LoginBodyComponent loginBodyComponent;
    private LoginFooterComponent loginFooterComponent;

    public final static String BASE_URL = "https://www.facebook.com/";

    public FacebookLoginPage(WebDriver driver) {
        super(driver);

        this.loginHeaderComponent = new LoginHeaderComponent(driver);
    }

    public boolean isLoaded() {
        wait.until(ExpectedConditions.visibilityOf(this.loginHeaderComponent.getFacebookIconElement()));

        try {
            return this.loginHeaderComponent.getFacebookIconElement().isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();

        return new FacebookLoginPage(this.driver);
    }

    public FacebookDashboardPage fillLoginForm(String username, String password) {
        this.loginHeaderComponent.fillLoginForm(username, password);

        return new FacebookDashboardPage(this.driver);
    }
}
