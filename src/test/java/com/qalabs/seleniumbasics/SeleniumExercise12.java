package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise12 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.nasa.gov/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement missionsHyperlinkElement = driver.findElement(By.linkText("Missions"));
        System.out.println("Missions href attribute" + missionsHyperlinkElement.getAttribute("href"));

        WebElement nasaTVHyperlinkElement = driver.findElement(By.linkText("NASA TV"));
        System.out.println("NASA TV href attribute" + nasaTVHyperlinkElement.getAttribute("href"));

        WebElement marsHyperlinkElement = driver.findElement(By.partialLinkText("Mars"));
        System.out.println("Mars href attribute" + marsHyperlinkElement.getAttribute("href"));

        WebElement anyInputElement = driver.findElement(By.tagName("input"));
        System.out.println("input id attribute" + anyInputElement.getAttribute("id"));

        driver.close();
        driver.quit();
    }
}
