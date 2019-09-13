package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "Chrome";
        String url = "https://www.amazon.com.mx/";
        // Get correct driver for desire browser

        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        // Get google home page
        myDriver.get(url);
        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement myElementSelect = myDriver.findElement(By.id("searchDropdownBox"));
        Select drpDepartamenotos = new Select (myElementSelect);
        List<WebElement> lista = myDriver.findElements(By.id("searchDropdownBox"));
        for (WebElement option : lista) {
            System.out.println(option.getText());
        }
        Thread.sleep(5000);
        if(drpDepartamenotos.isMultiple()) {
            System.out.println("the dropdown is multiple");
        }

        System.out.println("\nFirst selected option is:");
        String selected= drpDepartamenotos.getFirstSelectedOption().getText();
        System.out.println(selected);
        myElementSelect.click();
        drpDepartamenotos.selectByVisibleText("Auto");
        drpDepartamenotos.selectByIndex(0);

       String valueToSelect= "Auto";
        List<WebElement> Options = drpDepartamenotos.getOptions();
        for(WebElement option1 :Options){
            if(option1.getText().equals(valueToSelect)) {
                option1.click();
               //System.out.println("\n click in option Auto");
            }
        }
        Thread.sleep(5000);
     myDriver.close();
    }
}
