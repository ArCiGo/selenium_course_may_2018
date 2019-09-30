package com.qalabs.javabasics.facebook.components.login.login;

import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import facebook.components.FacebookComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHeaderComponent extends FacebookComponent {

    @FindBy()
    private WebElement fbIconElement;

    private WebElement fbUserInputElement;

    private WebElement fbPassInputElement;

    private WebElement fbForgotPassLinkElement;

    private WebElement fbLoginButtonElement;

    public LoginHeaderComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public FacebookLoginPage clickOnFacebookIcon() {
        fbIconElement.click();
        return new FacebookLoginPage(this.driver);
    }
}
