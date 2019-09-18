package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumXPath03 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.xpath("//body/div[1]"));
        System.out.println("First: " + myElement.getTagName());

        myElement = testDriver.findElement(By.xpath("//body/div[last()]"));
        System.out.println("Last: " + myElement.getTagName());

        myElement = testDriver.findElement(By.xpath("//*[@role='navigation']"));
        System.out.println("role: " + myElement.getTagName());

        myElement = testDriver.findElement(By.xpath("//*[contains(@class,'nav')]"));
        System.out.println("nav: " + myElement.getTagName());

        myElement = testDriver.findElement(By.xpath("//*[@type='submit'and @class='nav-input']"));
        System.out.println("submit: " + myElement.getTagName());

        testDriver.close();
        testDriver.quit();
    }
}
