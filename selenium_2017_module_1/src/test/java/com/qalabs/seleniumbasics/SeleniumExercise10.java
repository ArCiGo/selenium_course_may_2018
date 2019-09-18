package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise10 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.mercadolibre.com.mx");
    WebElement myElement = myDriver.findElement(By.name("as_word"));
    myElement.sendKeys("Selenium");
    myDriver.findElement(By.className("nav-search-btn")).click();
    myDriver.findElement(By.className("main-title")).click();

    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}

