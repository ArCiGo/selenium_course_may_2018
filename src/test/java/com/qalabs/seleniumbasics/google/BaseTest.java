package com.qalabs.seleniumbasics.google;

import com.qalabs.javabasics.google.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class BaseTest extends BasePage {
    public BaseTest(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }
}
