package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise6 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        String expectedURL = "https://www.facebook.com/";
        String expectedURLTitle = "Selenium - Web Browser Automation";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");

        WebElement emailInputElement = driver.findElement(By.id("email"));
        emailInputElement.clear();
        emailInputElement.sendKeys("armandocifuentes_1@hotmail.com");

        WebElement passwordInputElement = driver.findElement(By.id("pass"));
        passwordInputElement.clear();
        passwordInputElement.sendKeys("");

        WebElement loginButtonElement = driver.findElement(By.xpath("//input[@id='u_0_2']"));
        loginButtonElement.click();

        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}
