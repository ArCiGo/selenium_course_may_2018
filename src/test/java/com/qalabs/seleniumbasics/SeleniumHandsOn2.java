package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn2 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.google.com.mx");

        assert testDriver.getCurrentUrl().equals("https://www.google.com.mx"): "El Path no es el de Google";

        WebElement myElement = testDriver.findElement(By.className("gLFyf"));

        myElement.sendKeys("Automatizar Testing");

        myElement.submit();

        Thread.sleep(5000);

        testDriver.close();

        testDriver.quit();
    }
}
