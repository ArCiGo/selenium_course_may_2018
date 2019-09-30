package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        String url= "https://www.google.com.mx/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        String currentUrl = myDriver.getCurrentUrl();
        assert currentUrl.equals(url): "the url is not correct";
        WebElement myElement = myDriver.findElement(By.name("q"));
        myElement.sendKeys("selenium");
        myElement.submit();
        Thread.sleep(5000);
        myDriver.close();
    }
}
