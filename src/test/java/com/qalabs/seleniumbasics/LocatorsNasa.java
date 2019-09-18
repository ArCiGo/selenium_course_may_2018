package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsNasa {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        //WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);

        assert myDriver != null;
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        myDriver.get("https://www.nasa.gov");
        //myDriver1.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(3000);
        WebElement myElement = myDriver.findElement(By.linkText("Missions"));
        //WebElement myElement1 = myDriver1.findElement(By.id("searchInput"))
        System.out.println(myElement.getAttribute("href"));

        myElement.findElement(By.tagName("a"));
        //System.out.println(myElement.getAttribute("href"));
    }
}