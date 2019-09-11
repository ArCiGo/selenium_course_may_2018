package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise7 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        Thread.sleep(10000);

        assert myDriver.getCurrentUrl().equals("https://www.amazon.com.mx") : "Pagina equivocada";

        WebElement busqueda = myDriver.findElement(By.id("twotabsearchtextbox"));

        busqueda.click();
        busqueda.sendKeys("Selenium");
        busqueda.submit();
        Thread.sleep(10000);

        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
