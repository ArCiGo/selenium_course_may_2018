package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String expected = "Selenium Tutorial For Beginners | What Is Selenium? | Selenium Automation Testing Tutorial | Edureka";

        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.navigate().to("https://www.youtube.com/");

        Thread.sleep(5000);

        WebElement inputSearch = driver.findElement(By.xpath("//input[@id='search']"));
        inputSearch.sendKeys("Selenium");

        WebElement searchInputButton = driver.findElement(By.id("search-icon-legacy"));
        searchInputButton.click();

        Thread.sleep(5000);

        WebElement firstVideoElement = driver.findElement(By.xpath("//a[contains(text(),'Selenium Tutorial For Beginners | What Is Selenium')]"));
        String aux = firstVideoElement.getAttribute("title");
        Assert.assertEquals(expected, "Selenium Tutorial For Beginners | What Is Selenium? | Selenium Automation Testing Tutorial | Edureka");

        driver.close();
        driver.quit();
    }
}
