package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise18 {
  public static void main(String[] args) throws InterruptedException, NullPointerException {
    // Define which browser to use
    //String browser = "firefox";
    String browser = "chrome";

    // Get correct driver for desire browser
    WebDriver myDriver = WebDriverFactory.getDriver(browser);
    myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    myDriver.get("https://www.amazon.com.mx");
    myDriver.findElement(By.xpath("//a[contains(text(),'Promociones')]")).click();
    myDriver.findElement(By.xpath("//span[contains(text(), 'Accesorios electrónicos')]/preceding::input[@type='checkbox']")).click();
    myDriver.findElement(By.xpath("//span[contains(text(), 'Ofertas destacadas')]/preceding::input[@type='checkbox'][1]")).click();
    myDriver.findElement(By.cssSelector("[aria-label='4 estrellas o más']")).click();
    myDriver.findElement(By.cssSelector("[value='BY_PRICE_ASCENDING']")).click();
    WebElement myElement = myDriver.findElement(By.cssSelector("[class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
    System.out.println(myElement.getText());
    // Wait some seconds

    // Quit web driver
    myDriver.close();
    myDriver.quit();
  }
}

