package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise14 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.amazon.com.mx") : "Pagina equivocada";

        WebElement myDropdown = myDriver.findElement(By.id("searchDropdownBox"));
        Select mySelect = new Select(myDropdown);

        List<WebElement> todasOpciones = mySelect.getAllSelectedOptions();
        for (WebElement opcion : todasOpciones) {
            System.out.println(opcion.getText());
        }
        System.out.println(mySelect.isMultiple());
        WebElement primeraOpcion = mySelect.getFirstSelectedOption();
        System.out.println(primeraOpcion.getText());
        mySelect.deselectByIndex(1);
        myDriver.navigate().to("https://www.amazon.com.mx");
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        mySelect.deselectByValue("Auto");

        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
