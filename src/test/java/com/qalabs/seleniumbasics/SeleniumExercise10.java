package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise10 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        String topic = "Selenium";
        String url = "https://mercadolibre.com.mx";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.name("as_word"));
        myElement.sendKeys(topic);
        myElement = myDriver.findElement(By.className("nav-icon-search"));
        myElement.click();
        myElement = myDriver.findElement(By.className("lazy-load"));
        myElement.click();

        myDriver.close();

    }
}
