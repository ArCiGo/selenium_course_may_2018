package com.qalabs.javabasics.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMainPage extends BasePage {
    public static final String BASE_URL = "https://www.google.com/";
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;

    public GoogleMainPage(WebDriver driver) {
        super(driver);
        //super(driver, "https://google.com.mx");
        // BasePage myPage = new BasePage();
        // myPage.open();
    }

    public GoogleResultsPage searchInGoogle(String searchTxt) {
        this.searchBox.clear();
        this.searchBox.sendKeys(searchTxt);
        this.searchInGoogleButton.click();
        return new GoogleResultsPage(this.driver);
    }

    public GoogleResultsPage feelingLuckySearch(String searchTxt) {
        this.searchBox.clear();
        this.searchBox.sendKeys(searchTxt);
        this.feelingLuckyButton.click();
        return new GoogleResultsPage(this.driver);
    }

    @Override
    public boolean isLoaded() {
        if (this.doodle.isDisplayed()) {
            return (true);
        } else {
            return (false);
        }
        /*BasePage myBase = new BasePage();
        try{
            WebDriverWait wait= new  WebDriverWait(driver, 10);
            wait.until(ExceptionConditions.VisibilityOf(double));
            myBase.logger.info("Google main page loaded");
            return true;
        }catch(RuntimeException exception){
            myBase.logger.error("Google main page was not load;"+ exception);
            return false;
        }
    }*/
    }
}
