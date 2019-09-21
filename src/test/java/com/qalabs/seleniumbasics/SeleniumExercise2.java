package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;


public class SeleniumExercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(5000);

        //Print page title
        System.out.println(myDriver.getTitle());;

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        //Print source code
        System.out.println(myDriver.getPageSource());

        // Quit web driver
        myDriver.quit();
    }


}
