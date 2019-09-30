package com.qalabs.javabasics.facebookproject.componets.login;

import com.qalabs.javabasics.facebookproject.componets.FacebookComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBodyComponent extends FacebookComponent {

    @FindBy(how = How.XPATH, using = "//*[@id='u_0_m'/img")
    private WebElement fbRecentSession;
    @FindBy(how = How.ID, using = "u_0_q")
    private WebElement fbNameInputElement;
    @FindBy(how = How.ID, using = "u_0_s")
    private WebElement fbLastNameInputElement;
    @FindBy(how = How.ID, using = "u_0_v")
    private WebElement fbEmailInputElement;
    @FindBy(how = How.ID, using = "u_0_12")
    private WebElement fbPasswordInputElement;
    @FindBy(how = How.ID, using = "day")
    private WebElement fbDayInputElement;
    @FindBy(how = How.ID, using = "month")
    private WebElement fbMonthInputElement;
    @FindBy(how = How.ID, using = "year")
    private WebElement fbYearInputElement;
    @FindBy(how = How.XPATH, using = "//*[@id='u_0_15']/span[1]/label")
    private WebElement fbWomanInputElement;
    @FindBy(how = How.XPATH, using = "//*[@id='u_0_15']/span[2]/label")
    private WebElement fbManInputElement;
    @FindBy(how = How.XPATH, using = "//*[@id='u_0_15']/span[3]/label")
    private WebElement fbPersoInputElement;
    @FindBy(how = How.ID, using = "u_0_19")
    private WebElement fbCheckInButtonElement;

    public LoginBodyComponent(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}
