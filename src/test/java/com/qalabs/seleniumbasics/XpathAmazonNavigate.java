package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathAmazonNavigate {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.navigate().to("https://www.amazon.com.mx/");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> bodyElements = myDriver.findElements(By.xpath("(//*[div])[1]"));

        for (WebElement item : bodyElements) {
            System.out.println("First child div Body Element: " + item.getAttribute("firstChild"));
        }

        List<WebElement> bodyLastChildEl = myDriver.findElements(By.xpath("(//*[div])[last()]"));
         for(WebElement item: bodyLastChildEl){
             System.out.println("Last child div Body element: " + item.getAttribute("lastChild"));
         }

         WebElement selectAnyElementNav = myDriver.findElement(By.xpath("//*[@id='navbar']"));
         selectAnyElementNav.getAttribute("role").equals("navigate");
         System.out.println("El elemento a igual a la  navegacion " + selectAnyElementNav.getAttribute("role").equals("navigation"));

         WebElement selectAnyElementContains = myDriver.findElement(By.xpath("//*[contains(@class,'nav-a')]"));
         selectAnyElementContains.click();
         selectAnyElementContains.getAttribute("nav-a");
         System.out.println("El atributo de navegación de esta clase es: " + selectAnyElementContains.getAttribute("nav-a"));

         WebElement selectAnyElementSubmit = myDriver.findElement(By.xpath("//input[@type='submit']"));
         selectAnyElementSubmit.equals("submit");
         selectAnyElementSubmit.click();
         System.out.println("Este es el botón input de navegacion igual al submit: " + selectAnyElementSubmit.equals("submit"));

         WebElement selectAnyElementSubClass = myDriver.findElement(By.xpath("//*[@class='nav-input']"));
         selectAnyElementSubClass.equals("nav-input");
         selectAnyElementSubClass.click();
         System.out.println("Este es el botón input de navegacion igual a la clase nav-input: " + selectAnyElementSubClass.equals("nav-input"));




//        new Select(selectAnyElementNav).equals("a");
//
//        Select anyElement  = new Select(selectAnyElementNav);
//        List<WebElement> att = anyElement.getOptions();
//
//        for (WebElement item : att) {
//            System.out.println("Any element equals to navigate: " + item.getAttribute("href"));
//        }
//
//        WebElement selectAnyElementNav1 = myDriver.findElement(By.xpath("/html/body//div//class//a/@href"));
//        Select anyElement1  = new Select(selectAnyElementNav1);
//        List<WebElement> att1 = anyElement1.getOptions();
//
//        for (WebElement item : att1) {
//            System.out.println("Any element equals to navigate: " + item.getAttribute("href"));
//        }
//
//        WebElement selectAttEqualsSubmit = myDriver.findElement(By.xpath("/html/body//div//submit/@href"));
//        Select anyElement2  = new Select(selectAttEqualsSubmit);
//        List<WebElement> att2 = anyElement2.getOptions();
//
//        for (WebElement item : att2) {
//            System.out.println("Any Select element equals to submit: " + item.getAttribute("submit"));
//            System.out.println("Any Select element equals to navigate: " + item.getAttribute("nav-input"));
//
//        }

        myDriver.close();
        myDriver.quit();
    }
}
