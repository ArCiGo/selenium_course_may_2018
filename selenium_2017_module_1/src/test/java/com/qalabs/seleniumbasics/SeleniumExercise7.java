package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise7 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);

    myDriver.get("https://amazon.com.mx");
    Thread.sleep(10000);
    WebElement myElement = myDriver.findElement(By.id("twotabsearchtextbox"));
    myElement.sendKeys("selenium");
    myElement.submit();

    // Wait some seconds
    Thread.sleep(10000);

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}