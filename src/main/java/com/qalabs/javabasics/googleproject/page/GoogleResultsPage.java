package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleResultsPage extends BasePage {

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//*[@aria-label='Buscar con Google']")
    private WebElement searchButton;

    @FindBy(how = How.XPATH, using = "//[@id='rso']//[@class='g']")
    private List<WebElement> results;

    @FindBy(how = How.ID, using = "pnnext")
    private WebElement nextButton;

    @FindBy(how = How.ID, using = "pnprev")
    private WebElement prevButton;

    public GoogleResultsPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public GoogleResultsPage search(String searchTxt){
        // Add Code
        WebElement searchBox = driver.findElement(By.name("q"));
        searchButton.equals(searchTxt);
        searchTxt.contains(searchTxt);
        System.out.println("Estan en google" + searchBox + "tu palabra es: " + searchTxt);

        boolean testValue = searchTxt.equals(this.prevButton.getAttribute("q"));
        System.out.println("El valor de la prueba es " + testValue + "y es igual a " + searchBox);

        return null;
    }

    public void currentSearch() throws InterruptedException {
        // Add Code
        WebElement searchButton = driver.findElement(By.xpath("//*[@aria-label='Buscar con Google'"));
        currentSearch();
        System.out.println(baseUrl);

    }

    public void getResults() throws  InterruptedException{
        // Add Code
        List<WebElement> results = driver.findElements(By.xpath("//[@id='rso']//[@class='g']"));
        results.equals(searchButton);
        results.size();
    }

    public void nextResultPage() {
        // Add Codes
        WebElement ntxResult = driver.findElement(By.id(prevButton.getAttribute("pnnext")));

        ntxResult.equals(ntxResult);
    }

    public void prevResultPage() {
        // Add Code
        WebElement prvResult = driver.findElement(By.id(prevButton.getAttribute("pnprev")));
        prvResult.equals(prvResult);
    }
}
