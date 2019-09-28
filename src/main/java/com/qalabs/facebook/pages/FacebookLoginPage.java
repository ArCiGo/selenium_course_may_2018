package com.qalabs.facebook.pages;

import com.qalabs.facebook.components.login.LoginHeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage extends BasePage {

    private LoginHeaderComponent loginHeaderComponent;



    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        this.loginHeaderComponent = new loginHeaderComponent(driver);
    }

    public FacebookLoginPage goToLoginPage() {
        this.loginHeaderComponent.clickOnFacebookIcon();
        return new FacebookLoginPage(this.driver);
    }

    public FacebookHomePage logIn(String email, String pass) {
        this.emailInput.clear();
        this.passInput.clear();

    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(logInButton));
            //logger.info("Facebook Log in page loaded");
            return true;
        } catch (RuntimeException exception) {
            //logger.error("Facebook Log in page was not loaded: " + exception);
            return false;
        }
    }


}
