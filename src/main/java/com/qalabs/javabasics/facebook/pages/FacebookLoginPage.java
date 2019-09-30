package com.qalabs.javabasics.facebook.pages;

import com.qalabs.javabasics.facebook.components.login.login.LoginBodyComponent;
import com.qalabs.javabasics.facebook.components.login.login.LoginFooterComponent;
import com.qalabs.javabasics.facebook.components.login.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage{

    public static final Object[] BASE_URL = FACEBOOKURL;
    private LoginHeaderComponent loginHeaderComponent;

    private LoginBodyComponent loginBodyComponent;

    private LoginFooterComponent loginFooterComponent;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new LoginHeaderComponent(driver);
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();
        return new FacebookLoginPage(this.driver);
    }
}
