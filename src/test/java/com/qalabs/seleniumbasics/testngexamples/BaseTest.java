package com.qalabs.seleniumbasics.testngexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import com.qalabs.seleniumbasics.WebDriverFactory;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        String browser = "chrome";

        driver = WebDriverFactory.getDriver(browser);
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
