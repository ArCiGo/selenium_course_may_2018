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

        testDriver.findElement(By.xpath("//a[contains(text(),'Promociones')]")).click();
        testDriver.findElement(By.xpath("//span[contains(text(), 'Accesorios electrónicos')]/preceding::input[@type='checkbox']")).click();
        testDriver.findElement(By.xpath("//span[contains(text(), 'Ofertas destacadas')]/preceding::input[@type='checkbox'][1]")).click();
        testDriver.findElement(By.cssSelector("[aria-label='4 estrellas o más']")).click();
        testDriver.findElement(By.cssSelector("[value='BY_PRICE_ASCENDING']")).click();

        WebElement myElement = testDriver.findElement(By.cssSelector("[class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
        System.out.println(myElement.getText());

        testDriver.close();
        testDriver.quit();
    }
}
