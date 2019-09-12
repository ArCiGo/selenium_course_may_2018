package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locators4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // get google home page
        myDriver.navigate().to("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement myElement = myDriver.findElement(By.linkText("Portada"));
        System.out.println("\nPortada: " + myElement.getAttribute("href"));

        List<WebElement> listaLinks = myDriver.findElements(By.partialLinkText("Página"));
        for (WebElement item : listaLinks){
            System.out.println("\nThe page links: " + item.getAttribute("href"));
        }

        List<WebElement> buttonElements = myDriver.findElements(By.tagName("button"));
        for(WebElement button: buttonElements) {
            System.out.println("\nThe buttons text are: " + button.getAttribute("title"));
        }
        myDriver.close();
        myDriver.quit();
    }

}




