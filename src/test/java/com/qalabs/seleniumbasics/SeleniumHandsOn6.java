package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumHandsOn6 {
    private static WebDriver testDriver;
    private static int linkCount = 0;
    String sURL = "";

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        SeleniumHandsOn6 sH6 = new SeleniumHandsOn6();
        String browser = "chrome";
        testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://es.wikipedia.org");

        WebElement myElement = testDriver.findElement(By.id("searchInput"));
        myElement.sendKeys("Selenium");
        myElement.submit();

       // List<WebElement> selElement = testDriver.findElements(By.t);

        List<WebElement> pElements = testDriver.findElements(By.tagName("p"));
        List<WebElement> aElements = testDriver.findElements(By.tagName("a"));

        int totSelenium = 0;

        for(WebElement elemento: pElements) {
           // System.out.println(elemento.getText());
            if(elemento.getText().contains("Selenium")) {
            //    System.out.println("Selenium");
                totSelenium++;
            }
        }
        System.out.println("URL: " + testDriver.getCurrentUrl());
        System.out.println("Count Selenium (p): " + totSelenium);
        System.out.println("Total p Elements: " + pElements.size());
        System.out.println("Total a Elements: " + pElements.size());
        System.out.println("===================================================");

        sH6.linksSelenium(aElements);

        Thread.sleep(10000);

        testDriver.quit();
    }

    public void linksSelenium(List<WebElement> aElements) {
        System.out.println("URL Selenium: " + testDriver.getCurrentUrl());

        if(! sURL.equals(testDriver.getCurrentUrl())) {
            sURL = testDriver.getCurrentUrl();
            for(WebElement elemento: aElements) {
                if(elemento.getText().contains("Selenium")) {
                    //  System.out.println("Tag: " + elemento.getTagName() + " / " + elemento.getAttribute("href") + " = " + elemento.getText());
                    if(! elemento.getAttribute("href").contains("#") && ! elemento.getAttribute("href").contains("&")) {
                        System.out.println("Click " + linkCount + ": " + elemento.getText());
                        linkCount++;
                        if(linkCount <= 5) {
                            elemento.click();
                            try {
                                Thread.sleep(5000);
                            }catch(Exception ex) {
                                System.out.println("Error en tiempo: " + ex.getStackTrace());
                            }

                            List<WebElement> aElementos = testDriver.findElements(By.tagName("a"));
                            linksSelenium(aElementos);
                        } else {
                            System.out.println("Maximo de 5 links alcanzados");
                            //testDriver.close();
                            testDriver.quit();
                            break;
                        }

                    }
                }
            }
        }
        testDriver.quit();
    }
}
