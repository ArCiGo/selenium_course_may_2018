package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise11 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        String url = "https://google.com/";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.id("JustAnInvalidID"));
        myElement.click();
        myDriver.close();
    }
}
