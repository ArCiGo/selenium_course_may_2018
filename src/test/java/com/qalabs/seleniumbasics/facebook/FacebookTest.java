package com.qalabs.seleniumbasics.facebook;

import com.qalabs.javabasics.facebook.pages.FacebookLoginPage;
import com.qalabs.seleniumbasics.google.BaseTest;
import com.qalabs.seleniumbasics.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest {
    private String facebookUrl;

    @BeforeTest
    public void initSetup(){
        com.qalabs.seleniumbasics.utils.PropertyReader propertyReader= new com.qalabs.seleniumbasics.utils.PropertyReader();
        facebookUrl= propertyReader.getProperty("test.properties", "TEST_URL");
    }

    @Test(alwaysRun = true, priority = 0)
    public void validateLoginPage() {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.myDriver);

        myDriver.navigate().to(facebookUrl);
        //Assert.assertTrue(facebookLoginPage.isLoaded(), "Google results page is not loaded");
        Assert.assertEquals(myDriver.getCurrentUrl(), FacebookLoginPage.BASE_URL);
    }
    @Test(alwaysRun = true, priority = 1)
    public void loggerInFacebook() {
        String name;
        String pass;

        com.qalabs.seleniumbasics.utils.PropertyReader propertyReader= new PropertyReader();
        name= propertyReader.getProperty("test.properties", "USSER_NAME");
        pass=propertyReader.getProperty("test.properties", "PASSWORD");

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(myDriver);
        facebookLoginPage.facebookLoginForm(name,pass);
    }

}
