package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Tarea7 {
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
        String currentTitle;
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.mx");
        WebElement barElement = driver.findElement(By.id("twotabsearchtextbox"));
        barElement.sendKeys("Selenium");
        barElement.submit();
        currentTitle= driver.getTitle();
        System.out.println(currentTitle);
        Thread.sleep(10000);

        driver.quit();
    }
}
