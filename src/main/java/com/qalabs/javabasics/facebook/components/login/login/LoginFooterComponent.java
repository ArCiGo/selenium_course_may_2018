package com.qalabs.javabasics.facebook.components.login.login;

import com.qalabs.javabasics.facebook.components.login.FacebookComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginFooterComponent extends FacebookComponent {
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[1]")
    private WebElement langEspanolAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[2]/a")
    private WebElement lanEnglishAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[3]/a")
    private WebElement langPortugesAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[4]/a")
    private WebElement langFrancesAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[5]/a")
    private WebElement langItalianoAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[6]/a")
    private WebElement langGermanAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[7]/a")
    private WebElement langArabicAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[8]/a")
    private WebElement langJapaneseAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[9]/a")
    private WebElement langHindiAElement;
    @FindBy(how = How.XPATH, using = "//*[@id='pageFooter']/ul/li[10]/a")
    private WebElement langChineseAElement;

    public LoginFooterComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}