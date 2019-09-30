package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExcersice6 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://www.amazon.com.mx/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        List<WebElement> lista = myDriver.findElements(By.xpath("//a"));
        for (WebElement count : lista) {
            System.out.println(count.getText());
        }
        List<WebElement> lista1 = myDriver.findElements(By.xpath("//head/*"));
        for (WebElement count1 : lista1) {
            System.out.println(count1.getAttribute("href"));
        }
        myDriver.close();
    }
}
