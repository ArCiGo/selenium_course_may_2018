package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise8 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String expectedURL = "https://www.facebook.com/";
        String expectedURLTitle = "QA Minds Lab";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement emailInputElement = driver.findElement(By.id("email"));
        emailInputElement.clear();
        emailInputElement.sendKeys("armandocifuentes_1@hotmail.com");

        WebElement passwordInputElement = driver.findElement(By.id("pass"));
        passwordInputElement.clear();
        passwordInputElement.sendKeys("");

        WebElement loginButtonElement = driver.findElement(By.xpath("//input[@id='u_0_2']"));
        loginButtonElement.click();

        WebElement searchInputElement = driver.findElement(By.className("_1frb"));
        wait.until(ExpectedConditions.visibilityOf(searchInputElement));
        searchInputElement.sendKeys("QA Minds Lab");
        //searchInputElement.sendKeys(Keys.RETURN);

        WebElement searchButtonElement = driver.findElement(By.xpath("//form[contains(@action, '/search/top/')]//button[contains(@class, '_42ft _4jy0 _4w98 _4jy3 _517h _51sy')]"));
        wait.until(ExpectedConditions.visibilityOf(searchButtonElement));
        searchButtonElement.click();

        Thread.sleep(5000);

        WebElement firstPageElement = driver.findElement(By.xpath("//div[contains(@class, '_442n')]//child::div[contains(@class, '_6v_0 _4ik4 _4ik5')]//a[contains(text(), 'QA Minds Lab')]"));
        wait.until(ExpectedConditions.visibilityOf(firstPageElement));
        String aux = firstPageElement.getText();

        Assert.assertEquals(expectedURLTitle, "QA Minds Lab");

        driver.close();
        driver.quit();
    }
}
