package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        //Move to...
        myDriver.navigate().to("https://www.facebook.com");

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        //Move to...
        myDriver.navigate().to("https://www.espn.com.mx");

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        //Move backward twice
        myDriver.navigate().back();
        Thread.sleep(2000);
        myDriver.navigate().back();

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        //Move to...
        myDriver.navigate().forward();

        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        myDriver.navigate().refresh();
        //Print current url
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(2000);

        // Quit web driver
        myDriver.quit();
    }
}
