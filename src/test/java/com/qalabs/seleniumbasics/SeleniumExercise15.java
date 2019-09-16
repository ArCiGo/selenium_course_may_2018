package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise15 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.amazon.com.mx") : "Pagina equivocada";

        List<WebElement> myLinks = myDriver.findElements(By.xpath("//a"));
        System.out.println("Elementos buscados con XPATH://a");
        for (WebElement myLink : myLinks) {
            System.out.println(myLink.getAttribute("href"));
        }

        List<WebElement> myChilds = myDriver.findElements(By.xpath("//head/child::*"));
        System.out.println("Elementos buscados con XPATH://head/child");
        for (WebElement myChild : myChilds) {
            System.out.println(myChild.getText());
        }


        // Quit web driver
        myDriver.quit();
    }
}
