package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumLocators01 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        SeleniumHandsOn6 sH6 = new SeleniumHandsOn6();
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.mercadolibre.com.mx");

        WebElement myElement = testDriver.findElement(By.name("as_word"));
        myElement.sendKeys("Selenium");
        WebElement myButton = testDriver.findElement(By.className("nav-search-btn"));
        myButton.click();
     //   myElement.submit();

        myElement = testDriver.findElement(By.className("main-title"));

        myElement.click();

        Thread.sleep(5000);

        testDriver.close();

        testDriver.quit();
    }
}
