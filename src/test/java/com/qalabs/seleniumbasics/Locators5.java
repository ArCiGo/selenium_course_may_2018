package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


    public class Locators5 {
        public static void main(String[] args) throws InterruptedException, NullPointerException {
            // Define which browser to use
            String browser = "firefox";
            String url = "https://www.amazon.com.mx/";

            // Get correct driver for desire browser
            WebDriver myDriver = WebDriverFactory.getDriver(browser);
            // get google home page
            myDriver.get(url);
            myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Find dropdown with ID "searchDropDown"

            WebElement searchDropdownBoxElement = myDriver.findElement(By.id("searchDropdownBox"));
            Select dropdownElement  = new Select(searchDropdownBoxElement);
            List<WebElement> options = dropdownElement.getOptions();

            for (WebElement item : options) {
                System.out.println("The list elements are: " + item.getText());
            }

            System.out.println("Is multiple?: " + dropdownElement.isMultiple());
            System.out.println("First selected option: " + dropdownElement.getFirstSelectedOption().getText());

            dropdownElement.selectByIndex(0);

            dropdownElement.selectByValue("Auto");


            myDriver.close();
            myDriver.quit();
        }
    }

