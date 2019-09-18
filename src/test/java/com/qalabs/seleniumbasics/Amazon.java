package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        //WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);
        // Get wikipedia home page
        assert myDriver != null;
        myDriver.get("https://www.amazon.com.mx");
        myDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //myDriver1.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(3000);
        WebElement myElement = myDriver.findElement(By.id("searchDropdownBox"));
        //WebElement dropDown = myDriver.findElement(Select());

        // System.out.println(myElement.getAttribute("href").contains("Portada"));

        // System.out.println(myDriver.findElements(By.linkText("Página")));

    }
}


