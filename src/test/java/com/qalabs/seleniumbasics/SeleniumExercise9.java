package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise9 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define browser,topic and url
        String browser = "chrome";
        String topic = "software";
        String url = "https://es.wikipedia.org/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        WebElement myElement = myDriver.findElement(By.id("searchInput"));
        myElement.sendKeys(topic);
        myElement.submit();
        int contp = 0;
        System.out.print("\n Link principal de busqueda:\n ");
        List<WebElement> swElements = myDriver.findElements(By.tagName("p"));
        for (WebElement element : swElements) {
            if (element.getText().contains(topic)) {
                contp++;
            }
        }
        System.out.print("\nEl link: " + myDriver.getCurrentUrl());
        System.out.print(" contiene " + contp + " veces la palabras " + topic);
        System.out.print("\n\n Link internos del topic:\n ");


        int index = 1;

        //System.out.print(" Link internos del topic: ");

        while(index<=5){
            List<WebElement> links = myDriver.findElements(By.tagName("a"));
            for (WebElement link : links)
                if (link.getText().contains(topic)) {
                    link.click();
                    break;
                }
            searchInLinks(topic, myDriver);
            myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            index++;
        }
        myDriver.close();
    }

    public static void searchInLinks(String topic, WebDriver myDriver){
            List<WebElement> paragraphs = myDriver.findElements(By.tagName("p"));
            int cont = 0;
            for (WebElement count : paragraphs)
                if (count.getText().contains(topic))
                    cont++;
               System.out.print("\nEl link: " + myDriver.getCurrentUrl());
               System.out.print(" contiene " + cont + " veces la palabras " + topic);;


        }

}

