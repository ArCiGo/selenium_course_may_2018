package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise12 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    myDriver.get("https://www.nasa.gov/");
    WebElement myElement = myDriver.findElement(By.linkText("Missions"));
    System.out.println(myElement.getAttribute("href"));
    myElement = myDriver.findElement(By.linkText("NASA TV"));
    System.out.println(myElement.getAttribute("href"));
    myElement = myDriver.findElement(By.partialLinkText("Mars"));
    System.out.println(myElement.getAttribute("href"));
    myElement = myDriver.findElement(By.tagName("input"));

    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}