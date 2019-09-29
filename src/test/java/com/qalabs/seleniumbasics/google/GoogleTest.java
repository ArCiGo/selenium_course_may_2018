package com.qalabs.seleniumbasics.google;

import com.qalabs.javabasics.google.components.ResultItem;
import com.qalabs.javabasics.google.pages.BasePage;
import com.qalabs.javabasics.google.pages.GoogleMainPage;
import com.qalabs.javabasics.google.pages.GoogleResultPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BasePage {
    private GoogleMainPage google;
    private GoogleResultPage resultsPage;
    private ResultItem resultItem;

    public GoogleTest(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }

    @Test (description = "Search something in google", dependsOnMethods = {"openGoogle"})
    public void searchInGoogle() {
        // Add Code
        this.google.searchInGoogle("Selenium");
        Assert.assertNotNull(this.resultsPage.getResults());
    }

    @Test (description = "Search something again", dependsOnMethods = {"searchInGoogle"})
    public void performNewSearch() {
        // Add Code
        this.resultsPage.search("Webdriver");
        Assert.assertNotNull(this.resultsPage.getResults());
    }

    @Test (description = "Click next button", dependsOnMethods = {"performNewSearch"})
    public void clickNextResults() {
        // Add Code
        this.resultsPage.nextResultPage();
        Assert.assertTrue(resultsPage.isLoaded());
    }

    @Test (description = "Click prev button", dependsOnMethods = {"clickNextResults"})
    public void clickPrevResults() {
        // Add Code
        this.resultsPage.prevResultPage();
        Assert.assertTrue(resultsPage.isLoaded());
    }

    @Test (description = "Select first result found", dependsOnMethods = {"clickPrevResults"})
    public void selectFirstResult() {
        // Add Code
        Assert.assertNotNull(this.resultItem.getTitle());
    }
}