package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumExercise9 {
  public static int totales = 0;
  public static List<WebElement> myList;
  public static WebElement myElement;
  public static WebDriver myDriver;
  public static String searchTerm;
  public static String link;
  public static String currentLink;

  public static void main(String[] args) throws InterruptedException, NullPointerException {
    //SeleniumExercise9 s9 = new SeleniumExercise9();

    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    myDriver = WebDriverFactory.getDriver(browser);

    myDriver.get("https://www.wikipedia.org");
    Thread.sleep(2000);
    myElement = myDriver.findElement(By.id("searchInput"));
    searchTerm = "Selenium";
    myElement.sendKeys(searchTerm);
    myElement.submit();

    System.out.println(myDriver.getCurrentUrl() + " "+ searchTerm + "-" + getPTag());
    getATag();
    System.out.println(myDriver.getCurrentUrl() + " "+ searchTerm + "-" + getPTag());
    getATag();
    System.out.println(myDriver.getCurrentUrl() + " "+ searchTerm + "-" + getPTag());
    getATag();
    System.out.println(myDriver.getCurrentUrl() + " "+ searchTerm + "-" + getPTag());
    getATag();
    System.out.println(myDriver.getCurrentUrl() + " "+ searchTerm + "-" + getPTag());

        // Wait some seconds
        Thread.sleep(5000);

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
  public static int getPTag() {
    myList = myDriver.findElements(By.tagName("p"));
    totales = 0;
    for (WebElement pElement : myList) {
      if (pElement.getText().contains(searchTerm)) {
        totales++;
      }
    }
    return totales;
  }
  public static void getATag() {
    myList = myDriver.findElements(By.tagName("a"));
    for (WebElement aElement : myList) {
      if (aElement.getText().contains(searchTerm)) {
        link = aElement.getAttribute("href");
        currentLink = myDriver.getCurrentUrl() + "#";
        if (!(link.contains(currentLink))) {
          myDriver.navigate().to(link);
          return;
        }
      }
    }
  }
}
