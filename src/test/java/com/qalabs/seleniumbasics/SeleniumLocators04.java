package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumLocators04 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada/");

        testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.linkText("Portada"));
        System.out.println("Portada: " + myElement.getAttribute("href").toString());

        List<WebElement> myElements = testDriver.findElements(By.partialLinkText("Página"));

        for(WebElement elemento: myElements) {
            System.out.println(elemento.getText() + " / " + elemento.getAttribute("href").toString());
        }

        myElements = testDriver.findElements(By.tagName("button"));

        for(WebElement elemento: myElements) {
            System.out.println("button: " + elemento.getText());
        }

        testDriver.close();
        testDriver.quit();
    }
}
