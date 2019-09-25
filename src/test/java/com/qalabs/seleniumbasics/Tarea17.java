package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Tarea17 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement promocionesLinkElement = driver.findElement(By.cssSelector("a[href=\"/gp/goldbox?ref_=nav_cs_gb\"]"));
        wait.until(ExpectedConditions.visibilityOf(promocionesLinkElement));
        promocionesLinkElement.click();

        WebElement accesoriosElectronicosChkElement = driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Accesorios electrónicos')]"));
        wait.until(ExpectedConditions.visibilityOf(accesoriosElectronicosChkElement));
        accesoriosElectronicosChkElement.click();

        WebElement ofertasDestacadasChkElement = driver.findElement(By.xpath("//span[@class='a-label a-checkbox-label'][contains(text(),'Ofertas destacadas')]"));
        wait.until(ExpectedConditions.visibilityOf(ofertasDestacadasChkElement));
        ofertasDestacadasChkElement.click();

        WebElement cuatroEstrellas = driver.findElement(By.xpath("//div[@data-value=4]/span[text()='o más']"));
        wait.until(ExpectedConditions.visibilityOf(cuatroEstrellas));
        cuatroEstrellas.click();

        WebElement searchDropdownElement = driver.findElement(By.xpath("//select[@name='sortOptions']"));
        wait.until(ExpectedConditions.visibilityOf(searchDropdownElement));
        Select dropdownElement = new Select(searchDropdownElement);
        dropdownElement.selectByValue("BY_PRICE_ASCENDING");

        WebElement firstElementText = driver.findElement(By.xpath("//div[@id='101_dealView_0']//a[@id='dealTitle']/span"));
        wait.until(ExpectedConditions.visibilityOf(firstElementText));

        WebElement firstElementPrice  = driver.findElement(By.xpath("//div[@id='101_dealView_0']/descendant::div[@class='a-row a-spacing-mini'][3]/div/span"));
        wait.until(ExpectedConditions.visibilityOf(firstElementPrice));

        System.out.println("Producto: " + firstElementText.getText() + ". Precio: " + firstElementPrice.getText());

        driver.close();
        driver.quit();
    }
}
