package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";

        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(5000);
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().to("https://www.espn.com.mx/");
        Thread.sleep(5000);
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().back();
        driver.navigate().back();
        System.out.println("Current URL: " + driver.getCurrentUrl());

        Thread.sleep(5000);

        driver.navigate().forward();
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();
        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.close();
        driver.quit();
    }
}
