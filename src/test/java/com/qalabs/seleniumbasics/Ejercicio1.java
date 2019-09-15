package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Ejercicio1 {
    public static WebDriver getDriver(String browser) throws InterruptedException {
        File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");
        if (browser.equals("chrome")) {
            File chromeFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            File firefoxFilePath = new File(rootPath, "geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
            return new FirefoxDriver();
        } else {
            return null;
        }
    }

    public static void main(String[] args)  throws InterruptedException {
        String browser = "firefox";

        WebDriver driver = getDriver(browser);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement passElement = driver.findElement(By.id("pass"));
        WebElement loginElement = driver.findElement(By.id("loginbutton"));
        emailElement.sendKeys("cesaralejandrovirgenherrera@gmail.com");
        passElement.sendKeys("36441380");
        loginElement.click();

        WebElement barElement = driver.findElement(By.name("q"));
        barElement.sendKeys("QAMinds");
        barElement.submit();

        WebElement likeElement = driver.findElement(By.id("u_1w_1"));
        likeElement.click();
        Thread.sleep(10000);
        driver.quit();
}
}
