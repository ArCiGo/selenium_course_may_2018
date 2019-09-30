package com.qalabs.seleniumbasics.facebook;

import com.qalabs.javabasics.facebook.components.login.login.LoginHeaderComponent;
import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import com.qalabs.seleniumbasics.BaseTest;
import com.qalabs.seleniumbasics.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest extends BaseTest {
    private Object name, pass;

    @Test()
    public void validateLoginPage() {
        this.myDriver.get( PropertyReader.getProperty("test.properties", "TEST_URL"));

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.myDriver);

        //Assert.assertEquals(myDriver.getCurrentUrl(), FacebookLoginPage.);
        //facebookLoginPage.goToLoginPage().getBaseURL();

        Assert.assertTrue(facebookLoginPage.isLoaded(), "Facebook page is not loaded");
    }
    @Test(alwaysRun = true, priority = 1)
    public void loggerInFacebook() {
        //this.myDriver.get(PropertyReader.getProperty("test.properties", "USSER_NAME"));
        name= PropertyReader.getProperty("test.properties", "USSER_NAME");
        pass=PropertyReader.getProperty("test.properties", "PASSWORD");
        //this.myDriver.get(PropertyReader.getProperty("test.properties", "PASSWORD"));
        LoginHeaderComponent home = new  LoginHeaderComponent(myDriver);
    }

}
