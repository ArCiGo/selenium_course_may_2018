package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {
    public static void main(String[] args) throws NullPointerException {
        String browser = "chrome";
        WebDriver myDriver;
        myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().window().maximize();
        myDriver.navigate().to("https://www.espn.com.mx/");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> searchLeage = myDriver.findElements(By.cssSelector("div[class='scoreLabel_content']"));
        searchLeage.size();
        System.out.println("---------------------------------------------------\n" + "***Leagues are: " + searchLeage.size());

        for (WebElement element : searchLeage) {
            System.out.println("---------------------------------------------------------\n" + "\nThe Leage name are: " + element.getText() + "\n--------------------------------------------------------\n");
            System.out.println("\n");
            System.out.print("**Games played**");

        for (WebElement item : searchLeage) {
                if (item.getText().contains("F")) {
                    System.out.println("----------------------------------------------------------------\n");
                    System.out.println(item.getText());
                }
            }
            List<WebElement> myElementsGameDiv = myDriver.findElements(By.cssSelector("div[class='cscore_link']"));
            for (WebElement item2 : myElementsGameDiv) {
                if (item2.getText().contains("F")) {
                    System.out.println("------------------------------------------------------------------\n");
                    System.out.println(item2.getText());
                }
            }

            myDriver.close();

        }
    }
}