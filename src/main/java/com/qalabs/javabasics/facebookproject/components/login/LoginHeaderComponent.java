package com.qalabs.javabasics.facebookproject.components.login;

import com.qalabs.javabasics.facebookproject.components.FacebookComponent;
import com.qalabs.javabasics.facebookproject.page.FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

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

    public FacebookLoginPage logInFacebook(String userName, String password) {
        fbUserInputElement.sendKeys(userName);
        fbPassInputElement.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        fbLoginButtonElement.click();
        return new FacebookLoginPage(driver);
    }

    public FacebookLoginPage clickOnFacebookForgotPass() {
        fbIconElement.click();
        return new FacebookLoginPage(this.driver);
    }
}
