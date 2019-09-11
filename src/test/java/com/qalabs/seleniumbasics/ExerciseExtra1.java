package com.qalabs.seleniumbasics;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExerciseExtra1 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        String url = "https://www.microsoft.com/es-mx/";
        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        assert myDriver.getCurrentUrl().equals(url) : "Pagina equivocada";
        WebElement myElement = myDriver.findElement(By.id("l1_support"));
        myElement.click();
        myElement = myDriver.findElement(By.id("Más-navigation"));
        myElement.click();
        myElement = myDriver.findElement(By.id("shellmenu_7"));
        myElement.click();
        WebElement myElement1 = myDriver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div/div[1]/div/div/a[2]"));
        boolean displayed;
        if (myElement1.isDisplayed()) {
            displayed = true;
        } else displayed = false;
        //if (displayed != true) throw new AssertionError("the element is enabled");
        Assert.assertTrue("the element is enabled ", displayed!=true);
        myElement1.click();
        Thread.sleep(5000);
        myDriver.close();
    }


}
