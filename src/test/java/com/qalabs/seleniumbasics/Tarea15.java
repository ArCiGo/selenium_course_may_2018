package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tarea15 {

    public static void main(String[] args) throws  NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> aElements = driver.findElements(By.xpath("/html/body//a"));

        for (WebElement item: aElements) {
            System.out.println("Hyperlink text: " + item.getAttribute("href"));
        }

        List<WebElement> headChildElements = driver.findElements(By.xpath("/html/head/child::*"));

        for (WebElement item : headChildElements) {
            System.out.println("Text: " + item.getAttribute("name"));
        }

        driver.close();
        driver.quit();
    }
}
