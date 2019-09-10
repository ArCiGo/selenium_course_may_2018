package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumHandsOn1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        //  String browser1 = "chrome";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // WebDriver myDriver1 = WebDriverFactory.getDriver(browser1);
        // Get google home page
        myDriver.get("https://www.wikipedia.org");
        //    myDriver1.get("https://www.wikipedia.org");
      /*  System.out.println(myDriver.getTitle());
        System.out.println(myDriver.getCurrentUrl());
        System.out.println(myDriver.getPageSource()); */
        // Wait some seconds
        Thread.sleep(5000);
     /*  myDriver.navigate().to("https://www.facebook.com");
            System.out.println(myDriver.getCurrentUrl());
       myDriver.navigate().to("https://www.espn.com.mx");
       myDriver.navigate().back();
       myDriver.navigate().back();
            System.out.println(myDriver.getCurrentUrl());
       myDriver.navigate().forward();
        System.out.println(myDriver.getCurrentUrl());
        myDriver.navigate().refresh();
        System.out.println(myDriver.getCurrentUrl()); */
        WebElement myElement = myDriver.findElement(By.id("searchInput"));
        //WebElement myElement1 = myDriver1.findElement(By.id("searchInput"));
        // myElement.findElement(By.id("email"));
        myElement.sendKeys("selenium", Keys.ENTER);
        //   myElement1.findElement(By.id("email"));
        //     myElement1.sendKeys("selenium", Keys.ENTER);
  /*  WebElement searchButton = myDriver.findElement(By.id("search-icon-legacy"));


     myElement.isDisplayed();
     myElement.isEnabled();
     myElement.sendKeys("selenium");
     myElement.findElement(By.id("search-icon-legacy"));
     searchButton.click(); */
        List<WebElement> li = myElement.findElements(By.tagName("a"));
        System.out.println("Number of links: " + li.size());
        for (WebElement we : li) {
            System.out.println(we.getText());
            Thread.sleep(5000);
            // Quit web driver
            myDriver.quit();
            //myDriver1.quit();
//Other way to print all links:
            for(int i = 0; i < li.size(); i++){
                System.out.println(li.get(i).getText());
            }
        }
    }
}






