package com.qalabs.seleniumbasics.googleproject;

import com.qalabs.javabasics.googleproject.page.GoogleMainPage;
import com.qalabs.javabasics.googleproject.page.GoogleResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleExampleTest extends BaseTest {


    @Test(alwaysRun = true, priority = 0)
    public void validateGoogleURL() {
        this.driver.get(GoogleMainPage.BASE_URL);

        GoogleMainPage home = new GoogleMainPage(this.driver);

        Assert.assertEquals(this.driver.getCurrentUrl(), GoogleMainPage.BASE_URL);

        Assert.assertTrue(home.isLoaded(), "Google page is not loaded");
    }

    @Test(alwaysRun = true, priority = 1)
    public void searchSomething() {
        GoogleMainPage home = new GoogleMainPage(this.driver);

        GoogleResultsPage resultsPage;
        resultsPage = home.searchInGoogle("Selenium");

        Assert.assertTrue(resultsPage.isLoaded(), "Google results page is not loaded");

        Assert.assertTrue(resultsPage.verifyResultByIndex(1, "Selenium"));
    }

    @Test(priority = 2, dependsOnMethods = {"searchSomething"})
    public void clickOnResultByTitle() throws InterruptedException {
        GoogleResultsPage resultsPage = new GoogleResultsPage(this.driver);
        resultsPage.clickOnResultByTitle("Selenium - Wikipedia, la enciclopedia libre");
        Assert.assertEquals(this.driver.getCurrentUrl(), "https://es.wikipedia.org/wiki/Selenium", "First result is wrong");
    }
}