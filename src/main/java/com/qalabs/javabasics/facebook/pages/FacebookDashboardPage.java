package facebook.pages;

import com.qalabs.javabasics.facebook.components.login.login.LoginBodyComponent;
import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDashboardPage {
    public static  final String BASE_URL = "https://www.facebook.com";
    @FindBy(how = How.XPATH, using = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/is")
    private WebElement home;

    @FindBy(how = How.ID, using = "email")
    private WebElement inputEmail;

    @FindBy(how = How.ID, using = "pass")
    private WebElement getInputEmail;

    @FindBy(how = How.LINK_TEXT, using = "Forgot account?")
    private WebElement getInputForgotPass;

    @FindBy(how = How.ID, using = "u_0_4")
    private WebElement loginInFacebookButton;

    public FacebookDashboardPage(WebDriver driver) {
        super(mydriver);
        PageFactory.initElements(driver, this);
    }

    public FacebookLoginPage home(String home) {
        loginInFacebookButton.click();
        return new FacebookLoginPage();
    }

    public LoginBodyComponent inputEmail(String txtEmail) {
        inputEmail.sendKeys(txtEmail);

    }

    public LoginBodyComponent inputPass(String txtPass){

    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(myDriver, 10);
            wait.until(ExpectedConditions.visibilityOf(doddle));
            return true;
        } catch(RuntimeException exception) {
            return false;
        }
    }
}

