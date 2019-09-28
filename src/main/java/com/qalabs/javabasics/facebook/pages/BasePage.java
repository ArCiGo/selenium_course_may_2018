package com.qalabs.javabasics.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage implements Page {

    protected WebDriver driver;
    //protected String baseURL;

    public BasePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public void open() {
        //this.driver.get(this.baseURL);
        return;
    }

    public boolean isLoaded() {
        return true;
    }

    public void close() {
        this.driver.close();
        this.driver.quit();
    }
}
