package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn8 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        SeleniumHandsOn6 sH6 = new SeleniumHandsOn6();
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.google.com.mx");

        testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.id("JustInvalidId"));

        testDriver.close();
        testDriver.quit();
    }
}
