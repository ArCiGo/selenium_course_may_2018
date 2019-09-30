package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://www.nasa.gov/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get(url);
        WebElement myElement = myDriver.findElement(By.linkText("Missions"));
        myElement.getAttribute("href");
        System.out.println(myElement.getText());
        myElement = myDriver.findElement(By.linkText("NASA TV"));
        myElement.getAttribute("href");
        System.out.println(myElement.getText());
        myElement = myDriver.findElement(new By.ByPartialLinkText("Mars"));
        myElement.getAttribute("href");
        System.out.println(myElement.getText());
        myElement= myDriver.findElement(By.tagName("input"));
        myElement.getAttribute("href");
        System.out.println(myElement.getText());
        myDriver.close();
    }

   
}
