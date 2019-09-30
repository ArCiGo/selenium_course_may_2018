package com.qalabs.seleniumbasics.facebookproject;

import com.qalabs.javabasics.facebookproject.page.FacebookLoginPage;
import com.qalabs.seleniumbasics.testngexamples.BaseTest;
import com.qalabs.seleniumbasics.utils.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTests extends BaseTest {
    private String facebookUrl;

    @Test(alwaysRun = true, priority = 0)
    public void validateLoginPage() {
        PropertyReader properties = new PropertyReader();
        this.driver.get(properties.getProperty("test.properties", "TEST_URL"));

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.driver);

        facebookLoginPage.goToLoginPage().getBaseURL();

        Assert.assertEquals(facebookLoginPage.getBaseURL(), this.driver.getCurrentUrl(), "Is not the same page Facebook");
    }

    @Test(alwaysRun = true, priority = 1)
    public void loggerInFacebook() {
        String name;
        String pass;

        PropertyReader propertyReader= new PropertyReader();
        name= propertyReader.getProperty("test.properties", "USSER_NAME");
        pass=propertyReader.getProperty("test.properties", "PASSWORD");

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(this.driver);
        facebookLoginPage.facebookLoginForm(name,pass);
    }
}