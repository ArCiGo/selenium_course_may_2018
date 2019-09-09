package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver foxDriver = WebDriverFactory.getDriver(browser);
        foxDriver.get("https://www.youtube.com.mx");

        WebElement myElement = foxDriver.findElement(By.id("search"));
        System.out.println("Desplegable: " + myElement.isDisplayed());
        System.out.println("Enabled: " + myElement.isEnabled());

        myElement.sendKeys("selenium");

        WebElement buttonElement = foxDriver.findElement(By.id("search-icon-legacy"));

        buttonElement.click();

        Thread.sleep(5000);

        foxDriver.close();
        foxDriver.quit();



    }
}
