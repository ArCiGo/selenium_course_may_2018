package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXPath02 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> myElements = testDriver.findElements(By.xpath("//a"));

        for(WebElement elemento: myElements) {
            System.out.println("a: " + elemento.getText());//getAttribute("href").toString());
        }

        testDriver.close();
        testDriver.quit();
    }
}
