package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorExercise5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://www.amazon.com.mx/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        WebElement myElement = myDriver.findElement(By.id("searchDropdownBox"));
        List<WebElement> lista = myDriver.findElements(By.partialLinkText("Página"));
    }
}
