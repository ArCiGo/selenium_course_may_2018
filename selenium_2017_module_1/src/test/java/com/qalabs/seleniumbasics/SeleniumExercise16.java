package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise16 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.amazon.com.mx");
    List<WebElement> myElements = myDriver.findElements(By.xpath("//body/div[1]"));

    for (WebElement myElemento : myElements) {
      System.out.println(myElemento.getText());
    }

    myElements = myDriver.findElements(By.xpath("//body/div[last()]"));
    for (WebElement myElem : myElements) {
      System.out.println(myElem.getText());
    }

    myElements = myDriver.findElements(By.xpath("//*[@role='navigation']"));
    for (WebElement myElemento2 : myElements) {
      System.out.println(myElemento2.getText());
    }
    myElements = myDriver.findElements(By.xpath("//*[contains(@class, 'nav')]"));
    for (WebElement myElemento2 : myElements) {
      System.out.println(myElemento2.getText());
    }

    myElements = myDriver.findElements(By.xpath("//*[@type ='submit']"));
    for (WebElement myElemento2 : myElements) {
      System.out.println(myElemento2.getText());
    }
    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}