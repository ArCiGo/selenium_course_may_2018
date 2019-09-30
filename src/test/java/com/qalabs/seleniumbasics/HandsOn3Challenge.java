package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3Challenge {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().window().maximize();
        myDriver.navigate().to("https://www.inaturalist.org");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dropDown = myDriver.findElement(By.xpath("        action.moveToElement(searchResults).perform();\n"));
        dropDown.click();

        WebElement places = myDriver.findElement(By.xpath("//a[contains(text(),'Places')]"));
        places.click();

        WebElement searchBox = myDriver.findElement(By.cssSelector("#q"));
        searchBox.sendKeys("Colomos, Guadalajara");

        WebElement srchBtn = myDriver.findElement(By.xpath("//input[@value='Search']"));
        srchBtn.click();

        List<WebElement> subCategories = myDriver.findElements(By.cssSelector(".taxon_links"));

        for (WebElement list : subCategories) {
            System.out.println("\nThe subcategories are: \n" + list.getText());
        }
        myDriver.close();
        myDriver.quit();
    }
}
