package com.qalabs.javabasics.googleproject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

  public GoogleMainPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public GoogleResultsPage searchInGoogle(String seacrhTxt) {
    searchBox.sendKeys(seacrhTxt);
    seacrhInGoogleButton.click();
    return new GoogleResultsPage(driver);
  }

  public GoogleResultsPage searchInGoogleFeelingLucky(String seacrhTxt) {
    searchBox.sendKeys(seacrhTxt);
    feelingLuckyButton.click();
    return new GoogleResultsPage(driver);
  }

  @Override
  public boolean isLoaded() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOf(doddle));
      return true;
    } catch(RuntimeException exception) {
      return false;
    }
  }

}