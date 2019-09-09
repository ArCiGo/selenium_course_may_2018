package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn4 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx");
        Thread.sleep(10000);

        WebElement myElement = testDriver.findElement(By.id("twotabsearchtextbox"));
        myElement.sendKeys("selenium");

        myElement.submit();

       // myElement.sendKeys("\n");  // si funciono
        Thread.sleep(10000);

        testDriver.close();

        testDriver.quit();

    }
}
