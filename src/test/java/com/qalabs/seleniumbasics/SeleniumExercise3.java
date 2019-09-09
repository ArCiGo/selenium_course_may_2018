package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.google.com.mx");

        System.out.println("URL: " + testDriver.getCurrentUrl());

        testDriver.navigate().to("https://www.facebook.com");

        System.out.println("URL: " + testDriver.getCurrentUrl());

        testDriver.navigate().to("https://www.espn.com.mx");

        System.out.println("URL: " + testDriver.getCurrentUrl());

        testDriver.navigate().back();
        testDriver.navigate().back();

        System.out.println("URL: " + testDriver.getCurrentUrl());

        testDriver.navigate().forward();
        System.out.println("URL: " + testDriver.getCurrentUrl());

        testDriver.navigate().refresh();
        System.out.println("URL: " + testDriver.getCurrentUrl());

        Thread.sleep(5000);

        testDriver.close();

        testDriver.quit();

    }
}
