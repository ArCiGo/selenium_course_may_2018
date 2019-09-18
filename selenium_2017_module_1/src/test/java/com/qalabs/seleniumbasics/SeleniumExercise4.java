package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);

    myDriver.get("https://youtube.com");
    Thread.sleep(2000);
    WebElement myElement = myDriver.findElement(By.id("search"));
   if (myElement.isDisplayed()) {
     myElement.sendKeys("Selenium");
     myDriver.findElement(By.id("search-icon-legacy")).click();
   }


    // Wait some seconds
    Thread.sleep(5000);

    // Quit web driver
    myDriver.quit();
  }
}

