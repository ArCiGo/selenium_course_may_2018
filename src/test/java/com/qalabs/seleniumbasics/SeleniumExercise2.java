package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        WebDriver foxDriver = WebDriverFactory.getDriver(browser);
        foxDriver.get("https://www.google.com.mx");
        // agregado

        System.out.println("Titulo: " + foxDriver.getTitle());
        System.out.println("URL: " + foxDriver.getCurrentUrl());
        System.out.println("Source: " + foxDriver.getPageSource());

        Thread.sleep(5000);

        foxDriver.close();

        foxDriver.quit();
    }
}
