package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMainPage extends BasePage implements Page{
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
        this.doodle.submit();
    }
    public GoogleResultsPage searchInGoogle(String searchTxt){
        // Add Code
        this.doodle.sendKeys("Selenium", searchTxt);
        return null;
    }
    public GoogleResultsPage feelingLuckySearch(String searchTxt){
        // Add Code
        searchTxt.contains(searchTxt);
        return null;
    }

    @Override
    public boolean isLoaded(){
        // Add Code
        this.doodle.equals(searchInGoogleButton);
        isLoaded();
        return false;
    }
}
