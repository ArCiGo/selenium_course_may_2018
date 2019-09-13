package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorsExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://es.wikipedia.org/wiki/Wikipedia:Portada/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get(url);
        WebElement myElement = myDriver.findElement(By.linkText("Portada"));
        myElement.getAttribute("href");
        System.out.println(myElement.getText());
        List<WebElement> lista = myDriver.findElements(By.partialLinkText("Página"));
        for (WebElement count : lista) {
            System.out.println(count.getText());
            System.out.println(count.getAttribute("href"));
        }

        List<WebElement> lista1 =myDriver.findElements(By.tagName("button"));
        for (WebElement count1 : lista1) {
            System.out.println(count1.getAttribute("href"));
        }

        myDriver.close();

    }
}

