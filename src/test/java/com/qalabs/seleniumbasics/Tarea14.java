package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tarea14 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchDropdownElement = driver.findElement(By.id("searchDropdownBox"));
        Select dropdownElement = new Select(searchDropdownElement);

        List<WebElement> options = dropdownElement.getOptions();

        for (WebElement item : options) {
            System.out.println(item.getText());
        }

        System.out.println("Is multiple?: " + dropdownElement.isMultiple());
        System.out.println("First selected option: " + dropdownElement.getFirstSelectedOption().getText());

        dropdownElement.selectByIndex(0);

        driver.close();
        driver.quit();
    }
}
