package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WikiPortada
{
    public static WebDriver getDriver(String browser) throws InterruptedException
    {
        File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");
        if (browser.equals("chrome"))
        {
            File chromeFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
            return new ChromeDriver();
        }
        else if (browser.equals("firefox"))
        {
            File firefoxFilePath = new File(rootPath, "geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
            return new FirefoxDriver();
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args)  throws InterruptedException {
        String browser = "chrome";

        WebDriver driver = getDriver(browser);
        String currentTitle;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        WebElement linkText = driver.findElement(By.linkText("Portada"));
        System.out.println(linkText.getAttribute("href"));
        List<WebElement> pageHyperlink = driver.findElements(By.partialLinkText("Página"));

        for (WebElement item :pageHyperlink)
        {
            System.out.println(pageHyperlink);
        }
        List<WebElement> pageButtons = driver.findElements(By.tagName("button"));
        for (WebElement item :pageButtons)
        {
            System.out.println(pageButtons);
        }
        driver.quit();
    }
}
