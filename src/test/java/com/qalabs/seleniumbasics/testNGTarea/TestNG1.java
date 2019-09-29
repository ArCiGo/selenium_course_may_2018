package com.qalabs.seleniumbasics.testNGTarea;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG1 {
    @Test
    public static void passTC() {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.manage().window().maximize();
        testDriver.get("https://www.google.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(testDriver.getCurrentUrl(), "https://www.google.com.mx/", "Parece que no es Google");

        testDriver.close();

        testDriver.quit();
    }
}

