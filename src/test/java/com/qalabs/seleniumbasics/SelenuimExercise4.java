package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelenuimExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get("https://www.youtube.com/");
        WebElement myElement= myDriver.findElement(By.id("search"));
        boolean displayed;
        if (myElement.isDisplayed()) {
            displayed = true;
        } else displayed = false;
        if (displayed != true) throw new AssertionError("the element is enabled");
        myElement.sendKeys("selenium");
        myElement= myDriver.findElement(By.id("search-icon-legacy"));
        myElement.click();
        Thread.sleep(5000);
        myDriver.close();

    }

}
