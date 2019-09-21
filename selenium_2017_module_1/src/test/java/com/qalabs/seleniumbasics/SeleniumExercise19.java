package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise19 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.espn.com.mx/");
    List<WebElement> myElements = (List<WebElement>) myDriver.findElements(By.cssSelector(".cscore--final"));
    WebElement myElemento;
    WebElement myElementoBis;
    int i = 1;
    String liga;
    for (WebElement myElement : myElements ) {
      liga = myDriver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])["+ i +"]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");
      if (myElement.getAttribute("class").contains("cscore--away-winner")) {
        myElemento = myElement.findElement(By.cssSelector(".cscore_item--away"));
        myElementoBis = myElemento.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
        System.out.println(liga + " - Ganó visitante: " + myElementoBis.getAttribute("innerHTML"));
      } else if (myElement.getAttribute("class").contains("cscore--home-winner")) {
        myElemento = myElement.findElement(By.cssSelector(".cscore_item--home"));
        myElementoBis = myElemento.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
        System.out.println(liga + " - Ganó local: " + myElementoBis.getAttribute("innerHTML"));
      }
      System.out.println(i);
      i++;
    }
    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}
