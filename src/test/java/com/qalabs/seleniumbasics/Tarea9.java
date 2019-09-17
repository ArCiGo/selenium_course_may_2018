package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tarea9 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String topic = "Humano";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement searchInputElement = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInputElement.sendKeys(topic);
        searchInputElement.sendKeys(Keys.RETURN);

        for(int i = 0; i < 5; i ++) {
            searchTopic(driver, topic);

            Thread.sleep(5000);
        }

        driver.close();
        driver.quit();
    }

    public static void searchTopic(WebDriver driver, String topic) {
        List<WebElement> p = driver.findElements(By.tagName("p"));
        int counter = 0;

        for (WebElement item : p) {
            if(item.getText().contains(topic)) {
                counter += 1;
            }
        }

        System.out.println("URL: " + driver.getCurrentUrl() + ". Search Topic: " + driver.getTitle() + ". Number of occurrences: " + counter);

        List<WebElement> a = driver.findElements(By.tagName("a"));

        for (WebElement item : a) {
            if(item.getText().contains(topic)) {
                item.click();
                break;
            }
        }
    }
}
