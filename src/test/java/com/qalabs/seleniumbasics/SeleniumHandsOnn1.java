package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOnn1 {
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

        //Select hyperlink 'Promociones'
        WebElement promociones = myDriver.findElement(By.xpath("//a[text()='Promociones']"));
        promociones.click();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select Departamento -> Accesorios electronicos
        WebElement accesorios = myDriver.findElement(By.xpath("//span[@class='a-label a-checkbox-label']" +
            "[contains(text(),'Accesorios electrónicos')]"));
        accesorios.click();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select Tipos de promocion -> Ofertas destacadas
        WebElement ofertas = myDriver.findElement(By.xpath("//span[@class='a-label a-checkbox-label']" +
                "[contains(text(),'Ofertas destacadas')]"));
        ofertas.click();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select product with 4 or more stars
        WebElement stars = myDriver.findElement(By.xpath("//div[@data-value=4]/span[text()='o más']"));
        stars.click();

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Cualquier elemento con type = submit y class = nav-input
        WebElement select = myDriver.findElement(By.xpath("//select[@name='sortOptions']"));
        Select mySelect = new Select(select);
        mySelect.selectByValue("BY_PRICE_ASCENDING");

        WebElement producto = myDriver.findElement(By.xpath("//div[@id='101_dealView_0']" +
                "//a[@id='dealTitle']/span"));
        WebElement precio = myDriver.findElement(By.xpath("//div[@id='101_dealView_0']" +
                "//span[@class='a-size-medium inlineBlock unitLineHeight dealPriceText']"));
        System.out.println("El producto con menor precio es: " + producto.getText() +
                "\nPrecio: " + precio.getText());

        myDriver.close();
        myDriver.quit();
    }
}
