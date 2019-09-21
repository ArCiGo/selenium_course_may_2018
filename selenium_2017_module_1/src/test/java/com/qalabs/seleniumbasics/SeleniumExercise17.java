package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise17 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.amazon.com.mx");
    WebElement myElement = myDriver.findElement(By.xpath("//*[@name='field-keywords']"));
    myElement.sendKeys("Fifth Element Nutrition");
    myDriver.findElement(By.xpath("//*[@class='nav-input']")).click();
    myDriver.findElement(By.xpath("//*[@class='a-link-normal'][1]")).click();

    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}

