package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WikipediaSearch {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        WebElement search = myDriver.findElement(By.id("searchInput"));
        search.click();
        String findStr = "Guadalajara";
        search.sendKeys(findStr);
        search.submit();

        for (int i = 0; i<5; i++) {
            searchTopic(findStr, myDriver);
            Thread.sleep(2000);
        }

        // Quit web driver
        myDriver.quit();
    }

    public static void searchTopic(String findStr, WebDriver myDriver) {
        List<WebElement> paragraphs = myDriver.findElements(By.tagName("p"));
        int cont = 0;
        for (WebElement paragraph : paragraphs)
            if (paragraph.getText().contains(findStr))
                cont++;
        System.out.println("\n\nEl link: " + myDriver.getCurrentUrl() + " \nLa palabra  " + findStr + " : " + cont + " veces.");

        List<WebElement> links = myDriver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            if (link.getText().contains(findStr)) {
                link.click();
                break;
            }
        }


    }
}
