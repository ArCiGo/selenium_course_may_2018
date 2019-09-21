package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn3 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(myDriver, 5);

        // Get google home page
        myDriver.get("https://www.inaturalist.org");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.inaturalist.org") : "Pagina equivocada";

        Actions action = new Actions(myDriver);
        WebElement more = myDriver.findElement(By.cssSelector("#header-more-dropdown-toggle"));
        action.moveToElement(more).perform();

        WebElement lugares = myDriver.findElement(By.xpath("//a[text()='Lugares']"));
        lugares.click();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchInput = myDriver.findElement(By.cssSelector("#q"));
        searchInput.sendKeys("Colomos,Guadalajara");
        searchInput.submit();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement subcategory = myDriver.findElement(By.xpath("//a[text()='Insectos']"));
        wait.until(ExpectedConditions.visibilityOf(subcategory));
        subcategory.click();

        Thread.sleep(3000);
        List<WebElement> results = myDriver.findElements(By.xpath("//span[contains(@class,'Insecta')]/span[@class='comname ']"));
        wait.until(ExpectedConditions.visibilityOfAllElements(results));

        System.out.println("Resultados:");
        for (WebElement result : results) {
            System.out.println(result.getText());
        }

        myDriver.close();
        myDriver.quit();
    }

}
