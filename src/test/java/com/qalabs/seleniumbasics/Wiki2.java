package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Wiki2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "Https://www.wikipedia.org";
        String findStr = "Guadalajara";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // get wikipedia homepage
        myDriver.get(url);

        WebElement myElement = myDriver.findElement(By.className("pure-button"));
        myElement.sendKeys(findStr);

        //Get the text of the body element
        List<WebElement> webElementList = myDriver.findElements(By.className(".mw-search-suggest-link"));
        webElementList.iterator();

            List<WebElement> links  = myDriver.findElements(By.tagName("a"));
            for (int i = 0; i < links.size(); i++) {
                if (links.get(i).getAttribute("href").contains(findStr)) {
                    links.get(i).click();
                    break;
                }

                System.out.println(i);
                System.out.println("\nEn el Link: \n" + links + myDriver.getCurrentUrl());
                System.out.println("contiene " + links.size() + " veces la palabra   " + findStr);

                myDriver.close();
        }
    }
}


