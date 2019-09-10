package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchGoogle {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        //String url = "https://www.mozilla.org";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.get("https://www.google.com");

        // Get correct driver for desire browser
        assert testDriver.getCurrentUrl().equals("https://google.com.mx"): "El path no es el de Google";

        WebElement myElement =testDriver.findElement(By.className("gLFyf"));

        myElement.sendKeys("selenium");
        myElement.submit();

        Thread.sleep(5000);
        testDriver.close();

    }

}