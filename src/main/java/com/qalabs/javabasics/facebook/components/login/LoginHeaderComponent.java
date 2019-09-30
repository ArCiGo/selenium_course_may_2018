package com.qalabs.javabasics.facebook.components.login;

import com.qalabs.javabasics.facebook.components.FacebookComponent;
import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class LoginHeaderComponent extends FacebookComponent {

    @FindBy(how = How.XPATH, using = "//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")
    private WebElement fbIconElement;
    @FindBy(how = How.ID, using = "email")
    private WebElement fbUserInputElement;
    @FindBy(how = How.ID, using = "pass")
    private WebElement fbPassInputElement;
    @FindBy(how = How.ID, using = "u_0_4")
    private WebElement fbForgotPassLinkElement;
    @FindBy(how = How.XPATH, using = "//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")
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
