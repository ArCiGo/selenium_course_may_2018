package com.qalabs.javabasics.facebook.components.login;

import com.qalabs.javabasics.facebook.components.FacebookComponent;
import com.qalabs.javabasics.facebook.pages.FacebookDashboardPage;
import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginHeaderComponent extends FacebookComponent {

    @FindBy(how = How.XPATH, using = "//div[@class = 'lfloat _ohe']/descendant::a/i/u")
    private WebElement facebookIconElement;

    @FindBy(how = How.ID, using = "email")
    private WebElement facebookUserInputElement;

    @FindBy(how = How.ID, using = "pass")
    private WebElement facebookPasswordInputElement;

    @FindBy(how = How.LINK_TEXT, using = "Forgotten account?")
    private WebElement facebookForgotPasswordLinkButtonElement;

    @FindBy(how = How.XPATH, using = "//td/label[contains(@class, 'login_form_login_button')]/input")
    private WebElement facebookLoginButtonElement;

    public WebElement getFacebookIconElement() {
        return this.facebookIconElement;
    }

    public LoginHeaderComponent(WebDriver driver) {
        super(driver);

        this.driver = driver;
    }

    public FacebookLoginPage clickOnFacebookIcon() {
        facebookIconElement.click();

        return new FacebookLoginPage(this.driver);
    }

    public FacebookDashboardPage fillLoginForm(String username, String password) {
        facebookUserInputElement.clear();
        facebookUserInputElement.sendKeys(username);

        facebookPasswordInputElement.clear();
        facebookPasswordInputElement.sendKeys(password);

        facebookLoginButtonElement.click();

        return new FacebookDashboardPage(this.driver);
    }
}
