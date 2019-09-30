package com.qalabs.javabasics.facebook.pages;

import com.qalabs.javabasics.facebook.components.login.login.LoginBodyComponent;
import com.qalabs.javabasics.facebook.components.login.login.LoginFooterComponent;
import com.qalabs.javabasics.facebook.components.login.login.LoginHeaderComponent;
import com.qalabs.javabasics.googleproject.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage extends BasePage {
    private LoginHeaderComponent loginHeaderComponent;

    private LoginBodyComponent loginBodyComponent;

    private LoginFooterComponent loginFooterComponent;

    @FindBy(how = How.CLASS_NAME, using = "fb_logo img sp_ydUEsVjCbun sx_7e0f83")
    private WebElement fbIconElement;


    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new LoginHeaderComponent(driver);
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
            return false;
        }
    }
}