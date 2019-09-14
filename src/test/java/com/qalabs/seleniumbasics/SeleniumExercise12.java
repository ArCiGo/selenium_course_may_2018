package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise12 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.nasa.gov/");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.nasa.gov/") : "Pagina equivocada";

        WebElement mision = myDriver.findElement(By.linkText("Missions"));
        System.out.println(mision.getAttribute("href"));

        WebElement nasaTv = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTv.getAttribute("href"));

        WebElement mars = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(mars.getAttribute("href"));

        WebElement myInput = myDriver.findElement(By.tagName("input"));
        System.out.println(myInput.getText());

        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
