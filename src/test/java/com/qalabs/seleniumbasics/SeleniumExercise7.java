package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise7 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        Thread.sleep(10000);

        WebElement searchInputElement = driver.findElement(By.id("twotabsearchtextbox"));
        searchInputElement.clear();
        searchInputElement.sendKeys("Selenium");
        searchInputElement.sendKeys(Keys.RETURN);

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.close();
        driver.quit();
    }
}
