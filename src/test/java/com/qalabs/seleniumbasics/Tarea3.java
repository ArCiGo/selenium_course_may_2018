package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Tarea3 {
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
        String currentTitle;
        WebDriver driver = getDriver(browser);
        driver.navigate().to("https://www.google.com.mx");
        Thread.sleep(3000);
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);
        curretUrl="";


        driver.navigate().to("https://es-la.facebook.com");
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);
        Thread.sleep(3000);
        curretUrl="";

        driver.navigate().to("https://www.espn.com.mx");
        curretUrl=driver.getCurrentUrl();
        System.out.println(curretUrl);
        Thread.sleep(2000);
        curretUrl="";


        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);
        Thread.sleep(2000);
        curretUrl="";

        driver.navigate().forward();
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);
        Thread.sleep(2000);
        curretUrl="";

        driver.navigate().refresh();
        curretUrl= driver.getCurrentUrl();
        System.out.println(curretUrl);
        driver.quit();
}
}
