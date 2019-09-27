package com.qalabs.javabasics.googleproject.components;

import com.qalabs.javabasics.googleproject.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultItem extends BasePage {
    public ResultItem(WebElement element) {
        super(element);
    }
    private WebElement title() {
        return this.root.findElement(By.xpath("//div[@class='r']/a/h3"));
    }

    public String getDescription() {
        return this.root.getText();
    }

    public String getTitle() {
        return this.title().getText();
    }

    public void click() {
        // Add Code
        // this.click();
    }
    @Override
    public String toString() {
        return String.format("%s\n", this.getDescription());
    }
}
