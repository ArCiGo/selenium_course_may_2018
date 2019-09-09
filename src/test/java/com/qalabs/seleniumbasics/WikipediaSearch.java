package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class WikipediaSearch {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "Https://www.wikipedia.org";
        String findStr = "Guadalajara";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // get google home page
        myDriver.get(url);
        String currentUrl = myDriver.getCurrentUrl();
//        WebElement lang = myDriver.findElement(By.id("js-link-box-es"));
//        lang.click();

        WebElement myElement = myDriver.findElement(By.id("searchInput"));
        myElement.sendKeys(findStr);

//        WebElement linkElement = myDriver.findElement(By.cssSelector("suggestions-results.mw-searchSuggest-link.suggestion-special.special-query : first-child"));
//        linkElement.click();


//        WebElement searchButton = myDriver.findElement(By.className("pure-button"));
//        searchButton.click();

//        myElement = myDriver.findElement(By.id("firstHeading"));
//        myElement.isSelected();

        //Get the text of the body element
        List<WebElement> links = myDriver.findElements(By.className("pure-button"));
        Iterator<WebElement> iterar = links.iterator();

        while (iterar.hasNext()) {
            WebElement miElement1 = iterar.next();
            miElement1.click();
            List<WebElement> pElemnts = myDriver.findElements(By.tagName("a"));
            int results = 0;

            for (WebElement element : pElemnts) {
                if (element.getText().contains("Guadalajara")) {
                    results++;
                }
            }
            System.out.println("\nEn el Link: \n" + myDriver.getCurrentUrl());
            System.out.println("contiene " + results + " la palabra " + findStr);
            myDriver.close();

        }
    }
}





//        String bodyText = body.getText();
//        //count concurrences of the string
//        int count = 0;
//        while (bodyText.contains("Guadalajara")) {
//            //when match is found
//            count ++;
//            // continue searching from where you left off
//            bodyText = bodyText.substring(bodyText.indexOf("Guadalajara") + "Guadalajara".length());
//        }
//        //print current url search topic and numeber of matches for each element that contains the search topic in their text
//        System.out.println(count);
//        System.out.println(myElement.findElement(By.id("bodyContent")));
//        System.out.println(myDriver.getCurrentUrl());
//
//        //visit hyperlink
//
//       myElement = myDriver.findElement(By.linkText("Guadalajara"));
//       myElement.click();






