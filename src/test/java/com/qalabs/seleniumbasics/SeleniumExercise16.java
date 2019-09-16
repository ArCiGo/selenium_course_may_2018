package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumExercise16 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.amazon.com.mx") : "Pagina equivocada";

        //Primer elemnento hijo de body
        WebElement firstChildBody = myDriver.findElement(By.xpath("//body/child::*[1]"));
        System.out.println(firstChildBody.getAttribute("tagName") +
                " con id = " + firstChildBody.getAttribute("id"));

        //Ultimo elemento hijo de body
        WebElement lastChildBody = myDriver.findElement(By.xpath("//body/child::*[last()]"));
        System.out.println(lastChildBody.getAttribute("tagName") +
                " con clase = " + lastChildBody.getAttribute("className"));

        //Cualquier elemento con atributo role = navigator
        WebElement attrRoleNav = myDriver.findElement(By.xpath("//*[@role = 'navigation']"));
        System.out.println(attrRoleNav.getAttribute("tagName") +
                " con role = " + attrRoleNav.getAttribute("role"));

        //Cualquier elemento contenga classe = nav
        WebElement classNav = myDriver.findElement(By.xpath("//*[@class = contains(@class, 'nav')]"));
        System.out.println(classNav.getAttribute("tagName") +
                " con clase = " + classNav.getAttribute("className"));

        //Cualquier elemento con type = submit y class = nav-input
        WebElement inputNav = myDriver.findElement(By.xpath("//*[@type = 'submit' and @class = 'nav-input']"));
        System.out.println(inputNav.getAttribute("type") +
                " con clase = " + inputNav.getAttribute("className"));

        myDriver.close();
        myDriver.quit();
    }
}
