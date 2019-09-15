package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ejercicio2 {
    public static WebDriver getDriver(String browser) throws InterruptedException {
        File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");
        if (browser.equals("firefox")) {
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
        String browser = "firefox";
        String curretnURL = "";
        String topic = "Selenium";
        int counter=0;
        WebDriver driver = getDriver(browser);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org");

        WebElement searchElement = driver.findElement(By.id("searchInput"));
        searchElement.sendKeys("Selenium");
        searchElement.submit();
        Thread.sleep(5000);
        curretnURL= driver.getCurrentUrl();

        List<WebElement> listp  = driver.findElements(By.tagName("p"));
        List<WebElement> listaa  = driver.findElements(By.tagName("a"));


        for (WebElement elememntp: listp){
            if(elememntp.getText().contains(topic)){
                counter++;

            }
        }
        for (WebElement elememnta : listaa){
            if(elememnta.getText().contains(topic)){
                counter++;
            }
        }

        System.out.println("En la pagina "+ curretnURL +" se buscaran los elementos relacionados con "+ topic);
        System.out.println("Se encontraron "+ counter + " Elementos");
        listaa.get(0).click();
        driver.quit();
    }
}
