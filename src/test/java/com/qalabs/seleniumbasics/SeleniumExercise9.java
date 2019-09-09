package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumExercise9 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get("https://www.wikipedia.org");
        WebElement myElement = myDriver.findElement(By.id("searchInput"));
        myElement.sendKeys("software");
        myElement.submit();
        int contp = 0;
        List<WebElement> autoElements = myDriver.findElements(By.tagName("p"));
        for (WebElement element : autoElements) {
            if (element.getText().contains("software")) {
                contp++;
            }
        }
        System.out.print("\nEl link: " + myDriver.getCurrentUrl());
        System.out.print(" contiene " + contp + " veces la palabras software");

        int indice = 1;

        System.out.println("\n\nY contiene estos elementos de tipo a: \n" );
       if (indice <= 5) {
            List<WebElement> aElements = myDriver.findElements(By.tagName("a"));
           int conta = 0;
            for (WebElement topic : aElements) {
               System.out.println(topic.getText());
                if (topic.getText().contains("software")) {
                    topic.click();
                    conta++;
                    System.out.print("\nEl link: " + myDriver.getCurrentUrl());
                    System.out.print(" contiene " + conta + " veces la palabras software\n");
                    break;
                }

            }
    }

            Thread.sleep(5000);
            myDriver.close();

    }
}

