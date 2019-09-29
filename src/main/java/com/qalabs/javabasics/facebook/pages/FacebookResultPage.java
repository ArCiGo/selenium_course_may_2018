package com.qalabs.javabasics.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FacebookResultPage extends BasePage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;

    public FacebookResultPage(WebDriver driver) {
        super(driver, "https://google.com.mx"); // Falta definir la URL pero no la pongo porque no se si la vamos a traer de otro lado...

    /* Esto lo comento por que no se si realmente lo vamos a necesitar -- Maurer
    BasePage myPage = new BasePage();
    myPage.open();
    */
    }
    public GoogleResultsPage searchInGoogle(String searchTxt){
        this.searchBox.clear();
        this.searchBox.sendKeys(searchTxt);
        this.searchInGoogleButton.click();
        return new GoogleResultsPage(this.driver);
    }
    public GoogleResultsPage feelingLuckySearch(String searchTxt){
        this.searchBox.clear();
        this.searchBox.sendKeys(searchTxt);
        this.feelingLuckyButton.click();
        return new GoogleResultsPage(this.driver);
    }

    @Override
    public boolean isLoaded(){
        if (this.doodle.isDisplayed()) {
            return(true);
        } else {
            return(false);
        }

    /*
    // hay que revisar esto más a detalle
    BasePage myBase = new BasePage();
    try{
      WebDriverWait wait= new  WebDriverWait(driver, 10);
      wait.until(ExceptionConditions.VisibilityOf(double));
      myBase.logger.info("Google main page loaded");
      return true;
    }catch(RuntimeException exception){
      myBase.logger.error("Google main page was not load;"+ exception);
      return false;
    } */
    }

}
