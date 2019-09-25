package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tarea19 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.inaturalist.org/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(driver);
        WebElement menuElement = driver.findElement(By.xpath("//ul[@id='mainnav']/li[@class='navtab moretab menutab']"));
        action.moveToElement(menuElement).perform();
        WebElement menuElementDisplayed = driver.findElement(By.xpath("//div[contains(@class, 'dropdown')]/ul/li/a[contains(text(), 'Places')]"));
        wait.until(ExpectedConditions.visibilityOf(menuElementDisplayed));
        action.moveToElement(menuElementDisplayed).click().build().perform();
        //action.moveToElement(aux1).moveToElement(driver.findElement(By.xpath("./div[contains(@class, 'dropdown')]/ul/li/a[contains(text(), 'Places')]"))).click().build().perform();

        WebElement searchInputElement = driver.findElement(By.xpath("//form/input[@name='q']"));
        wait.until(ExpectedConditions.visibilityOf(searchInputElement));
        searchInputElement.clear();
        searchInputElement.sendKeys("Colomos");

        WebElement searchButtonElement = driver.findElement(By.xpath("//form/input[@name='commit']"));
        wait.until(ExpectedConditions.visibilityOf(searchButtonElement));
        searchButtonElement.click();

        List<WebElement> cities = driver.findElements(By.xpath("//div[@id='searchform']/following-sibling::ul/li/a"));
        for (WebElement item : cities) {
            System.out.println(item.getText());
        }

        driver.close();
        driver.quit();
    }
}
