package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class InvalidWait {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        //WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);
        // Get wikipedia home page
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        assert myDriver != null;
        myDriver.get("https://www.google.com");
        //myDriver1.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(3000);
        WebElement myElement = myDriver.findElement(By.id("JustAnInvalidId"));
        //WebElement myElement1 = myDriver1.findElement(By.id("searchInput"));


    }
}
