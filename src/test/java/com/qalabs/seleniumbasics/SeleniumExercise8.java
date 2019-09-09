package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise8 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get("https://www.facebook.com");
        WebElement myElement = myDriver.findElement(By.id("email"));
        myElement.sendKeys("anlly1402@hotmail.com");
        myElement = myDriver.findElement(By.id("pass"));
        myElement.sendKeys("disfrutalo");
        myElement = myDriver.findElement(By.id("u_0_2"));
        myElement.click();
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myElement = myDriver.findElement(By.name("q"));
        myElement.sendKeys("QA Minds");
        myElement.submit();
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        myDriver.close();

    }
}
