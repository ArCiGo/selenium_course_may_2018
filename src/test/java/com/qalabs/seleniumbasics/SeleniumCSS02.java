package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumCSS02 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.manage().window().maximize();
        testDriver.get("https://www.espn.com.mx/");

        List<WebElement> myElements =  testDriver.findElements(By.cssSelector(".cscore--final"));

        WebElement myElemento;
        WebElement myElementoBis;
        int i = 1;
        String liga;

        for (WebElement elemento : myElements ) {
            liga = testDriver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])["+ i +"]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");
            if (elemento.getAttribute("class").contains("cscore--away-winner")) {
                myElemento = elemento.findElement(By.cssSelector(".cscore_item--away"));
                myElementoBis = myElemento.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(liga + " - Ganó visitante: " + myElementoBis.getAttribute("innerHTML"));
            } else if (elemento.getAttribute("class").contains("cscore--home-winner")) {
                myElemento = elemento.findElement(By.cssSelector(".cscore_item--home"));
                myElementoBis = myElemento.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println(liga + " - Ganó local: " + myElementoBis.getAttribute("innerHTML"));
            }
            System.out.println(i);
            i++;
        }
        // Wait some seconds

        // Quit web driver
        testDriver.close();
        testDriver.quit();
    }
}