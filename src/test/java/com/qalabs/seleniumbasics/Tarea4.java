package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Tarea4 {
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
    public static void main(String[]args) throws InterruptedException {
        String browser = "chrome";
        String curretUrl;
        WebDriver driver = getDriver(browser);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        Thread.sleep(6000);
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);

        WebElement barElement = driver.findElement(By.id("search"));
        WebElement searchElement = driver.findElement(By.id("search-icon-legacy"));
        System.out.println(barElement.isDisplayed() + " La barra esta desplegado");
        barElement.sendKeys("Selenium");
        searchElement.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
