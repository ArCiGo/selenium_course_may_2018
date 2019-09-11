package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");

        // Wait some seconds
        Thread.sleep(2000);

        assert myDriver.getCurrentUrl().equals("https://www.google.com.mx") : "Pagina equivocada";

        WebElement busqueda = myDriver.findElement(By.name("q"));

        busqueda.click();
        busqueda.sendKeys("Selenium");

        Thread.sleep(2000);

        WebElement boton = myDriver.findElement(By.name("btnK"));
        boton.click();

        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }

}
