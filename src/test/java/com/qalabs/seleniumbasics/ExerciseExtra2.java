package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExerciseExtra2 {
    public static void main(String[] args) throws NullPointerException, InterruptedException {
        String browser = "chrome";
        String url="https://www.espn.com.mx/";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().window().maximize();
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions action = new Actions(myDriver);
        WebElement myElement = myDriver.findElement(By.xpath("//*[@id='global-nav']/ul/li[1]/a/span/span[1]"));
        action.moveToElement(myElement).perform();
        myElement = myDriver.findElement(By.xpath("//*[@id='global-nav']/ul/li[1]/div/ul[1]/li[2]/a"));
        Thread.sleep(5000);
        action.moveToElement(myElement).click().build().perform();
        myElement = myDriver.findElement(By.xpath("//*[@id='scoreboard-page']/header/div[1]"));
        Thread.sleep(5000);
        action.moveToElement(myElement).click().build().perform();
        myElement.getText();
        List<WebElement> resFutTodo = myDriver.findElements(By.xpath("//*[@id='events']"));
        for (WebElement item : resFutTodo) {
            System.out.println("Nombre de la liga: \n " + item.getText());
        }
        myDriver.close();
    }
}
