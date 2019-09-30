package com.qalabs.javabasics.facebookproject.page;

import com.qalabs.javabasics.facebookproject.components.login.LoginBodyComponent;
import com.qalabs.javabasics.facebookproject.components.login.LoginFooterComponent;
import com.qalabs.javabasics.facebookproject.components.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage extends BasePage {
    private LoginHeaderComponent loginHeaderComponent;
    private LoginBodyComponent loginBodyComponent;
    private LoginFooterComponent loginFooterComponent;
    private WebElement fbIconElement;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new LoginHeaderComponent(driver);
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();
        return new FacebookLoginPage(this.driver);
    }

    public FacebookLoginPage facebookLoginForm(String userName, String password){
        this.loginHeaderComponent.logInFacebook(userName, password);
        return new FacebookLoginPage(this.driver);
    }

    public String getBaseURL() {
        return "https://www.facebook.com/";
    }

    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(fbIconElement));
            return true;
        } catch(RuntimeException exception) {
            System.out.println("Google results page is not loaded");
            return false;
        }
    }
}
