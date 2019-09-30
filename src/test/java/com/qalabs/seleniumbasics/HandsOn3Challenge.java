package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn3Challenge {
<<<<<<< HEAD

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
=======
    public static void main(String[] args) throws InterruptedException, NullPointerException {
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
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    }
}
