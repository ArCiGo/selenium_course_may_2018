package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sample {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.espn.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> myElements = (List<WebElement>) driver.findElements(By.cssSelector(".cscore--final"));
        WebElement myElemento;
        WebElement myElementoBis;
        int i = 1;
        String liga;
        for (WebElement myElement : myElements ) {
            liga = driver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])["+ i +"]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");
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
        driver.close();
        driver.quit();
    }
}
