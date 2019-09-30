package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2Challenge1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        //String browser = "firefox";
        String browser = "chrome";
        String url="https://www.espn.com.mx/";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().window().maximize();
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement myElement;
        WebElement myElementBis;
        int i=1;
        String league="";
        List<WebElement> myElements =  myDriver.findElements(By.cssSelector(".cscore--final"));
        for (WebElement iteratorElement : myElements ) {
            league = myDriver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])["+ i +"]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");
            if (iteratorElement.getAttribute("class").contains("cscore--away-winner")) {
                myElement = iteratorElement.findElement(By.cssSelector(".cscore_item--away"));
                myElementBis = myElement.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(league + " -  Win away: " + myElementBis.getAttribute("innerHTML"));
            } else if (iteratorElement.getAttribute("class").contains("cscore--home-winner")) {
                myElement = iteratorElement.findElement(By.cssSelector(".cscore_item--home"));
                myElementBis = myElement.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(league + " - Win home: " + myElementBis.getAttribute("innerHTML"));
            }
            i++;
        }
        myDriver.close();
        myDriver.quit();
    }
}