package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.espn.com.mx");

        // Wait some seconds
        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        assert myDriver.getCurrentUrl().equals("https://www.espn.com.mx") : "Pagina equivocada";

        List<WebElement> leagues = myDriver.findElements(By.cssSelector("h2[class='scoreLabel_title']"));
        List<WebElement> homeWinnerScores = myDriver.findElements(By.xpath("//div[@class='scoreboard active']/div[contains(@class,'home')]" +
                "//li[contains(@class,'home')]//div[contains(@class,'update')]"));
        List<WebElement> homeWinnerNames = myDriver.findElements(By.xpath("//div[@class='scoreboard active']/div[contains(@class,'home')]" +
                "//li[contains(@class,'home')]//span[contains(@class,'long')]"));
        List<WebElement> awayWinnerScores = myDriver.findElements(By.xpath("//div[@class='scoreboard active']/div[contains(@class,'away')]" +
                "//li[contains(@class,'away')]//div[contains(@class,'update')]"));
        List<WebElement> awayWinnerNames = myDriver.findElements(By.xpath("//div[@class='scoreboard active']/div[contains(@class,'away')]" +
                "//li[contains(@class,'away')]//span[contains(@class,'long')]"));

        System.out.println("Los nombres de las ligas son: ");
        for (WebElement league : leagues) {
            System.out.println(league.getAttribute("textContent"));
        }

        System.out.println("Los equipos ganadores fueron: ");
        for (int i = 0; i < homeWinnerNames.size(); i++) {
            System.out.println(homeWinnerNames.get(i).getAttribute("textContent") + " con "
                    + homeWinnerScores.get(i).getAttribute("textContent").trim() + " puntos");
        }
        for (int i = 0; i < awayWinnerNames.size(); i++) {
            System.out.println(awayWinnerNames.get(i).getAttribute("textContent") + " con "
                    + awayWinnerScores.get(i).getAttribute("textContent").trim() + " puntos");
        }

        // "h2[class='scoreLabel_title']"
        // "//div[@class='scoreboard active']/div[contains(@class,'home')]//li[contains(@class,'home')]//div[contains(@class,'update')]"
        // "//div[@class='scoreboard active']/div[contains(@class,'away')]//li[contains(@class,'away')]//div[contains(@class,'update')]"
        // "//div[@class='scoreboard active']/div[contains(@class,'away')]//li[contains(@class,'away')]//span[contains(@class,'long')]"
        // "//div[@class='scoreboard active']/div[contains(@class,'home')]//li[contains(@class,'home')]//span[contains(@class,'long')]"

        myDriver.close();
        myDriver.quit();
    }


}
