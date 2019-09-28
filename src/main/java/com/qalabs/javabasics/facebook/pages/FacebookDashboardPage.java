package com.qalabs.javabasics.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDashboardPage extends BasePage {

    private WebDriverWait wait = new WebDriverWait(driver, 5);

    public FacebookDashboardPage(WebDriver driver) {
        super(driver);
    }
}
