package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SelenuimExercise7 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get("https://www.amazon.com.mx");
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.id("twotabsearchtextbox"));
        myElement.sendKeys("selenium");
        myElement.submit();
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.close();
    }
}
