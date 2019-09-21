package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise20 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.inaturalist.org/");
    myDriver.findElement(By.cssSelector("#header-more-dropdown-toggle")).click();
    myDriver.findElement(By.xpath("//a[contains(text(),'Places')]")).click();
    myDriver.findElement(By.xpath("//input[@name='q']")).sendKeys("Colomos, Guadalajara");
    myDriver.findElement(By.xpath("//input[@name='commit']")).click();
    List<WebElement> subCategories = myDriver.findElements(By.cssSelector(".taxon_links"));
    for (WebElement listCategories : subCategories) {
      System.out.println( listCategories.getText());
    }
    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}