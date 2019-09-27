package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected String baseUrl;
    //protected final Logger logger = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        //logger.info("Getting url: " + this.baseUrl);
        this.driver.get(this.baseUrl);
        //logger.info("Got: " + this.driver.getCurrentUrl());
    }

    public void isLoaded() {
        //logger.info(this.getClass().toString() + "is loaded");
        return true;
    }

    public void close() {
        //logger.info("Closing " + this.getClass().toString());
        this.driver.close();
        //logger.info(this.getClass().toString() + " closed");
    }

}
