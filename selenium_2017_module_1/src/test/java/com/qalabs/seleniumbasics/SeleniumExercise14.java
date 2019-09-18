package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise14 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    String a = "hola";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    WebElement myElement = myDriver.findElement(By.linkText("Portada"));
    System.out.println(myElement.getAttribute("href"));
    List<WebElement> myElements = myDriver.findElements(By.partialLinkText("Página"));
    for (WebElement myEleme : myElements) {
      System.out.println(myEleme.getText());
    }
    for (WebElement myElem : myElements) {
      System.out.println(myElem.getAttribute("href"));
    }
    myElements = myDriver.findElements(By.tagName("button"));
    for (WebElement myEle : myElements) {
      System.out.println(myEle.getText());
    }

    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}