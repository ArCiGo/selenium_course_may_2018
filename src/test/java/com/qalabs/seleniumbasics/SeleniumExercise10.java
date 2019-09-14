package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class SeleniumExercise10 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String topic = "Selenium";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.mercadolibre.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchInputElement = driver.findElement(By.name("as_word"));
        searchInputElement.sendKeys(topic);

        WebElement searchButtonElement = driver.findElement(By.className("nav-search-btn"));
        searchButtonElement.click();

        WebElement titleSearchElement = driver.findElement(By.className("breadcrumb__title"));

        WebElement product = driver.findElement(By.className("main-title"));
        product.click();

        Thread.sleep(5000);

        WebElement productNameElement = driver.findElement(By.className("item-title__primary"));

        driver.close();
        driver.quit();
    }
}
