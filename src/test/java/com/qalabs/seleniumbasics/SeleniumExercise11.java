package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise11 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com.mx/");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebElement fakeIDElement = driver.findElement(By.id("JustAnInvalidID"));

        driver.close();
        driver.quit();
    }
}
