package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise13 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Wikipedia:Portada") : "Pagina equivocada";

        WebElement portadaLink = myDriver.findElement(By.linkText("Portada"));
        System.out.println(portadaLink.getAttribute("href"));

        List<WebElement> paginasLink = myDriver.findElements(By.partialLinkText("Página"));

        for (WebElement paginaLink : paginasLink) {
            System.out.println(paginaLink.getAttribute("href"));
        }

        List<WebElement> botones = myDriver.findElements(By.tagName("button"));

        for (WebElement boton : botones) {
            System.out.println(boton.getText());
        }

        myDriver.close();
        // Quit web driver
        myDriver.quit();
    }
}
