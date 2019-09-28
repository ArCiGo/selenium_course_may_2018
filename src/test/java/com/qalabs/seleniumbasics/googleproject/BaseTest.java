package com.qalabs.seleniumbasics.googleproject;

import com.qalabs.javabasics.googleproject.page.BasePage;
import org.openqa.selenium.WebDriver;

public class BaseTest extends BasePage {
    public BaseTest(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
    }
}