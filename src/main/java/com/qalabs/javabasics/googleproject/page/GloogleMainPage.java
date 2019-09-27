package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMainPage extends BasePage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;

    public GoogleMainPage(WebDriver driver) {
        super(driver, "");
        //this.doodle.submit();
    }
    public GoogleResultsPage searchInGoogle(String searchTxt) {
        // Add Code
    }
    public GoogleResultsPage feelingLuckySearch(String searchTxt) {
        // Add Code
    }

    @Override
    public boolean isLoaded(){
        // Add Code
    }
}
