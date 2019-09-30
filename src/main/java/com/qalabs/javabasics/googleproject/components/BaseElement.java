package com.qalabs.javabasics.googleproject.components;

import org.openqa.selenium.WebElement;

public class BaseElement {
  protected WebElement root;

  public  BaseElement(WebElement root) {
    this.root = root;
  }
}
