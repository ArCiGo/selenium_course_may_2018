package com.qalabs.seleniumbasics.testngexamples;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestNgExa1 extends BaseTest{

    @Test(description = "Test google page - chrome")
    public void myUrl() {

        // Get google home page
        this.myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        this.myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertEquals(myDriver.getCurrentUrl(), "https://www.google.com.mx/", "Pagina equivocada");

        //myDriver.close();
        // Quit web driver
        //myDriver.quit();
    }
}
