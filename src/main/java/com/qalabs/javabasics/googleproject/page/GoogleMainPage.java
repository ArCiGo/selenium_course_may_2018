package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
        PageFactory.initElements(driver, this);
    }

    public GoogleResultsPage searchInGoogle(String seacrhTxt) {
        searchBox.sendKeys(seacrhTxt);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInGoogleButton.click();
        return new GoogleResultsPage(driver);
    }

    public GoogleResultsPage searchInGoogleFeelingLucky(String seacrhTxt) {
        searchBox.sendKeys(seacrhTxt);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        feelingLuckyButton.click();
        return new GoogleResultsPage(driver);
    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(doodle));
            return true;
        } catch(RuntimeException exception) {
            return false;
        }
    }
}