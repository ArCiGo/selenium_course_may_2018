package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HandsOn1 {

    public static void main(String[] args) throws NullPointerException {
        String browser = "chrome";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.navigate().to("https://www.amazon.com.mx/");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement promoElement = myDriver.findElement(By.cssSelector("a[href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));
        promoElement.click();

        WebElement deptoElectrCheckBox = myDriver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input"));
        deptoElectrCheckBox.click();

        WebElement checkPromoDest = myDriver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[2]/span[3]/div/label/input"));
        checkPromoDest.click();

        WebElement startMoreFour = myDriver.findElement(By.xpath("//*[@id=\"widgetFilters\"]/div[6]/span/a[1]/div/i"));
        startMoreFour.click();

        WebElement searchDropdownElement = myDriver.findElement(By.xpath("//select[@name='sortOptions']"));
        Select dropdownElement = new Select(searchDropdownElement);
        dropdownElement.selectByValue("BY_PRICE_ASCENDING");

        WebElement firstElement = myDriver.findElement(By.xpath("//div[@id='101_dealView_0']/descendant::div[@class='a-row a-spacing-mini'][3]/div/span"));
        System.out.println("The lower price is: " + firstElement.getText());

        myDriver.close();
        myDriver.quit();
    }
}
