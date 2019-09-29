package com.qalabs.javabasics.facebookproject.page;

import com.qalabs.javabasics.facebookproject.componets.login.LoginBodyComponent;
import com.qalabs.javabasics.facebookproject.componets.login.LoginFooterComponent;
import com.qalabs.javabasics.facebookproject.componets.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage extends BasePage{
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
