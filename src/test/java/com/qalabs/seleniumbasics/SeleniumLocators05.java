package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumLocators05 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.amazon.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement myElement = testDriver.findElement(By.id("searchDropDown"));

        Select myDropDown = new Select(testDriver.findElement(By.id("searchDropdownBox")));

        for(WebElement elemento: myDropDown.getOptions()) {
            System.out.println("Options: " + elemento.getText());
        }

        System.out.println("Es Multiple: " + myDropDown.isMultiple());
        System.out.println("First: " + myDropDown.getFirstSelectedOption());
        myDropDown.selectByIndex(0);
        System.out.println("Index 0: " + myDropDown.toString());
       // System.out.println("Auto: " + myDropDown.AUTO);


        testDriver.close();
        testDriver.quit();
    }
}
