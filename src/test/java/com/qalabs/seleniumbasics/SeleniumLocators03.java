package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumLocators03 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.nasa.gov");

        testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.linkText("Missions"));
        System.out.println("Missions: " + myElement.getAttribute("href").toString());

        myElement = testDriver.findElement(By.linkText("NASA TV"));
        System.out.println("NASA TV: " + myElement.getAttribute("href").toString());

        myElement = testDriver.findElement(By.partialLinkText("Mars"));
        System.out.println("Mars: " + myElement.getAttribute("href").toString());

        myElement = testDriver.findElement(By.tagName("input"));
        System.out.println("input: " + myElement.getText());

        testDriver.close();
        testDriver.quit();
    }
}
