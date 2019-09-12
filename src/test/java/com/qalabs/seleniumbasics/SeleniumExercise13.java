package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise13 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement portadaHyperlinkElement = driver.findElement(By.linkText("Portada"));
        System.out.println("Portada href: " + portadaHyperlinkElement.getAttribute("href"));

        List<WebElement> paginaHyperlinkElements = driver.findElements(By.partialLinkText("Página"));

        for (WebElement item : paginaHyperlinkElements) {
            System.out.println("página hrefs: " + item.getAttribute("href"));
        }

        List<WebElement> buttonElements = driver.findElements(By.tagName("button"));

        for (WebElement item : buttonElements) {
            System.out.println(item.getAttribute("button attribute: " + "title"));
        }

        driver.close();
        driver.quit();
    }
}
