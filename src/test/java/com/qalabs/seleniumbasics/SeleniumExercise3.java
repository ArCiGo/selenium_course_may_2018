package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
        public static void main(String[] args) throws InterruptedException, NullPointerException {
            // Define which browser to use
            String browser = "firefox";

            // Get correct driver for desire browser
            WebDriver myDriver = WebDriverFactory.getDriver(browser);

            // Get google home page
            myDriver.get("https://www.google.com.mx");
            System.out.println(myDriver.getTitle());
            System.out.println(myDriver.getCurrentUrl());
            System.out.println(myDriver.getPageSource());



            // close browser
            myDriver.close();
        }
    }


