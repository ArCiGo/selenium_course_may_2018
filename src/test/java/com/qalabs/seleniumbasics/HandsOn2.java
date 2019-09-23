package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2 {
    public static void main(String[] args) throws NullPointerException {
        String browser = "chrome";
        WebDriver myDriver;
        myDriver = WebDriverFactory.getDriver(browser);

        assert myDriver != null;
        myDriver.manage().window().maximize();
        myDriver.navigate().to("https://www.espn.com.mx/");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    List<WebElement> myElements =(List<WebElement>) myDriver.findElements(By.cssSelector(".cscore--final']"));
        WebElement myElemento;
        WebElement myElementos;
    int i = 1;
    String leage;
     for(WebElement myElement : myElements ) {
         leage = myDriver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])[" + i + "]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");
            if(myElement.getAttribute("class").contains("cscore--away-winner")){
                myElemento = myElement.findElement(By. cssSelector(".cscore_item--away"));
                myElementos = myElement.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println("The leage is: " + leage +":" + "\n---------------------------------------------------\n" + "The winner visit is: " + myElementos.getAttribute("innerHTML"));

            }else if(myElement.getAttribute("class").contains("cscore--home-winner")){
                myElement = myElement.findElement(By.cssSelector(".cscore_item--home"));
                myElementos = myElement.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                System.out.println("The leage is: " + leage +":" + "\n---------------------------------------------------\n" + "The winner local is: " + myElementos.getAttribute("innerHTML"));
            }
            System.out.println(i);
            i++;
        }

        myDriver.close();
        myDriver.quit();

    }
}
