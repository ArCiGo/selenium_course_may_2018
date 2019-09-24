package com.qalabs.seleniumbasics.testngexamples;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver myDriver;

    @BeforeClass (alwaysRun = true)
    public void setUp() {

        //define which browser
        String browser = "firefox";

        //get correct driver
        myDriver = WebDriverFactory.getDriver(browser);

    }
    @AfterClass (alwaysRun = true)
    public void tearDown() {
        myDriver.close();
        myDriver.quit();
    }
}
