package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise2 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";

        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.get("https://www.google.com");

        Thread.sleep(5000);

        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Source code");
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}