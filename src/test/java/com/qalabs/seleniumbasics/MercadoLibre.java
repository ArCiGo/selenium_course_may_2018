package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MercadoLibre {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String topic = "Selenium";
        String expectedProductName = "Selenio/selenium 200 Mcg 100 Tab Anticancerigeno Importado";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.navigate().to("https://www.mercadolibre.com.mx/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchInputElement = driver.findElement(By.name("as_word"));
        searchInputElement.sendKeys(topic);
        //searchInputElement.sendKeys(Keys.RETURN);

        WebElement searchButtonElement = driver.findElement(By.className("nav-search-btn"));
        searchButtonElement.click();

        WebElement titleSearchElement = driver.findElement(By.className("breadcrumb__title"));
        Assert.assertEquals(titleSearchElement.getText(), topic.toLowerCase());

        WebElement product = driver.findElement(By.className("main-title"));
        product.click();

        Thread.sleep(5000);

        WebElement productNameElement = driver.findElement(By.className("item-title__primary"));
        Assert.assertEquals(productNameElement.getText().toLowerCase(), expectedProductName.toLowerCase());

        driver.close();
        driver.quit();
    }
}