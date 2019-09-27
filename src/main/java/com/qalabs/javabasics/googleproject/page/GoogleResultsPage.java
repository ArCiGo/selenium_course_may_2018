package com.qalabs.javabasics.googleproject.page;

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
        super(driver, "");
        BasePage myPage = new BasePage() {
            @Override
            public void open() {
                super.open();
            }
        };
        myPage.open();

    }

    public GoogleResultsPage search(String searchTxt){
        // Add Code
        this.searchBox.sendKeys(searchTxt);
        this.searchButton.click();
        return null;
    }

    public void CurrentSearch(String SearchTxt) {
        // Add Code
        this.results.contains(SearchTxt);
        return;
    }

    public void getResults(){
        // Add Code
        this.results.contains(searchButton);
        return;
    }

    public void nextResultPage() {
        // Add Codes
        this.nextButton.click();
        return;
    }

    public void prevResultPage() {
        // Add Code
        this.prevResultPage();
        return;
    }
}
