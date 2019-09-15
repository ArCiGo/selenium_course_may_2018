package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Tarea5 {
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
        String browser = "chrome";

        WebDriver driver = getDriver(browser);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");

        WebElement textElement = driver.findElement(By.name("q"));
        textElement.sendKeys("cats");
        textElement.submit();

        Thread.sleep(5000);

        driver.quit();
    }
}
