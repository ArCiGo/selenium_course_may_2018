package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonXpath {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assert myDriver != null;
        myDriver.get("https://www.amazon.com");

        List<WebElement> hyperlink = myDriver.findElements(By.xpath("//a/*"));

        for (WebElement list : hyperlink) {
            System.out.println(list.getAttribute("href"));
            list.click();
            System.out.println("Hyperlink: " + myDriver.getCurrentUrl());
           // myDriver.navigate().back();
           //  Thread.sleep(3000);
            List<WebElement> childsHead = myDriver.findElements(By.xpath("//head/child::*"));

            for (WebElement list1 : childsHead){
                System.out.println("-" + list1.getText());
            }
        }

        }
}
