package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Xpath {
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

    public static void main(String[] args) throws InterruptedException {
        String browser = "chrome";

        WebDriver driver = getDriver(browser);
        String currentTitle;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.mx/");

        List<WebElement> xpathElement = driver.findElements(By.xpath("/html/body//a"));
        for (WebElement item : xpathElement) {
            System.out.println("text body "+ item.getAttribute("href"));
        }
        List<WebElement> alist = driver.findElements(By.xpath("/html/head/child::*"));
        for (WebElement item: alist)
        {
            System.out.println("text child's head "+item.getAttribute("href"));
        }
        driver.quit();
    }
}

