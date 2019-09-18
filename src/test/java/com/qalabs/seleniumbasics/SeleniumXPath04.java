package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumXPath04 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        SeleniumHandsOn6 sH6 = new SeleniumHandsOn6();
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.xpath("//input[@type='text']"));
        myElement.sendKeys("fifth element nutrition");
        WebElement myButton = testDriver.findElement(By.xpath("//input[@class='nav-input' and @type='submit']"));
        myButton.click();

        myElement = testDriver.findElement(By.xpath("//img[@class='s-image']"));
        myElement.click();

        testDriver.close();

        testDriver.quit();


    }
}
