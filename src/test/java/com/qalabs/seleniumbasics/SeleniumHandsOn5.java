package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn5 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.facebook.com");

        WebElement myElement = testDriver.findElement(By.id("email"));
        myElement.sendKeys("CORREO");

        WebElement passElement = testDriver.findElement(By.id("pass"));
        passElement.sendKeys("CLAVE");

        WebElement buttonElement = testDriver.findElement(By.id("loginbutton"));
        buttonElement.click();

        Thread.sleep(10000);

        myElement = testDriver.findElement(By.name("q"));
        myElement.sendKeys("QA Minds");
        myElement.submit();

        Thread.sleep(10000);

        testDriver.close();

        testDriver.quit();
    }
}
