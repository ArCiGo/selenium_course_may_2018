package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

<<<<<<< HEAD
public class GoogleMainPage extends BasePage {

    public static final String BASE_URL = "https://www.google.com/";

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doddle;

    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement seacrhInGoogleButton;
=======
import java.util.concurrent.TimeUnit;

public class GoogleMainPage extends BasePage {
    public static final String BASE_URL = "https://www.google.com/";

    @FindBy(how = How.NAME, using = "q")
    private WebElement searchBox;

    @FindBy(how = How.NAME, using = "btnK")
    private WebElement searchInGoogleButton;

    @FindBy(how = How.NAME, using = "btnI")
    private WebElement feelingLuckyButton;

    @FindBy(how = How.ID, using = "hplogo")
    private WebElement doodle;
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b

    public GoogleMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public GoogleResultsPage searchInGoogle(String seacrhTxt) {
        searchBox.sendKeys(seacrhTxt);
<<<<<<< HEAD
        seacrhInGoogleButton.click();
=======
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchInGoogleButton.click();
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
        return new GoogleResultsPage(driver);
    }

    public GoogleResultsPage searchInGoogleFeelingLucky(String seacrhTxt) {
        searchBox.sendKeys(seacrhTxt);
<<<<<<< HEAD
=======
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
        feelingLuckyButton.click();
        return new GoogleResultsPage(driver);
    }

    @Override
    public boolean isLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
<<<<<<< HEAD
            wait.until(ExpectedConditions.visibilityOf(doddle));
=======
            wait.until(ExpectedConditions.visibilityOf(doodle));
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
            return true;
        } catch(RuntimeException exception) {
            return false;
        }
    }
<<<<<<< HEAD

=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
}
