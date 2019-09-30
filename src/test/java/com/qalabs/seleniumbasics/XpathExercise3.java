package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class XpathExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        String topic = "fifth element nutrition";
        String url = "https://www.amazon.com.mx/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement myElement = myDriver.findElement(By.xpath("//input[@type='text']"));
        myElement.sendKeys(topic);
        myElement = myDriver.findElement(By.xpath("//*[@class='nav-input'and@type='submit']"));
        myElement.click();
        myElement = myDriver.findElement(By.xpath("//img[contains(@alt,'Termogénico con polini')]"));
        myElement.click();
        myDriver.close();
    }
}
