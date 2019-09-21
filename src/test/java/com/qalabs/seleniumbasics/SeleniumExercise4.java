package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.youtube.com.mx");

        // Wait some seconds
        Thread.sleep(2000);

        WebElement busqueda = myDriver.findElement(By.id("search"));
        System.out.println(busqueda.isDisplayed());
        System.out.println(busqueda.isEnabled());

        busqueda.click();
        busqueda.sendKeys("Selenium");

        Thread.sleep(2000);

        WebElement boton = myDriver.findElement(By.id("search-icon-legacy"));
        boton.click();

        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
