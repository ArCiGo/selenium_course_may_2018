package com.qalabs.javabasics.googleproject.page;

import com.qalabs.javabasics.googleproject.components.ResultItem;
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

    @FindBy(how = How.XPATH, using = "//*[@id='rso']//*[@class='g']")
    private List<WebElement> results;

    @FindBy(how = How.ID, using = "pnnext")
    private WebElement nextButton;

    @FindBy(how = How.ID, using = "pnprev")
    private WebElement prevButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;

    public GoogleResultsPage(WebDriver driver) {
        super(driver, driver.getCurrentUrl());
    }

    public GoogleResultsPage search(String searchTxt) {
        this.searchBox.clear();
        this.searchBox.sendKeys(searchTxt);
        this.searchButton.click();
        return new GoogleResultsPage(this.driver);
    }

    public String currentSearch() {
        return this.searchBox.getText();
    }

    public List<ResultItem> getResults() {

        return this.results;
    }

    public void nextResultPage() {

        this.nextButton().click;
    }

    public void prevResultPage() {

        this.prevButton().click;
    }

    @Override
    public boolean isLoaded() {
        if (this.doodle.isDisplayed()) {
            return (true);
        } else {
            return (false);
        }
    /* hay que revisar esto más a detalle
    BasePage myBase = new BasePage();
    try{
      WebDriverWait wait= new  WebDriverWait(driver, 10);
      wait.until(ExceptionConditions.VisibilityOf(double));
      myBase.logger.info("Google main page loaded");
      return true;
    }catch(RuntimeException exception){
      myBase.logger.error("Google main page was not load;"+ exception);
      return false;
  }*/
    }
}