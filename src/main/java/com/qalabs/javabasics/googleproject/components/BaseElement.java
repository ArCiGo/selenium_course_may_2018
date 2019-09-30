package com.qalabs.javabasics.googleproject.components;

import org.openqa.selenium.WebElement;

public class BaseElement  {

    protected WebElement rootElement;

    public BaseElement(WebElement rootElement) {
        this.rootElement = rootElement;
    }
}
