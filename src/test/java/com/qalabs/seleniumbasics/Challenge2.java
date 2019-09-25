package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Challenge2 {
    public static void main(String[] args) throws  NullPointerException {
        // Define which browser to use
        String browser = "firefox";
        String url = "https://www.inaturalist.org";
        String topic="Colomos, Guadalajara";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.cssSelector("#header-more-dropdown-toggle"));
        myElement.click();
        myElement= myDriver.findElement(By.xpath("//a[contains(text(),'Places')]"));
        myElement.click();
        myElement = myDriver.findElement(By.xpath("//input[@class='text']"));
        myElement.sendKeys(topic);
        myElement= myDriver.findElement(By.xpath("//input[@value='Search']"));
        myElement.click();
        List<WebElement> subCategories = myDriver.findElements(By.cssSelector(".taxon_links"));
        for (WebElement listCategories : subCategories) {
            System.out.println( listCategories.getText());
        }
        myDriver.close();
    }
}
