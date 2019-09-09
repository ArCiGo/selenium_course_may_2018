package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");
        System.out.println(myDriver.getCurrentUrl());

        //Move to facebook page and print current url
        myDriver.navigate().to("https://facebook.com");
        System.out.println(myDriver.getCurrentUrl());

        // Move to ESPN main page and print current url
        myDriver.navigate().to("https://espn.com");
        System.out.println(myDriver.getCurrentUrl());

        // Move backward once and print current url
        myDriver.navigate().back();
        myDriver.navigate().back();

        System.out.println(myDriver.getCurrentUrl());

        //Move foward once and print current url
        myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());

        //Refresh and print current url
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl());

        // close browser
        myDriver.close();
    }
}
