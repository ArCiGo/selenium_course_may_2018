package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumHandsOn1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // Get correct driver for desire browser

       WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.close();
    }
}






