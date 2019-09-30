package com.qalabs.javabasics.googleproject.page;

import com.qalabs.javabasics.googleproject.components.ResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleResultsPage extends BasePage {

  @FindBy(how = How.ID, using = "lst-ib")
  private WebElement searchBox;

  @FindBy(how = How.NAME, using = "btnG")
  private WebElement searchButton;

  private List<ResultItem> resultItems;

  @FindBy(how = How.ID, using = "pnnext")
  private WebElement nextButton;

  @FindBy(how = How.ID, using = "pnprev")
  private WebElement prevButton;

  public GoogleResultsPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
    initResults();
  }

  private List<ResultItem> initResults() {
    List<WebElement> results = driver.findElements(By.xpath("//*[@class='srg']//*[@class='g']"));

    for(WebElement element : results) {
      resultItems.add(new ResultItem(element));
    }

    return resultItems;
  }

  public GoogleResultsPage searchInGoogle(String searchTxt) {
    searchBox.sendKeys(searchTxt);
    searchButton.click();
    return new GoogleResultsPage(driver);
  }

  public String clickOnResultByIndex(int index) {
    if(index > 0) {
      ResultItem resultItem = resultItems.get(index);
      resultItem.click();
      return driver.getCurrentUrl();
    } else {
      return null;
    }
  }

  public String clickOnResultByTitle(String title) throws InterruptedException {
    for(ResultItem resultItem : resultItems) {

      if(resultItem.getDescription().contains(title)) {
        System.out.println(title);
        resultItem.click();
        Thread.sleep(3000);
        return driver.getCurrentUrl();
      }
    }

    return null;
  }

  public boolean verifyResultByIndex(int index, String wordToValidate) {
    if(index > 0) {
      ResultItem resultItem = resultItems.get(index);

      System.out.println(resultItem.getDescription());

      if(resultItem.getDescription().contains(wordToValidate)) {
        System.out.println("Result contains " + wordToValidate);
        return true;
      }

      return false;
    } else {
      return false;
    }
  }

  public GoogleResultsPage clickOnNextButton() {
    if(nextButton.isDisplayed()) {
      nextButton.click();
      return new GoogleResultsPage(driver);
    }

    return null;
  }

  public GoogleResultsPage clickOnPrevButton() {
    if(prevButton.isDisplayed()) {
      prevButton.click();
      return new GoogleResultsPage(driver);
    }

    return null;
  }

  @Override
  public boolean isLoaded() {
    try {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.visibilityOf(nextButton));
      return true;
    } catch(RuntimeException exception) {
      System.out.println("Google results page is not loaded");
      return false;
    }
  }
}