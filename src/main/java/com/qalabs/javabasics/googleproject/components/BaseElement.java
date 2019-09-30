package google.elements;

import org.openqa.selenium.WebElement;

public class BaseElement {

    protected WebElement rootElement;

    public BaseElement(WebElement rootElement) {
        this.rootElement = rootElement;
    }
}