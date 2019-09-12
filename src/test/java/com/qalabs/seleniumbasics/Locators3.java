package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Locators3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://www.nasa.gov/";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // get google home page
        myDriver.get(url);
        WebElement myElement = myDriver.findElement(By.linkText("Missions"));
        myElement.getAttribute("href");
        System.out.println(myElement.getAttribute("href"));

        myElement = myDriver.findElement(By.linkText("NASA TV"));
        myElement.getAttribute("href");
        System.out.println(myElement.getAttribute("href"));

        myElement = myDriver.findElement(By.partialLinkText("Mars"));
        myElement.getAttribute("href");
        System.out.println(myElement.getAttribute("href"));

        myElement = myDriver.findElement(By.tagName("input"));
        myElement.getAttribute("input");
        System.out.println(myElement.getAttribute("input"));

        myElement.submit();
        Thread.sleep(5000);
        myDriver.close();
    }

}
