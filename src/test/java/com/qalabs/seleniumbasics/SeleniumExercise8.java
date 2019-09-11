package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise8 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com.mx");

        // Wait some seconds
        Thread.sleep(2000);

        assert myDriver.getCurrentUrl().equals("https://www.facebook.com.mx") : "Pagina equivocada";

        WebElement busqueda = myDriver.findElement(By.id("email"));

        busqueda.click();
        busqueda.sendKeys("chuy.delgado.hernandez@gmail.com");

        Thread.sleep(2000);

        WebElement busqueda1 = myDriver.findElement(By.id("pass"));
        busqueda1.click();
        busqueda1.sendKeys("Negativo076");

        Thread.sleep(2000);

        WebElement boton = myDriver.findElement(By.id("loginbutton"));
        boton.click();

        Thread.sleep(5000);

        WebElement busqueda2 = myDriver.findElement(By.name("q"));
        busqueda2.click();
        busqueda2.sendKeys("QA Minds");
        busqueda2.submit();

        Thread.sleep(5000);


        // Quit web driver
        myDriver.quit();
    }
}
