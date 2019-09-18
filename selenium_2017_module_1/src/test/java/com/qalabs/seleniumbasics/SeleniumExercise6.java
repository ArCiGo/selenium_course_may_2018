package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise6 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);

    myDriver.get("https://facebook.com");
    Thread.sleep(2000);
    WebElement myElement = myDriver.findElement(By.id("email"));
    myElement.sendKeys("r_m_s@hotmail.com");
    myElement = myDriver.findElement(By.id("pass"));
    myElement.sendKeys("elpassword");
    myElement = myDriver.findElement(By.id("loginbutton"));
    myElement.click();


    // Wait some seconds
    Thread.sleep(5000);

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}