package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise11 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    myDriver.get("https://www.google.com.mx");
    myDriver.findElement(By.id("maurer"));

    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}

