package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumCSS01 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.xpath("//a[contains(text(),'Promociones')]"));
        myElement.click();

        myElement = testDriver.findElement(By.xpath("//span[contains(text(),'Accesorios electrónicos')]/preceding::input[@type='checkbox']"));
        myElement.click();

        myElement = testDriver.findElement(By.xpath("//span[contains(text(),'Ofertas destacadas')]/preceding::input[@type='checkbox']"));
        myElement.click();

       // testDriver.close();

       // testDriver.quit();
    }
}
