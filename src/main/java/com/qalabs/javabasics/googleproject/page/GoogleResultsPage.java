package com.qalabs.javabasics.googleproject.page;

import com.qalabs.javabasics.googleproject.components.ResultItem;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class GoogleResultsPage  extends BasePage{
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
        super (driver, driver.getCurrentUrl());
    }

    public GoogleResultsPage search(String searchTxt) {
        // Add Code
    }

    public  String currentSearch() {
        // Add Code
    }

    public List<ResultItem> getResults(){
        // Add Code
    }

    public void nextResultPage(){
        // Add Code
    }

    public void prevResultPage(){
        // Add Code
    }

    @Override
    public boolean isLoaded(){
        // Add Code
    }
}
