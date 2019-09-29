package com.qalabs.seleniumbasics.facebook;

import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import com.qalabs.javabasics.utils.Log;
import com.qalabs.seleniumbasics.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testngexamples.BaseTest;

public class FacebookLoginTests extends BaseTest {

    private String facebookURL;

    @BeforeTest
    public void initSetup() {
        PropertyReader propertyReader = new PropertyReader();
        facebookURL = propertyReader.getProperty("Credentials.properties", "FACEBOOK_PAGE");
    }

    @Test
    public void validateLoginPage() {
        Log.info("Entering to validateLoginPage() test");

        this.driver.navigate().to(facebookURL);

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.driver);

        Assert.assertTrue(facebookLoginPage.isLoaded());
        Assert.assertEquals(FacebookLoginPage.BASE_URL, facebookURL);
    }

    @Test
    public void loginWithValidCredentials() {
        String username, password;

        this.driver.navigate().to(facebookURL);

        PropertyReader propertyReader = new PropertyReader();
        username = propertyReader.getProperty("Credentials.properties", "USERNAME");
        password = propertyReader.getProperty("Credentials.properties", "PASSWORD");

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.driver);

        Assert.assertTrue(facebookLoginPage.isLoaded());
        facebookLoginPage.fillLoginForm(username, password);
    }
 }