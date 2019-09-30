package com.qalabs.javabasics.googleproject.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

<<<<<<< HEAD
public class ResultItem extends google.elements.BaseElement {

    public ResultItem(WebElement rootElement) {
=======
public class ResultItem extends BaseElement {

    public ResultItem(WebElement rootElement) {

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
        super(rootElement);
    }

    private WebElement title() {
        return this.rootElement.findElement(By.xpath("//h3[@class='r']"));
    }

    private String description() {
        return this.rootElement.getText();
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
        this.rootElement.click();
    }

    @Override
    public String toString() {
        return String.format("%s\n", this.getDescription());
    }
}
<<<<<<< HEAD

=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
