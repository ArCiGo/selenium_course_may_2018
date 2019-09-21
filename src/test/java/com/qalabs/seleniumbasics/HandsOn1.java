package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandsOn1 {
    public static void main(String[] args) throws NullPointerException {
        String browser = "chrome";
        String url = "https://www.amazon.com.mx/";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().window().maximize();
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement myElement = myDriver.findElement(By.cssSelector("a[href='/gp/goldbox?ref_=nav_cs_gb']"));
        myElement.click();
        myElement = myDriver.findElement(By.cssSelector("span[class='a-label a-checkbox-label']"));
        myElement.click();
        myElement = myDriver.findElement(By.xpath("//span[contains(text(),'Ofertas destacadas')]/preceding::input[@type='checkbox'][1]"));
        myElement.click();
        myElement = myDriver.findElement(By.cssSelector("i[class='a-icon a-icon-star a-star-4']"));
        myElement.click();
        myElement = myDriver.findElement(By.xpath("//select[@name='sortOptions']"));
        Select dropdownElement = new Select(myElement);
        dropdownElement.selectByValue("BY_PRICE_ASCENDING");
        myElement = myDriver.findElement(By.cssSelector("span[class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
        System.out.println("The lower price is: " + myElement.getText());
        myDriver.close();

    }
}
