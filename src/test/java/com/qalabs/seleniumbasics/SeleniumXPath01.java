package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXPath01 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.xpath("/html"));
        System.out.println("html: " + myElement.getTagName());

        myElement = testDriver.findElement(By.xpath("//body"));
        System.out.println("body: " + myElement.getTagName());

        List<WebElement> myElements = testDriver.findElements(By.xpath("//body/div"));

        for(WebElement elemento: myElements) {
            System.out.println("div: " + elemento.getTagName());
        }

        myElements = testDriver.findElements(By.xpath("/input/@class"));

        for(WebElement elemento: myElements) {
            System.out.println("class: " + elemento.getText());
        }

        testDriver.close();
        testDriver.quit();
    }
}
