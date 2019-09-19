package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Wikipedia2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        // String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        //WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);
        // Get wikipedia home page
        assert myDriver != null;
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        myDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //myDriver1.get("https://www.wikipedia.org");

        // Wait some seconds
        Thread.sleep(3000);
        WebElement myElement = myDriver.findElement(By.linkText("Portada"));
        //WebElement myElement1 = myDriver1.findElement(By.id("searchInput"));
       // System.out.println(myElement.getAttribute("href").contains("Portada"));

       // System.out.println(myDriver.findElements(By.linkText("Página")));

        List<WebElement> topicElements = myDriver.findElements(By.tagName("href"));
        for (WebElement topic : topicElements) {
            //System.out.println(topic.getText());
            if (topic.getText().contains("Página")) {
                System.out.println(topicElements);
              //  break;
            }
            System.out.println(myDriver.findElements(By.tagName("button")));

            List<WebElement> topicElements1 = myDriver.findElements(By.tagName("button"));
            for (WebElement topic1 : topicElements1) {
                System.out.println(topic1.getText());

        }
            myDriver.quit();}
    }
}
