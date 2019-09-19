package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise16 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement firstDivChildElement = driver.findElement(By.xpath("/html/body/div[1]"));
        System.out.println("First <div> of <body>: " + firstDivChildElement.getAttribute("id"));

        WebElement lastDivChildElement = driver.findElement(By.xpath("/html/body/div[last()]"));
        System.out.println("Last <div> of <body>: " + lastDivChildElement.getAttribute("id"));

        List<WebElement> anyRoleNavigationElements = driver.findElements(By.xpath("//*[@role='navigation']"));
        System.out.println("Number of elements: " + anyRoleNavigationElements.size());

        for (WebElement item : anyRoleNavigationElements) {
            System.out.println("Any element with @role = 'navigation': "+ item.getAttribute("role"));
        }

        List<WebElement> anyNavUnderClassElements = driver.findElements(By.xpath("//*[contains(@class, 'nav')]"));
        System.out.println("Number of elements: " + anyNavUnderClassElements.size());

        for (WebElement item : anyNavUnderClassElements) {
            System.out.println("Any element with 'nav' under @class attribute: "+ item.getAttribute("class"));
        }

        List<WebElement> anySubmitNavInputElements = driver.findElements(By.xpath("//*[@type = 'submit' and @class = 'nav-input']"));
        System.out.println("Number of elements: " + anySubmitNavInputElements.size());

        for (WebElement item : anySubmitNavInputElements) {
            System.out.println("@type: " + item.getAttribute("type") + ". @class: " + item.getAttribute("class"));
        }

        driver.close();
        driver.quit();
    }
}
