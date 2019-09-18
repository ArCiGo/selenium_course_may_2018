package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;


public class Wikipedia {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        //WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);
        // Get wikipedia home page
        assert myDriver != null;
        myDriver.get("https://www.wikipedia.org");
        myDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //myDriver1.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(3000);
        WebElement myElement = myDriver.findElement(By.id("searchInput"));
        //WebElement myElement1 = myDriver1.findElement(By.id("searchInput"));

        myElement.sendKeys("selenium", Keys.ENTER);
        //myElement1.sendKeys("selenium", Keys.ENTER);
        Thread.sleep(3000);

        java.util.List<WebElement> links = myDriver.findElements(By.tagName("a"));
        out.println("Number of links in this page is " + links.size());
        int count = 0;
        /*
       for (int i = 1; i<=links.size(); i=i+1)
        {
            System.out.println(links.get(i));
        }
        */
        for (WebElement currentLink : links
        ) {
            String strLinkText = currentLink.getText();
            if (currentLink.getText().contains("selenium")) {
                count++;

                System.out.println(strLinkText);
                System.out.println(count);
                currentLink.click();

                //System.out.println(currentLink);
            }
        }
        System.out.println(myDriver.getCurrentUrl());

        int maxPages = 0;
        int counter = 0;

        while (true) {
            if (maxPages > 4) break;
            List<WebElement> topicElements = myDriver.findElements(By.tagName("p"));
            //List<WebElement> topicElements1 = myDriver1.findElements(By.tagName("p"));

            for (WebElement topic : topicElements) {
                System.out.println(topic.getText());
                if (topic.getText().contains("selenium")) {
                    System.out.println(counter);
                    topic.click();
                    counter++;
                    break;
                }
            }

            System.out.println (myDriver.findElements(By.tagName("a")));
            System.out.println(counter);
            myDriver.quit();
        }

    }
}
