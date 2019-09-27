package com.qalabs.javabasics.googleproject.components;

import org.openqa.selenium.WebElement;

public class BaseElement {
    public class BaseElement {
        protected WebElement root;
        //protected final static Logger logger = Logger.getLogger(BaseElement.class);
        public  BaseElement(WebElement root) {
            this.root = root;
        }
}
