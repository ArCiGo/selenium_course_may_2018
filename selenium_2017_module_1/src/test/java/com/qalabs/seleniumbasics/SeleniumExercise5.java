package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise5 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);

    myDriver.get("https://google.com");
    Thread.sleep(2000);
    assert myDriver.getCurrentUrl() == "https://google.com": "Abrió otra URL";
    WebElement myElement = myDriver.findElement(By.name("q"));
    myElement.sendKeys("Selenium");
    myElement.submit();


    // Wait some seconds
    Thread.sleep(5000);

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}