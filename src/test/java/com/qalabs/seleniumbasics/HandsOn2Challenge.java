package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2Challenge {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        myDriver.get("https://www.espn.com.mx/");

        List<WebElement> myElements = (List<WebElement>) myDriver.findElements(By.cssSelector(".cscore--final"));
        WebElement myElement0;
        WebElement myElement1;
        int i = 1;
        String league;
        for (WebElement myElement : myElements ) {
            league = myDriver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])["+ i +"]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");

            if (myElement.getAttribute("class").contains("cscore--away-winner")) {
                myElement0 = myElement.findElement(By.cssSelector(".cscore_item--away"));
                myElement1 = myElement0.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(league + " - Ganó visitante: " + myElement1.getAttribute("innerHTML"));
            }

            else if (myElement.getAttribute("class").contains("cscore--home-winner")) {
                myElement0 = myElement.findElement(By.cssSelector(".cscore_item--home"));
                myElement1 = myElement0.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(league + " - Ganó local: " + myElement1.getAttribute("innerHTML"));
            }
            System.out.println(i);
            i++;
        }
        // Wait some seconds

        // Quit web driver
        myDriver.close();
        myDriver.quit();
    }
}