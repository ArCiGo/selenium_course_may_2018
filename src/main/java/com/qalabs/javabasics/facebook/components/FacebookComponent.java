package com.qalabs.javabasics.facebook.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookComponent {

    protected WebDriver driver;

    public FacebookComponent(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(this.driver, this);
    }
}
