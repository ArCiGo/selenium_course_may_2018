package com.qalabs.javabasics.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FacebookMainPage extends BasePage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;



    public FacebookMainPage(WebDriver driver) {
      // Falta definir la URL pero no la pongo porque no se si la vamos a traer de otro lado...

        super(driver, "facebook.com");
        //this.doodle.submit();
        BasePage myPage = BasePage();
        myPage.open();
    }
    public FacebookResultsPage searchInGoogle(String searchTxt){
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
        try{
            WebDriverWait wait= new  WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(doodle));
            myBase.logger.info("Google main page loaded");
            return true;
        }catch(RunttimeException exception){
            myBase.logger.error("Google main page was not load;"+ exception);
            return false;
        }
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