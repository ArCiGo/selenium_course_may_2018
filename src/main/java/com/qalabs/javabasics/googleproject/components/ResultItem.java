package com.qalabs.javabasics.googleproject.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultItem extends BaseElement {

  public ResultItem(WebElement rootElement) {
    super(rootElement);
  }

  private WebElement title() {
    return this.root.findElement(By.xpath("//h3[@class='r']"));
  }

  private String description() {
    return this.root.getText();
  }

  public String getTitle() {
    return this.title().getText();
  }

  public void clickOnTitle() {
    this.title().click();
  }

  public String getDescription() {
    return this.description();
  }

  public void click() {
    this.root.click();
  }

  @Override
  public String toString() {
    return String.format("%s\n", this.getDescription());
  }
}