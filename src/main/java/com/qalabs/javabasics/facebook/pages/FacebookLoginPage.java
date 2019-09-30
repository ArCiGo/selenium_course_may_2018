package com.qalabs.javabasics.facebook.pages;

import com.qalabs.javabasics.facebook.components.login.LoginBodyComponent;
import com.qalabs.javabasics.facebook.components.login.LoginFooterComponent;
import com.qalabs.javabasics.facebook.components.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage extends BasePage{
    public static final String BASE_URL = "https://www.facebook.com/";
    private LoginHeaderComponent loginHeaderComponent;

    private LoginBodyComponent loginBodyComponent;

    private LoginFooterComponent loginFooterComponent;

    @FindBy(how = How.XPATH, using = "//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")
    private WebElement fbIconElement;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new LoginHeaderComponent(driver);
    }

    public FacebookLoginPage facebookLoginForm(String userName, String password){
        this.loginHeaderComponent.logInFacebook(userName, password);
        return new FacebookLoginPage(this.driver);
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();
        return new FacebookLoginPage(this.driver);
    }

    @Override
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
