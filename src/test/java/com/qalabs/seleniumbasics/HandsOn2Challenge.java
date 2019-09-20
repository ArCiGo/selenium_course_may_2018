package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2Challenge {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "firefox";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assert myDriver != null;
        myDriver.get("https://www.espn.com.mx");

        List<WebElement> allLeagues = myDriver.findElements(By.xpath("//div[@class='scoreboard-dropdown-wrapper scoreboard-menu']")); //#global-scoreboard .wrap .scoreboard-content .scores-carousel #leagues
        for (WebElement list : allLeagues) {
            System.out.println("- " + list.getText());
        }
        //scoreLabel_content
      /*  WebElement places = myDriver.findElement(By.xpath("//a[contains(text(),'Places')]"));
        places.click();

        WebElement searchBox = myDriver.findElement(By.cssSelector("#q"));
        searchBox.sendKeys("Colomos, Guadalajara");

        WebElement srchBtn = myDriver.findElement(By.xpath("//input[@value='Search']"));
        srchBtn.click();

       */


      //  myDriver.close();
    }

}
