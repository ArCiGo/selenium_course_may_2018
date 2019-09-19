package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3Challenge {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assert myDriver != null;
        myDriver.get("https://www.inaturalist.org");

       WebElement dropDown = myDriver.findElement(By.xpath("//div[@id='header-more-dropdown-toggle']"));
        dropDown.click();

        WebElement places = myDriver.findElement(By.xpath("//a[contains(text(),'Places')]"));
        places.click();

        WebElement searchBox = myDriver.findElement(By.cssSelector("#q"));
        searchBox.sendKeys("Colomos, Guadalajara");

        WebElement srchBtn = myDriver.findElement(By.xpath("//input[@value='Search']"));
        srchBtn.click();

        List<WebElement> subCategories = myDriver.findElements(By.cssSelector(".taxon_links"));

        for (WebElement list : subCategories) {
            System.out.println("- " + list.getText());
        }
        myDriver.close();
    }
}