package com.qalabs.seleniumbasics.testngexamples;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {

    protected WebDriver myDriver;

    @BeforeClass(description = "Set up driver", alwaysRun = true)
    public void setUp() {

        //Define browser
        String browser = "chrome";

        //Get driver
        myDriver = WebDriverFactory.getDriver(browser);
    }

    @AfterClass(description = "Tear Down driver")
    public void tearDown() {
        //myDriver.close();
        myDriver.quit();
    }
}
