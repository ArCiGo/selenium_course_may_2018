package com.qalabs.seleniumbasics.testngexamples;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgExample1 {

@Test
    public static void AssertWebpage(){
    String browser = "firefox";
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.get("http://www.google.com.mx/");

    String currentUrl = myDriver.getCurrentUrl();
    Assert.assertEquals(currentUrl, "http://google.com.mx/");
    }
}
