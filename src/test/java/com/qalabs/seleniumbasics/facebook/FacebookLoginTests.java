package com.qalabs.seleniumbasics.facebook;

import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import com.qalabs.seleniumbasics.utils.PropertyReader;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;


public class FacebookLoginTests extends BaseTest {

    private String facebookURL;
    private Object PropertyReader;

    @BeforeTest
    public void initSetup(Properties propertyReader){
        PropertyReader = new PropertyReader();
        facebookURL= propertyReader.getProperty("Credential.properties," "FACEBOOK_PAGE");

    }

    @Test()
    public void validateLoginPage() {

        Log.info("Entering to validateLoginPage() test*");
        this.myDriver.navigate().to( facebookURL );

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.myDriver);
        Assert.assertTrue(facebookLoginPage.isLoaded());
        Assert.assertArrayEquals( FacebookLoginPage.BASE_URL, facebookURL );

    }
    @Test
    public void loginWithValidCredentials() {
        String username, password;

        this.myDriver.navigate().to(facebookURL);
        PropertyReader propertyReader = new PropertyReader();
        username = propertyReader.getProperty( "Credentials.properties", "USERNAME" );
        password = propertyReader.getProperty( "Credentials.properties", "PASSWORD" );

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage( this.myDriver );

        Assert.assertTrue( facebookLoginPage.isLoaded());
        facebookLoginPage.filloginForm(username,password);
    }
}
