package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        //String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://facebook.com");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().to("https://espn.com.mx");
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());




        // Wait some seconds
          Thread.sleep(2000);

        // Quit web driver
        myDriver.quit();
    }
}
