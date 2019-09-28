package com.qalabs.facebook.components.login;

import com.qalabs.facebook.components.FacebookComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginHeaderComponent extends FacebookComponent {
    @FindBy(how = How.ID, using = "email")
    private WebElement emailInput;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passInput;

    @FindBy(how = How.ID, using = "u_0_4")
    private WebElement logInButton;

    @FindBy(how = How.XPATH, using = "//h1/a")
    private WebElement fbIcon;

    @FindBy(how = How.XPATH, using = "//td/div/a")
    private WebElement forgotPassButton;

    public LoginHeaderComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
