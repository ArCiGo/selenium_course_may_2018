package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise5 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String expectedURL = "https://www.google.com.mx/";
        String expectedURLTitle = "Selenium - Web Browser Automation";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.navigate().to("https://www.google.com.mx/");

        Thread.sleep(5000);

        WebElement inputSearch = driver.findElement(By.xpath("//input[@name='q']"));
        Assert.assertEquals(expectedURL, "https://www.google.com.mx/");

        inputSearch.sendKeys("Selenium");

        WebElement searchInputButton = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
        searchInputButton.click();

        Thread.sleep(5000);

        WebElement firstLinkElement = driver.findElement(By.xpath("//div[contains(text(),'Selenium - Web Browser Automation')]"));
        String aux = firstLinkElement.getText();
        Assert.assertEquals(expectedURLTitle, "Selenium - Web Browser Automation");

        driver.close();
        driver.quit();
    }
}
