package com.qalabs.seleniumbasics.googleproject;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

public class BaseTest {
  protected WebDriver driver;

  @BeforeClass (alwaysRun=true)
  public void setup(){
    //define which browser to use
    String browser= "chrome";
    //get corrent driver for disere browser
    driver= WebDriverFactory.getDriver(browser);
  }
  @AfterClass (alwaysRun=true)
  public void tearDown(){
    driver.close();
    driver.quit();
  }
}
